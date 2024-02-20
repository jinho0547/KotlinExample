package org.example.enums

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


fun main(){
    val red = Color.RED
    println(red.label)
    println(red.code)

    for (color in Color.values()){
        println("${color.label} 은 ${color.code}")
    }
    println("===================")

}