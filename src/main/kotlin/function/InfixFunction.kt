package org.example.function

fun main(){
    // infix 함수는 일반 연산자처럼 사용이 가능하다
    // 6 -> this , 4 -> x
    println (6 multiply 4)
    //일반 함수처럼 사용도 가능하다
    println(6.multiply(4))
}


//클래스 안에서 infix 선언할 떄에는 적용할 함수가 자기 자신이므로 클래스 이름은 생략이 가능하다.
//infix fun multiply(x: Int): Int = this * x
infix fun Int.multiply(x: Int): Int = this * x