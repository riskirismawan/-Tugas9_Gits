fun main() {
    val newClass = Outer()
    val newInnerClass = Outer.Inner()

    newClass.tampil()
    newInnerClass.tampil()
}

class Outer {
    val diluar = "Class luar"
    val innerClass = Inner()
    fun tampil() {
        println("$diluar memanggil fungsi pada ${innerClass.tampil()}")
    }

    class Inner {
        val didalam = "Class dalam"
        fun tampil() {
            println(didalam)
        }
    }
}