class Acuario {
    var ancho: Int = 20
    var alto: Int = 40
    var largo: Int = 100

    fun imprimirTamano() {
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
    }
}

fun construirAcuario() {
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()
}

fun main() {
    construirAcuario()
}
