package app

class Wolf {
    var hunger: Int? = 10
    val food = "Meat"

    fun eat() {
        println("The wolf is eating $food")
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}

fun main(args: Array<String>) {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("the value of x is $x")

    var y = w?.hunger ?: -1
    println("the value of y is $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("the value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("hi", "hello", null)

    for (item in myArray) {
        item?.let { println(it) }
    }

    getAlphaWolf()?.let { it.eat() }

    w = null
//    var z = w!!.hunger
//    w!!.hunger
}