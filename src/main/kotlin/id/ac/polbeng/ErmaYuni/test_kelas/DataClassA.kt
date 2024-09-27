package id.ac.polbeng.ErmaYuni.test_kelas

data class Student(val name: String, val age: Int )

fun main(){
    val boni = Student("boni", 21)
    val meri = Student("meri",20)
    println("student Name is : ${boni.name}")
    println("stdent Age is: ${boni.age}")
    println("student name is: ${meri.name}")
    println("student Age is: ${meri.age}")
}