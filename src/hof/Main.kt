package hof

data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    println("highestUnitPrice: $highestUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy({ it.quantity })
    println("sumQuantity: $sumQuantity")
    val totalPrice = groceries.sumByDouble({ it.quantity * it.unitPrice })
    println("totalPrice: $totalPrice")

    // По цене больше 3
    val unitPriceOver3: List<Grocery> = groceries.filter { it.unitPrice > 3 }
    // количество != 2
    val filteredGroceryLessThenTwo: List<Grocery> = groceries.filterNot { it.quantity != 2 }

    /*    val ints = listOf(1, 2, 3, 4)
        val doubleInts: List<Int> = ints.map { it * 2 }

        val groceryNames = groceries.map { it.name }

        val newPrices: List<Double> = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
        println(newPrices)*/

    // Можно перебирать через цикл for, а можно через forEach
    /*for (item in groceries) {
        println(item.name)
    }*/

//    groceries.forEach { println(it.name) }

    // forEach удобен в цепочке вызовов
    groceries.filter { it.unitPrice > 3.0 }.forEach { println(it.name) }

    /*    var itemNames = ""
        groceries.forEach { itemNames += "${it.name} " }
        println("itemNames: $itemNames")*/

//    Группировка через groupBy
//    val groupByCategory: Map<String, List<Grocery>> = groceries.groupBy { it.category }
//    println(groupByCategory)

    // groupBy возвращает Map
    groceries.groupBy { it.category }.forEach { entry ->
        println(entry.key) // ключом будет строка в данном случае
        entry.value.forEach { println("    ${it.name}") } // Так как каждое значение это List<Grocery>, то можно пройтись forEach
    }

    // Функция fold
    val ints = listOf(1, 2, 3)
    val sumOfInts: Int = ints.fold(0) { runningSum, item -> runningSum + item }

    // умножение всех элементов меж собой
    ints.fold(1) { runningProduct, item -> runningProduct * item }
    groceries.fold("") { string, item -> string + " ${item.name}" }
    groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
}