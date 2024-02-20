package org.example.string





fun main() {
    val test1 = "Test.Kotiln.String"
    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)
    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))
    println(test1.substring(5,11))

}