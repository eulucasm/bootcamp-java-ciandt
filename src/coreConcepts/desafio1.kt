fun main(args : Array<String>) {

    val date = Pair(18, 1)
    println("date = $date")

    val (dia, mes) = date
    println("dia = $dia mes = $mes")

    val diaMesAno = Triple(18, 1, 2022)

    val (d, m, a) = diaMesAno
    println("dia = $d / mes = $m / ano = $a")
}