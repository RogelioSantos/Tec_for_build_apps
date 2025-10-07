class Employee (
    private val ID: Int,
    private val name: String,
    private val hoursWorked: Int,
    private val salary: Double

){
    fun calculatePay(){
        val ordinaryHours = regularHours()
        return (hoursWorked * ordinaryHours).toDouble()

    }

    fun reportHours(){
        val ordinaryHours = regularHours()
        return "Employee $name worked $hoursWorked hours at a rate of $ordinaryHours per hour."

    }

    fun saveEmployee(){
        print("Saving employee $name with ID $ID to the database.")
    }

    private fun regularHours(): Int {
        return if (hoursWorked > 35) 35 else hoursWorked
    }
}