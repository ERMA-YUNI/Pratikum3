package id.ac.polbeng.ErmaYuni.test_kelas

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int = name.length.also {
        println("Initializing size in base: $it")
    }
}
class Derived(name: String,val lastName: String) :
        Base(name.capitalize().also { println("Argument for base: $it") }) {
    init {
        println("Initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also {
        println("initalizing size in Derived:$it")
    }
}
fun main(){
    val  turunan = Derived("Depandi","Enda")
    turunan.size
    }
