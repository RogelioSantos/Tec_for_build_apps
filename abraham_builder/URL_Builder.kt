class URLBuilder: URLInterface {
    private var protocol:String? = null
    private var hostname:String? = null
    private var port:String? = null
    private var paths:MutableList<String> = mutableListOf<String>()
    private var queryParameters:MutableMap<String, String> = mutableMapOf()

    override fun setProtocol(protocol: String) {
        this.protocol = protocol
    }

    override fun setHostname(hostname: String) {
        this.hostname = hostname
    }

    override fun setPort(port: String) {
        this.port = port
    }

    override fun addPath(path: String) {
        paths.add(path)
    }

    override fun addQueryParameter(key: String, value: String) {
        queryParameters[key] = value
    }

    override fun build(): String {
        var url = StringBuilder()

        this.protocol?.let {url.append("$protocol://") }
        this.hostname?.let {url.append(hostname) }
        this.port?.let {url.append(":$port") }

        if (this.paths.isNotEmpty()){
            this.paths.forEach { path ->
                url.append("/$path")
            }
        }



    }



    private fun encode(value: String): String {
        return java.net.URLEncoder.encode(value, "UTF-8")
    }
}