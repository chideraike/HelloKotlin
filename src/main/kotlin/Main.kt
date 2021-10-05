//
//fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")
//
//fun main() {
//    val interestingThings = arrayOf("Kotlin", "JavaScript", "Comic Book")
//    println(interestingThings.size)
//}

fun main() {
    val firstName = "Chidera" // val -> Cannot change
    var weight = 160 // var -> Can change
    val decimalVariable: Double = 2.5
    val booleanVariable: Boolean = true
    // I am a comment!

    val s1 = "Call me"
    val s2 = " maybe"
    val combined = s1 + s2
    println(combined)

    val myString = "KOTLIN"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2, 4))
    println("The string is $myString")

    val examScore = 55
    if (examScore > 70) {
        println("You passed!")
    } else {
        println("You failed :(")
    }

//    val names = listOf("Ali", "Maya", "Chen")
    val names = mutableListOf<String>("Ali", "Maya", "Chen")
    println(names[2])
    names.add("Chidera")
    println(names)
    for (name in names) {
        println(name)
    }
    for (i in 1..5) {
        println(i)
    }
    for (i in 1 until 5) {
        println(i)
    }

    myFunction("Jay")
    myFunction("Chidera")

    val instagramBio: String? = "iamcool"
    if (instagramBio != null) {
        println(instagramBio.uppercase())
    }
    println(instagramBio?.uppercase())
}

//fun myFunction(name: String){
//    println("hello, $name")
//}

private fun myFunction(name: String){ // private -> can't be access from other files
    println("hello, $name")
}