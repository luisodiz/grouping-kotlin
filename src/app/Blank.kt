/*
package app

fun myFunction(str: String) {
    try {
//        val x = str.toShort()
//        println(x)
        throw AnimalException()
    } catch (e: Exception) {
        println("Bummer")
        println(e.message)
        println(e.cause)
        e.printStackTrace()
    } finally {
        println("Выполнится всегда")
    }

    println("My function has ended")
}

class AnimalException : Exception("Свой title для ошибки") {}

fun setWorkRatePercentage(x: Int) {
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }
}

fun main() {
//    myFunction("hello world") // exception

    try {
        setWorkRatePercentage(110)
    } catch (e: IllegalArgumentException) {
        println(e.message)
        println(e.cause)
    }

    var str = "hello world"

    val result: Int? = try {
        str.toInt()
    } catch (e: Exception) {
        null
    } // Если все ОК, то присвоить str.toInt(), если нет, то null

    val x = null // тип будет Nothing?
}*/
