package id.ac.polbeng.ErmaYuni.test_kelas

interface  A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interfance B")
    }
}
class  myClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}
fun main(){
    val obj = myClassB()
    obj.demo()


    }

