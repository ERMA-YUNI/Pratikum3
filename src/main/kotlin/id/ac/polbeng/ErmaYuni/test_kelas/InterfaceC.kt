package id.ac.polbeng.ErmaYuni.test_kelas

interface x {
    fun demoX() {
        println("demoX function")
    }

    fun funcX()
}
interface Y {
    fun demoY() {
        println("demoY function")
    }

    fun funcY()
}
class  MyClassA: x, Y {
    override fun funcX() {
        println("hello")
    }

    override fun funcY() {
        println("Hi")
    }

    fun main() {
        val obj = MyClassA()
        obj.demoX()
        obj.demoY()
        obj.funcX()
        obj.funcY()

    }
}

