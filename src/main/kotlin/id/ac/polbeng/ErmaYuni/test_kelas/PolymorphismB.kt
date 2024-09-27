package id.ac.polbeng.ErmaYuni.test_kelas

open class myBase {
    open fun think() {
        println("Hey!! i am thinking")
    }
}
class myDerived: myBase() {
    override fun think() {
        println("I am from child")
    }
}
fun main(){
    val myBase = myBase()
    myBase.think()
    var myDerived = myDerived()
    myDerived.think()

    }
