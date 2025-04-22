package collections

fun main() {
    val shopping: List<String> = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
        try {
            println(shopping.get(20))
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("Индекс больше длины коллекции")
        }
    }

    // перебор коллекции
    for (item in shopping) {
        println(item)
    }

    // Проверка содержит ли коллекция ссылку на конкретный элемент и вернуть индекс если ок или -1 если нету
    if (shopping.contains("Milk")) {
        println(shopping.indexOf("Milk"))
    }

    // -1
    println(shopping.indexOf("Banana"))

    // List с возможностью обновления элементов - MutableList
    val mShopping = mutableListOf("Tea", "Eggs")
//    println(mShopping.size)
    mShopping.add("Milk")
//    println(mShopping.size)
    mShopping.add(1, "Coffee")
//    for (item in mShopping) {
//        println(item)
//    }

    if (mShopping.contains("Milk")) {
        mShopping.remove("Milk")
    }

    if (mShopping.size > 1) {
        mShopping.removeAt(1) // удалить элемент под индексом 1
    }
    // При удалении автоматически уменьшается размер

    if (mShopping.size > 0) {
        mShopping.set(0, "Bred")
    }

    for (item in mShopping) {
        println(item)
    }
}