package id.ac.polbeng.ErmaYuni.test_kelas

class  OuterA {
    val a = "Outside Nested clas."

    inner class Inner {
        fun callme() = a
    }
}
fun main(){
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callme()}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callme()}")
}