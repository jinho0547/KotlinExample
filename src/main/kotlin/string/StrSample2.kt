package org.example.string

fun main() {
    println("//////////////////////////////////////////////////")
    val nullStr : String? = null
    val emptyStr : String = ""
    val blank = " "
    val aStr = "A"
    println("//////////////////////////////////////////////////")
    println(nullStr.isNullOrEmpty())
    println(emptyStr.isNullOrEmpty())
    println(blank.isNullOrEmpty())
    println(aStr.isNullOrEmpty())
    println("//////////////////////////////////////////////////")
    println(nullStr.isNullOrBlank())
    println(emptyStr.isNullOrBlank())
    println(blank.isNullOrBlank())
    println(aStr.isNullOrBlank())
    println("//////////////////////////////////////////////////")
}