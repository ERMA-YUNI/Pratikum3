package id.ac.polbeng.ErmaYuni.test_kelas

import java.text.NumberFormat
import java.util.*

open  class EmployeeD {
    open val baseSalary: Int = 300000
}
class  Programmer : EmployeeD() {
    override val baseSalary: Int = 5000000
}
class SoftwareEngineer : EmployeeD() {
    override val baseSalary: Int = 600000
}
class  ProjectManager : EmployeeD() {
    override val baseSalary: Int = 800000
}
fun toRupiahFormat(baseSalary: Int) : String {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary).toString()
}
fun main() {
    val employee = EmployeeD()
    println("Rata-rata gaji ${employee.javaClass.simpleName} = ${toRupiahFormat(employee.baseSalary)}")

    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} =${toRupiahFormat(programmer.baseSalary)}")

    val softwareEngineer = SoftwareEngineer()
    println("Rata-rata gaji ${softwareEngineer.javaClass.simpleName} =${toRupiahFormat(softwareEngineer.baseSalary)}")

    val projectManager = ProjectManager()
    println("Rata-rata gaji ${projectManager.javaClass.simpleName} =${toRupiahFormat(projectManager.baseSalary)}")
}