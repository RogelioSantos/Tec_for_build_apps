class PayCalculator{
    fun calculatePay(Employee): Double{
        val ordinaryHours = regularHours(Employee)
        val nonOrdinaryHours = employee.hoursWorked - nonOrdinaryHours
        return (ordinaryHours * Employee.salary) + (nonOrdinaryHours * Employee.salary * 1.5)
    }

    private fun regularHours(Employee): Int {
        return if (Employee.hoursWorked > 35) 35 else Employee.hoursWorked
    }
}