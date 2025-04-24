package collections.homework

abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class PetOwner<T : Pet>(t: T) {
    val pets = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}

interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Продал кота")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Продал собаку")
        return Dog("")
    }
}

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Продал рыбу")
        return Fish("")
    }
}

fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

//    val catOwner = PetOwner(catFuzz)
    val catRetailer = CatRetailer()
    val dogRetailer = DogRetailer()

    val dogRetailer2: Retailer<Dog> = DogRetailer()
    val catRetailer2: Retailer<Cat> = CatRetailer()

//    val petRetailer: Retailer<Pet> = CatRetailer() - ошибка, хотя Cat реализует Pet
}