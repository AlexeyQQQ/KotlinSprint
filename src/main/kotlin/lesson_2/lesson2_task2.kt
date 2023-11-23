package lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryOfEmployees = 30_000
    val salaryOfInterns = 20_000

    val employeeExpenses = numberOfEmployees * salaryOfEmployees
    val totalExpenses = employeeExpenses + (numberOfInterns * salaryOfInterns)
    val averageSalary = totalExpenses / (numberOfEmployees + numberOfInterns)

    println(employeeExpenses)
    println(totalExpenses)
    println(averageSalary)
}