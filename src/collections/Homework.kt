package collections

fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val allPets: MutableList<String> = mutableListOf()
    allPets.addAll(petsLiam)
    allPets.addAll(petsSophia)
    allPets.addAll(petsNoah)
    allPets.addAll(petsEmily)

    println("list: $allPets")
    println("size: ${allPets.size}")

    val allPetsSet = allPets.toSet()
    println("Set size: ${allPetsSet.size}")

    val allPetsSortedAlphabet = allPetsSet.toMutableList()
    allPetsSortedAlphabet.sort()
    println("Set sorted: $allPetsSortedAlphabet")
}