package org.example.scope
/*  스코프함수
* 스코프함수는 함수형언어의 특징을 좀 더 편리하게 사용할 수 있도록 기본제공하는 함수들이다.
* 종류로는
* apply, run, with, also, let 이 있다
*/


fun main(){
    // 스코프 함수를 사용하지 않을경우
    //    var a = Book("책 이름입니다.",10000)
    //    a.name += "[세일]"
    //    a.discount()
    var a = Book("책 이름입니다.",10000).apply {
        name = "[세일] " + name
        discount()
        // apply 함수를 사용하면 인스턴스가 생성됨과 함께
        // 속성과 함수를 참조연산자 없이 사용할 수 있다.
        // apply는 인스턴스 자신을 다시 반환하므로
        // 생성되자마자 변환된 인스턴스를 바로 변수에 넣어줄 수 있다.
        // main함수의 스코프가 아닌 Book의 클래스 스코프에서 작업하므로 코드가 깔끔해진다는 장점이 있다
    }
    //run 은 참조연산자 없이 사용할 수 있는것은 맞지만,
    // 인스턴스를 반환하는것이 아닌 인스턴스의 함수나 속성을 반환받아 스코프에서 사용할 수 있다는 차이점
    var b = a.run {
        println("$name")
        name
    }
    println(b) //변수 b에 a.apply에서 조작된 name이 담겼다
    a.run {
        println("이렇게 바로 ${name} 과 ${price}를 사용할 수도 있다")
    }
    //with는 run과 기능은 동일하지만
    // 참조연산자를 통해 호출하는것이 아닌 파라미터로 인스턴스를 받는다는점이 다르다
    with(a){
        println("이렇게 바로 ${name} 과 ${price}를 사용할 수도 있다")
    }

    /*
    * apply / also -> 처리가 끝나면 인스턴스를 반환
    * run / let -> 처리가 끝나면 최종값을 반환
    * 위 공통점이 있지만
    * apply와 run은 참조연산자 없이 속성과 함수를 사용할 수 있지만
    * also와 let은 파라미터를 넘겼을 때 처럼 it을 통해 인스턴스를 사용할 수 있다.
    *
    * also와 let이 굳이 파라미터를 넘긴듯 it을 통해 사용하게 하는 이유는
    * 스코프 바깥에 동일한 이름의 변수나 함수가 중복되어 존재할 경우 이를 방지하기 위해 있다.
    */
    var price:Int = 5000
    a.run { println("${price}") }
    // 위 run 구문 안에서는 price가 8000원이지만 main에 price가 5000원으로 선언 된 이후
    // run 구문 안에서 price는 5000원이 되어있다.
    // main 의 함수스코프가 우선되기 때문이다.
    // 이를 방지하기위해
    a.let {println("${it.price}")}
    // 이렇게 사용하면 8000원이 출력된다
    a.run { println("${this.price}") } // 사실 이렇게도 가능

}

class Book(var name:String, var price:Int){
    fun discount(){
        price -= 2000
    }
}