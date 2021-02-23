
fun main(){
    val a = 2
    val b = 4
    var an:Int?= null
    var bn:Int? = null
    var cn:Int? = 10
    var result:Int
    val ano = (2000..2021).random()
    val Max_value = if(a < b) b else if(a > b) a else a
    println("O maior valor é : " + Max_value)
    println(ano.anorandom())
    result = nulidade(an,bn,cn)
    println("O valor final de an é: $result")
}

fun Int.anorandom():String{
    println("O ano escolhido foi $this")
    return when(this){
        in 2004..2021 -> "Menor de idade "
        2000 -> "21 anos"
        2001 -> "20 anos"
        2002 -> "19 anos"
        else -> "18 anos"
    }
}

fun nulidade(a:Int?,b:Int?,c:Int?):Int{
    var a = b?:c?: 3
    return a
}

