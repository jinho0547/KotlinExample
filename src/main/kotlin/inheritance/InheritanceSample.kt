package org.example.inheritance

import java.time.LocalDate


fun main(){
    var k5 = MyCar("K5",3000,"KIA", LocalDate.now())
    var k9 = MyCar("K9",8000,"KIA", LocalDate.now().minusDays(3))

    println("==========================")
    k5.introduce()
    k5.howMuch()
    k5.myPurchaseDate()
    println("==========================")
    k9.introduce()
    k9.howMuch()
    k9.myPurchaseDate()
    println("==========================")
    k5.compare(k9)
}