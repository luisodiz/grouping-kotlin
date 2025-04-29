package hof.ex

data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)

fun main() {
    val ints = listOf(1, 2, 3)

    /*val pizzas = listOf(
        Pizza("Sunny Chicken", 4.5, 4),
        Pizza("Goat and Nut", 4.0, 1),
        Pizza("Tropical", 3.0, 2),
        Pizza("The Garden", 3.5, 3)
    )

//    val minInt = ints.minBy { it.value } // Ошибка
    val minInt2 = ints.minBy { int: Int -> int }
    val sumInts = ints.sum()
    val sumInts2 = ints.sumBy { it }
//    val sumInts3 = ints.sumByDouble { number: Double -> number } // Ошибка
    val sumInts4 = ints.sumByDouble { int: Int -> int.toDouble() }

//    val lowPrice = pizzas.min() Ошибка
    val lowPrice2 = pizzas.minBy({ it.pricePerSlice })
    val highQuantity = pizzas.maxBy { p: Pizza -> p.quantity }
    val highQuantity2 = pizzas.maxBy({ it.quantity })
//    val totalPrice = pizzas.sumBy { it.pricePerSlice * it.quantity } // Ошибка
    var totalPrice2 = pizzas.sumByDouble { it.pricePerSlice * it.quantity }*/

}