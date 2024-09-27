package id.ac.polbeng.ErmaYuni.test_kelas

class  Outer {
    val a = "Outside nasted class."

    class Nasted {
        val b = "Inside Nasted class."
        fun callme() = "function call from inside Nested class."
    }
}
fun main(args: Array<String>){
    println(Outer.Nasted().b)
    val nested = Outer.Nasted()
    println(nested.callme())

    }
