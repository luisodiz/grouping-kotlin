package generics

// Типы продуктов
open class Food

class VeganFood : Food()

// Продавцы
interface Seller<out T>

class FoodSeller : Seller<Food>

class VeganFoodSeller : Seller<VeganFood>

// Потребители
interface Consumer<in T>

class Person : Consumer<Food>

class Vegan : Consumer<VeganFood>

fun main() {
    var foodSeller: Seller<Food>
    foodSeller = VeganFoodSeller()

    var veganFoodConsumer: Consumer<VeganFood>
    veganFoodConsumer = Vegan()
    veganFoodConsumer = Person()
}