package org.example.string

fun main() {
    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith("kt"))
    println(test4.endsWith("kt"))

    println(test3.contains("tlin"))
    println(test4.contains("tlin"))

}