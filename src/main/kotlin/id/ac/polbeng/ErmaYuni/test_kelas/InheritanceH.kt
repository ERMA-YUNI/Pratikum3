package id.ac.polbeng.ErmaYuni.test_kelas

open class Rectangle {
    open fun draw() {
        println("from base class rectangle")
    }
}
interface  Polygon {
    fun draw() {
        println("From interface polygon")
    }
}
class  Square() : Rectangle(), Polygon {
    override fun draw() {

    }
}
fun main(){
    val Square = Square()
    Square.draw()
    }


