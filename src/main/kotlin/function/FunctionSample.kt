package org.example.function

fun main(){

}

fun add(a:Int, b:Int, c:Int) :Int{
    return a+b+c
}


//단일표현식 함수로 표현가능, 단일표현식의 경우 타입추론이 가능하므로 리턴 자료형 생략이 가능하다
fun add2(a:Int, b:Int, c:Int) = a + b + c