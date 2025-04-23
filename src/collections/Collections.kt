package collections

fun main() {
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("original mShoppingList: $mShoppingList")

    val extraShoppingList = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShoppingList)
    println("mShoppingList items added: $mShoppingList")

    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val firstArr = arrayOf(1, 2, 3)
    val secondArr = arrayOf(1, 2, 3)

    println(firstArr === secondArr)

    /*
    * как Set проверяет наличие дубликатов:
    * 1 - Set получает хэш код объекта и сравнивает с другими хэш кодами объектов. Если совпадений нет, то не дубликат, иначе ко второму шагу
    * 2 - использует === для проверки по ссылке. Если false, то переходит к шагу 3
    * 3 - использует == (equals()), если true, то дубликат
    * */
}