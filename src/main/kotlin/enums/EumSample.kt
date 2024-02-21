package org.example.enums
/* Enum Class 열거형 클래스
 * enumerated type. 즉 열거형의 준말로
 * enum클래스 내부에 객체의 상태를 선택할 수 있는 옵션을 나열해놓고
 * 그 중 하나의 상태를 선택하여 나타낼 수 있는 형태이다
 * Enum 클래스 안의 객체들은 관행적으로 상수를 나타내는 대문자를 사용한다.
 * Enum의 객체들은 고유한 속성을 가질 수 있다
 *
 */


fun main(){
    /*val red = Color.RED
    println(red.label)
    println(red.code)

    for (color in Color.values()){
        println("${color.label} 은 ${color.code}")
    }
    println("===================")*/

    var state = State.SING
    println(state)
    println(state.isSleeping())

    state = State.SLEEP
    println(state)
    println(state.isSleeping())

    state = State.EAT
    println(state.message)



}

enum class State(val message: String){
    SING("노래를 부릅니다."),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다.");

    fun isSleeping() = this == State.SLEEP
}

enum class Color(val label:String, val code:String) {
    RED("red","빨강"),
    YELLOW("yellow","노랑"),
    GREEN("green","초록"),
    BLUE("blue","파랑")
}

enum class HttpStatus(val label: String, val code: Int){
    REDIRECT("redirect",300){
        override fun isServerError():Boolean {
            return false
        }
    },
    BAD_REQUEST("bad_request",400){
        override fun isServerError(): Boolean {
            return false
        }
    },
    INTERNAL_ERROR("internal error",500){
        override fun isServerError(): Boolean {
            return true
        }
    };
    
    abstract fun isServerError():Boolean
}


// enum 클래스 안에 함수를 구현하기 위한 방법은 Interface를 상속받거나 같은 클래스 내 abstract 함수를 만들어 구현하는 방법이 있다.
enum class HttpStatus2(val label: String, val code: Int) : CheckStatus{
    REDIRECT("redirect",300){
        override fun isServerError():Boolean {
            return false
        }
    },
    BAD_REQUEST("bad_request",400){
        override fun isServerError(): Boolean {
            return false
        }
    },
    INTERNAL_ERROR("internal error",500){
        override fun isServerError(): Boolean {
            return true
        }
    };
}
interface CheckStatus {
    fun isServerError(): Boolean

}

