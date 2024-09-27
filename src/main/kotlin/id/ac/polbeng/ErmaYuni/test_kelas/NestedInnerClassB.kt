package id.ac.polbeng.ErmaYuni.test_kelas

fun main() {
    var programmer: Human = object : Human {
        override fun think() {
            println("I am an example of Anonymous Inner class")
        }
    }
    programmer.think()
}
interface Human {
    fun think()
        }

