package id.ac.polbeng.ErmaYuni.test_kelas

open  class Rectangle {
    open fun draw() {
        println("From base class Rectangle")
    }
}
interface  Polygon {
    fun draw() {
        println("from interfance polygon")
    }
}
class  Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}
fun main(){
    val square = Square()
    square.draw()
    }
