package org.example.scope

/*
* scope 는 변수나 함수, 클래스 같은 '멤버'들을
* 서로 공유하여 사용할 수 있는 범위를 지정해둔 단위
*
* scope가 지정되는 단위는 패키지, 클래스, 함수 등이 있다
*
* 스코프 외부에서는 스코프 내부의 멤버를 호출할때는 참조 연산자를 사용하여야 한다.
* 동일 스코프 내에서는 멤버를 공유할 수 있다.
*/

val a= "패키지 스코프"
//val a= "같은레벨의 스코프에서는 동일한 이름의 변수를 사용하는것이 불가능하나"
class A{
    val a = "클래스 스코프" //하위 레벨의 스코프에서는 같은 이름의 변수를 사용이 가능하다.
    fun print(){
        println(a)
    }
}
class B {
    fun print(){
        println(a) //같은 패키지 단위의 스코프 이므로 a를 참조연산자 없이 고유하여 사용 가능
    }
}
fun main(){
    val a = "함수 스코프"
    println(org.example.scope.a) // 패키지
    println(A().a) //클래스
    println(a) //함수
    A().print()
    B().print()
}