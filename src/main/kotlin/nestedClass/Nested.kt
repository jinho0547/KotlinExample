package org.example.nestedClass

/*
* 코틀린에서는 기본적으로
* 클래스 안에 클래스를 넣을수 있는 중첩클래스를 지원한다
* 하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식
*
* 중첩클래스 대신 내부클래스를 사용 가능하다
* 내부클래스는 혼자서 객체를 생성이 불가능하고
* 외부클래스의 객체가 있어야만 생성과 사용이 가능하다.
*
* 중첩클래스는 형태만 안에 존재할뿐, 외부와 내부의 속성과 함수의 내용을 공유할수 없으나.
* 내부 클래스는 외부클래스 객체 안에서 사용되는 클래스이므로, 외부클래스의 속성이나 함수를 사용이 가능하다.
*
*/

class Outer {
    var text = "Outer Class"

    class Neted{
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }
        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}

fun main() {
    Outer.Neted().introduce()

    val outer = Outer()
    val inner = outer.Inner()
    println("@@@@@@@@@@@@@@@@@@@@")
    inner.introduceInner()
    inner.introduceOuter()
    println("@@@@@@@@@@@@@@@@@@@@")
    Outer().Inner().introduceOuter()
    println(Outer().Inner().text)
    println("@@@@@@@@@@@@@@@@@@@@")
    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

/*
 * 중첩 클래스와 내부클래스는
 * 클래스간의 연계성을 표현하여
 * 코드의 가독성 및 작성편의성이 올라갈 수 있으므로,
 * 적절한 상황에서 사용하는것이 좋다.
 */