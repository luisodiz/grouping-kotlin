package collections


data class User(val name: String)

fun main() {
    val u1 = User("Ivan")
    val u2 = User("Alexander")
    val u3 = User("Oleg")

    val usersMap = mapOf("User1" to u1, "User2" to u2, "User3" to u3)

    // Проверка ключа
    println(usersMap.containsKey("User1"))

    // Проверка на значение (предполагается что User это data класс)
    println(usersMap.containsValue(u2))

    if (usersMap.containsKey("Ivan")) {
        val userIvan = usersMap.getValue("Ivan") // либо пользователь либо NoSuchElementException
        val userIvan2 = usersMap.get("Ivan") // либо пользователь либо null, то есть тип User?
    }

    // Перебор через for
    for ((key, value) in usersMap) {
        println("Key: $key, Value: $value")
    }

    // Map - неизменяем; добавлять, обновлять ничего нельзя. Надо юзать MutableMap
    val mutableUsersMap = mutableMapOf("User1" to u1, "User2" to u2) // MutableMap<String, User>

    // Добавление элементов в MutableMap
    mutableUsersMap.put("User3", u3)
    // либо
    mutableUsersMap["User4"] = u3

    // Добавление сразу нескольких пар - значений
    val extraUsersMap = mapOf("User5" to u2, "User6" to u1)
    mutableUsersMap.putAll(extraUsersMap)

    // Удаление ТОЛЬКО по ключу
    mutableUsersMap.remove("User3")
    // Удаление только если ключ и значение соответствуют
    mutableUsersMap.remove("User1", u1)

    println("Map: $mutableUsersMap")

    // Для полной очистки используют clear
//    mutableUsersMap.clear()
//    println(mutableUsersMap)

    val mapSnapshot = mutableUsersMap.toMap() // создат map, которую нельзя изменять
    val mapSnapshotList = mutableUsersMap.toList() // list, который нельзя изменять
    println("mapSnapshotList: $mapSnapshotList")

    // entries - доступ к ключ-значению. Если обычный Map который нельзя изменять, то вернет Set, для MutableMap вернет MutableSet
    val mapEntries = mutableUsersMap.entries // Вернет MutableSet<MutableMap.MutableEntry<String, User>>
    println(mapEntries)

    val mapEntries2 = mapSnapshot.entries // Вернет обычный Set<Map.Entry<String, User>>
    println(mapEntries2)

    val mutableMapKeys = mutableUsersMap.keys
    println("mutableMapKeys MutableSet<String>: $mutableMapKeys")

    val mutableMapValues = mutableUsersMap.values
    println("mutableMapValues MutableCollection<User>: $mutableMapValues")

    val mapKeys = usersMap.keys
    println("mapKeys это Set<String>: $mapKeys")

    val mapValues = usersMap.values
    println("mapValues Collection<User>: $mapValues")

    // Проверка на дубликаты в Map
    if (usersMap.size > usersMap.values.toSet().size) {
        println("usersMap имеет дубликаты значений")
    }
}

/*
fun main() {
    val mFriendSet = mutableSetOf("Jim", "Sue")

    mFriendSet.add("Nick")
    mFriendSet.remove("Nick")
}
*/

/*data class User(val name: String, val lastName: String)

// Set
fun main() {
    val friendSet = setOf("Jim", "Sue", "Sue", "Nick", "Nick") // Набор из уникальных значений Set<String>, дубликаты будут удалены
    println(friendSet)

    val isFredGoing = friendSet.contains("Fred")

    // Перебор через for
    for (friend in friendSet) {
        println("Friend: $friend")
    }

    val ivan = User("Иван", "Иванов")
    val alex = User("Иван", "Иванов")

    println("ivan hashCode: ${ivan.hashCode()}")
    println("alex hashCode: ${alex.hashCode()}")

    println(ivan === alex) // по ссылке, если она ведет на один и ту же область памяти (экземпляр). Так как User это data class, то хеш код одинаковый
    println(ivan == alex) // через equals() сравнивает, так как User это data class, то будет true

    // Если два объекта равны, то они должны иметь одинаковые hash code
    // Но два объекта могут иметь одинаковый hash code, но при этом не быть равными

    // При переопределении equals вы должны переопределить hashCode

    // По умолчанию hashCode генерирует уникальное целое число, если не переопределить hashCode, то объекты никогда не будут равны
    // По умолчанию equals() должна выполнять сравнение ===, то есть проверять, что две ссылки относятся к одному объекту.
    // Если не переопределить equals в классе, не являющимся классом даных, два объекта не будут считаться равными, так как ссылкам на два
    // разных объекта всегда будут содержаться разные наборы битов
}*/

/*


fun main() {
    val shopping: List<String> = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
        try {
//            println(shopping.get(20))
        } catch (e: ArrayIndexOutOfBoundsException) {
//            println("Индекс больше длины коллекции")
        }
    }

    // перебор коллекции
    for (item in shopping) {
//        println(item)
    }

    // Проверка содержит ли коллекция ссылку на конкретный элемент и вернуть индекс если ок или -1 если нету
    if (shopping.contains("Milk")) {
//        println(shopping.indexOf("Milk"))
    }

    // -1
//    println(shopping.indexOf("Banana"))

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

    println("В обратном порядке:")
//    mShopping.reverse()
//    println(mShopping)
    println(mShopping.reversed())

    mShopping.add("Banana")
    mShopping.add("Milk")
    mShopping.add("Coffee")

    println(mShopping.shuffled()) // отсортирован в случайном порядке
    println(mShopping.sorted()) // по возрастанию

    val toAdd = listOf("Sugar", "Cookies")
    mShopping.addAll(toAdd)
    println(mShopping)

    val toRemove = listOf("Milk", "Cookies")
    mShopping.removeAll(toRemove) // принимает коллекцию элементов, которые надо удалить
    println(mShopping)

    val toRetain = mutableListOf("Eggs", "Banana")
    mShopping.retainAll(toRetain) // оставить только те элементы, которые в коллекции toRetain
    println(mShopping)

    val shoppingCopy = mShopping.toList() // Копия MutableList в List, List нельзя изменять
    println(shoppingCopy)

    val shoppingCopyMutable: MutableList<String> = mShopping.sorted().toMutableList()

//    // очистка коллекции
//    mShopping.clear()
//    println(mShopping)
}*/
