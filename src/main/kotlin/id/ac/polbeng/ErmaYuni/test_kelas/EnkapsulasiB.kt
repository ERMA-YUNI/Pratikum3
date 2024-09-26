package id.ac.polbeng.ErmaYuni.test_kelas

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")

    // This will throw an exception since age is set to -1
    emp.age = -1
}
