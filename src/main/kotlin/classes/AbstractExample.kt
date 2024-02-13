package org.example.classes

abstract class Animal {
    abstract fun eat()

    fun sniff(){
        println("킁킁")
    }
}
class Rabit : Animal(){
    override fun eat() {
        println("당근을 먹습니다.")
    }
}
//원래 인터페이스는 추상클래스와 다르게 순수 추상화만 다루고 있는 클래스이나
//코틀린에서는 인터페이스도 구현된함수, 추상함수 모두 선언이 가능하며
//abstract, open 키워드가 없어도, 인터페이스 내의 모든 함수는
// 오버라이딩이 가능하다
//하지만 인터페이스는 생성자를 가질 수 없지만, 여러 인터페이스를 한번에 상속이 가능하다.


interface Runner{
    fun run()
}
interface Eater{
    fun eat(){
        println("음식을 먹습니다.")
    }
}
class Dog : Runner,Eater{
    override fun run() {
        println("와다다 달립니다.")
    }
    override fun eat() { // 인터페이스에 이미 구현된 함수, open 키워드가 붙지 않았지만 다시 정의 가능하다.
        println("허겁지겁 먹습니다.")
    }
}



fun main(){
    var a = Rabit()
    a.eat()
    a.sniff()

    var dog = Dog()

    dog.run()
    dog.eat()
}