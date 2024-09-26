package id.ac.polbeng.ErmaYuni.test_kelas

fun printNumber(n : Number) {
    println("using printNumber{n : number)")
    println(n.toString() + "\n")
}
fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}

fun main(){
    val a: Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}