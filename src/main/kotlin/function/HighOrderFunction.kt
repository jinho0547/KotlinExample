package org.example.function
/* 고차함수
* 고차함수란 함수를 마치 클래스에서 만들어 낸 '인스턴스처럼' 취급하는 방법
* 함수를 패러미터로 넘겨받을 수 있고, 리턴값으로 받을수도 있다
*/


fun main(){
    // 고차함수 형태로 넘기려면 ::를 붙여야 한다
    b(::a)

    // 파라미터로 넘길 함수를 굳이 이름을 붙이지 말고, 변수에 담는다
    // 함수를 람다식으로 표현하여 이를 변수에 담아도 된다.
    // 람다함수는 일반함수와 달리, 그 자체가 고차함수이므로,
    // 파라미터로 담을때 :: 연산자가 필요 없다.
    var lambda_:(String)->Unit = {str -> println("$str 람다함수")}
    // var lambda_:(String)->Unit =
    // {str:String(여기서 이 자료형은 앞에 자료형에서 추론이 가능하므로 생략가능하다) -> println("$str 람다함수")}

    //람다함수 역시 변수에 할당할 때에는 타입추론 기능을 이용하여 축약하여 기술 가능
    var c = {str:String -> println("$str 람다함수")}
    b(lambda_)

    var calculate:(Int, Int) -> Int = {a, b->
        println("a : $a , b : $b")
        println("a + b = ${a+b}")
        a+b //마지막 값은 리턴값(여기선 Int)이 된다
    }
    var d:()->Unit = {
        println("파라미터가 없는경우 구문만 나열하면 된다")
    }
    var e:(String)-> Unit = {
        println("파라미터가 하나뿐이라면 이름을 지정하지 않고 ${it}을 사용하면 된다")
    }

}
fun a(str:String){
    println("$str 함수 a")
}


/*
* 함수의 자료형식은
* 파라미터 -> 반환형
* (자료형, 자료형, ... 자료형) -> (반환될 자료형)
* 로 표현할 수 있으며,
* 반환값이 없는 함수는 Unit으로 표기한다
*/
fun b(function: (String)->Unit){
    function("함수 b에서 호출한")
}