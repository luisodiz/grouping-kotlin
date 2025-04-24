package collections

fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    val a: String? = null

/*    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)*/

    /*mList.addAll(mList)
    mList.reverse()

    val set = mList.toSet()
    println(set)*/

    mList.sort()
    mList.reverse()
    println(mList)
}

/*fun main() {
    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MutableList"
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Holds values in no particular order."
    val def2 = "Holds key/value pairs."
    val def3 = "Holds values in a sequence."
    val def4 = "Can be updated."
    val def5 = "Can't be updated."
    val def6 = "Can be resized."
    val def7 = "Can't be resized."

    val glossary = mapOf(
        "MutableList" to "$def3 $def4 $def6",
        "Set" to "$def1 $def5 $def7",
        "Array" to "$def3 $def4 $def7",
        "MutableMap" to "$def2 $def4 $def6",
        "List" to "$def3 $def5 $def7",
        "MutableSet" to "$def1 $def4 $def6",
        "Map" to "$def2 $def5 $def7"
    )

    for ((key, value) in glossary) println("$key: $value")

}*/

/*
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
}*/
