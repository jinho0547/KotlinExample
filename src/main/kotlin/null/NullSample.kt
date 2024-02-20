package org.example.`null`
/*
 * 코틀린에서는 null-safe 이므로 null인 상태로 참조하면 컴파일되지 않는다.
 * 따라서 null 체크를 해주어야 하는데
 * if(temp != null)
 * 일일이 if 문이 아닌 다른방법으로 체크하는 방법이 있다.
 *
 * ?. (null safe operator)
 * temp.toUpperCase -> temp 가 null 이면 뒤의 구문을 실행하지 않는다.
 * ?: (elvis operator)
 * temp?:"default" -> temp 가 null 이면 "default"
 * !!. (non-null assertion operator)
 * temp!!.toUpperCase -> temp 가 null 일 경우에도 컴파일시 null 체크를 하지않도록 하며 런타임에서 nullPointException이 발생하도록 허용
 */


fun main() {
    var a:String? = null
//    println(a?.toUpperCase())
//    println(a?:"default".toUpperCase())
//    println(a!!.toUpperCase())
    a?.run {
        println(toUpperCase())
        println(toLowerCase())
        println("스코프 함수")
    } // a가 null 이므로 스코프 함수 전체가 실행되지 않는다.

    var b:String? = "Kotlin is Amazing"
    b?.run {
        println(toUpperCase())
        println(toLowerCase())
        println("스코프 함수")
    }


}