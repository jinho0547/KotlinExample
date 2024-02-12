package org.example.condition

class Condition {
}
fun main(){
    var a = 4
    var b = 6

    //if문은 자바와 동일
    if(a < b){
        println("True")
    }else{
        println("False")
    }

    //코틀린은 switch문 대신 when 문
    //가장 처음에 부합하는 구절만 실행
    when(a){
        3 -> println("a = ${a}")
        in 4..6 -> println("4 <= a <= 6 ")
        4 -> println("위 조건에 먼저 부합하므로 해당 구문은 실행되지 않는다")
        is Int -> "정수형 데이터에 호환 가능합니다."
        !is Int -> "정수형 데이터가 아닙니다."
        else -> "전부 아니다"
    }
}
