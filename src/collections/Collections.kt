package collections

data class Recipe(var name: String)

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

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $recipesToAdd")

    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }

    val x = mutableSetOf(1, 2) // MutableSet<Int>
    val y: Set<Int> = x // неизменяемое представление ИЗМЕНЯЕМОЙ коллекции, при этом при добавлении элемента в MutableSet оно так же по ссылке обновится в y
    x.add(3)
    println(y)
}