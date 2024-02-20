package org.example.`object`
/*
* Object 는 언어차원에서 singleton pattern 을 지원하는것이다.
* 싱글턴 패턴은
* 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴이다
*
* Object는 인스턴스를 생성하지 않고 그 자체로 객쳉기때문에 생성자를 사용하지 않는다.
*/


fun main(){
    //object는 별도의 인스턴스를 사용하지 않기때문에
    // 직접 참조연산자를 붙여서 사용한다.

    // object로 선언된 객체는 최초 사용시 자동으로 생성되며 이후 코드 전체에서 공용으로 사용될 수 있다.
    // 프로그램이 종료되기 전까지 사용될 공통적인 내용을 묶어서 사용하면 좋다.
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)
    //0, 2, 0
}
object Counter {
    var count:Int = 0
    fun countUp() {
        count++
    }
    fun clear(){
        count = 0
    }
}