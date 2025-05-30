/*
package app

class Duck(val height: Int? = null) {
    fun quack() {
        println("Quack! Quack")
    }
}

class MyDucks(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            duck?.let {
                duck.quack()
            }
        }
    }

    fun totalDuckHeight(): Int {
        var h: Int = 0

        for (duck in myDucks) {
            h += duck?.height ?: 0
        }

        return h
    }
}*/


class BadException(message: String) : Exception(message)

fun myFunction(str: String) {
    try {
        if (str.equals("yes")) throw BadException("Ужасная строка")
    } catch (e: BadException) {
        println(e.message)
    }
}