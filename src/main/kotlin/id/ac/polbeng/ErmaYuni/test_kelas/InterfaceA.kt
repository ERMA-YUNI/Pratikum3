package id.ac.polbeng.ErmaYuni.test_kelas

interface  MyInterfance {
    var str: String
    fun demo()
    fun func() {
        println("Hello")
    }
}
class MyClass:MyInterfance {
    override var str: String = "rekayasa perangkat lunak"
    override fun demo() {
        println("Demo Function")
    }
}
fun main(){
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)


    }
