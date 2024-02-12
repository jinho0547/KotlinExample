package org.example.inheritance

import java.time.LocalDate

class MyCar(name:String, price:Int, brand:String, private val purchaseDate:LocalDate): Car(name,price,brand) { //상속하는 부모클래스의 생성자를 호출하여 상속받는다.
    //부모클래스의 open fun을 구현하기 위해 override fun 키워드를 통해 오버라이딩 할 수 있다.
    override fun myPurchaseDate() {
        println("이 차는 ${purchaseDate}에 구매하였습니다.")
    }

}