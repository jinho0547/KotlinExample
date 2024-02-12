package org.example.inheritance

//상속을 위한 부모클래스에는 open 키워드가 붙는다
open class Car(val name:String, val price:Int, val brand:String) {
    fun introduce(){
        println("${brand}에서 나온 ${name} 차량입니다.")
    }

    fun howMuch(){
        println("이 차의 가격은 ${price}원 입니다.")
    }

    //마찬가지로 함수의 오버라이딩이 필요한 경우 함수 앞에 open 키워드를 붙여준다.
    open fun myPurchaseDate(){
        println("아직 구입하지 않으셨습니다.")
    }

    open fun compare(otherCar: Car){
        println("${this.name}과 ${otherCar.name}을 비교합니다.")
        println("가격은")
        if (this.price > otherCar.price){
            println("${this.name}의 가격이 ${this.price - otherCar.price} 만큼 더 비쌉니다")
        } else {
            println("${otherCar.name}의 가격이 ${otherCar.price - this.price} 만큼 더 비쌉니다")
        }
        println("")
        if(this.brand == otherCar.brand){
            println("두 차량 모두 ${this.brand}의 차량입니다.")
        } else{
            println("${this.name}은 ${this.brand}의 차량이고,")
            println("${otherCar.name}은 ${otherCar.brand}의 차량입니다.")
        }
    }
}