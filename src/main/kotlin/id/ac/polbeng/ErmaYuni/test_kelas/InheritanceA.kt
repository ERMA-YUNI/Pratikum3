package id.ac.polbeng.ErmaYuni.test_kelas

open class Computer(val name: String,
    val  brand: String)

class  laptop(name: String,
    brand: String,
    val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("name : $name")
        println("Brand : $brand")
        println("battery life : $batteryLife")
    }
}
fun main(){
    val mylaptop = laptop("Acer Aspire 4738","Acer", 2.5)
    println(mylaptop.info())
        }
