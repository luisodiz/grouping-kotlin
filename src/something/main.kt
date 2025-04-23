package something

fun main() {
    val user1 = User("1234", "Doe", 25)
    val user2 = User("1234", "Doe", 30)

//    println(user1 == user2)
    println(user1.equals(user2))
    println(user2.hashCode())
}