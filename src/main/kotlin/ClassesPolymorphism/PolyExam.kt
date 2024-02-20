package org.example.ClassesPolymorphism
/*  클래스의 다형성
*   cola는 Drink의 하위객체이기때문에 Drink 타입의 변수에 Cola를 생성할 수 있다.
*/

fun main(){
    var a = Drink()
    a.drink()

    var b:Drink = Cola()
    b.drink()

    //println("${b.type}")
    // Drink 타입에 Cola를 담았으므로 Drink에는 없는 type을 불러올 수 없다.
    //이를 위해선 Down-Casting이 필요하다
    if(b is Cola){ //if 문 안에서 한정 DownCasting 되어있다.
        b.washDishes()
        println("${b.type}")
    }

    // DownCasting 된 객체를 변수에 담아보자
    var c = b as Cola
    c.washDishes()
    println(c.type)
    b.washDishes() // as를 사용하면 반환값 뿐만아니라 해당 변수도 캐스팅된다.

}

open class Drink{
    var name="음료"
    open fun drink(){
        println("${name}을 마십니다.")
    }


}

class Cola:Drink(){
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}을 마십니다.")
    }

    fun washDishes(){
        println("${type}로 접시를 닦습니다.")
    }
}