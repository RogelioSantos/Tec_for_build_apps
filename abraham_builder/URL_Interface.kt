interface URLInterface{
    fun setProtocol(protocol: String)
    fun setHostname(hostname: String)
    fun setPort(port: String)
    fun addPath(path: String)
    fun addQueryParameter(key: String, value: String)
    fun build(): String
}