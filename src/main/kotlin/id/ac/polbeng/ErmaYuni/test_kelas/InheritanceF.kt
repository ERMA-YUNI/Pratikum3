package id.ac.polbeng.ErmaYuni.test_kelas

open class EmloyeeF {
    open val baseSalary: Double = 10000.0
    open fun displayDetails() {
        println("I am an Employee")
    }
}
class Developer : EmloyeeF() {
    override var baseSalary: Double = super.baseSalary + 10000.0
    override fun displayDetails() {
        super.displayDetails()
        println("I am a Developer")
    }
}
fun main(){
    val emloyeeF = EmloyeeF()
    println("${emloyeeF.javaClass.simpleName} base salary is ${emloyeeF.baseSalary}")
    println(emloyeeF.displayDetails())
    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    println(developer.displayDetails())
}