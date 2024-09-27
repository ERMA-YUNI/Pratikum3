package id.ac.polbeng.ErmaYuni.test_kelas

open class Mahasiswa(var nama: String, var nrp: Int) {
    open fun info() {
        println("$nama\n$nrp")
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    override fun info() {
        println("$nama\n$nrp\n$jurusan")
    }
}

fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")

    println(anton.toString())  // menggunakan toString bawaan Kotlin
    println()
    anton.info()
    println("Jenis kelas = ${anton.javaClass.simpleName}")

    println()
    budi.info()
    println("Jenis kelas = ${budi.javaClass.simpleName}")

    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()
    ucok.info()
    println("Jenis kelas = ${ucok.javaClass.simpleName}")
}
