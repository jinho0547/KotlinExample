package org.example.function

fun main() {
    deliveryItem("짬뽕")
    deliveryItem("책",3)
    deliveryItem("선물",30,"친구집")
    //
    deliveryItem(count = 3, destinatoin = "사무실", name="노트북")
    println()

    sum(3,3,4,5,2)



}

//default argument
fun deliveryItem(name: String, count:Int = 1, destinatoin:String = "집") { // 패러미터를 쓰지 않은경우 기본값으로 쓸 수 있다.
    println("${name}을 ${destinatoin}으로 ${count}개 보냈습니다.")
}

//variable number of arguments (vararg) 개수가 지정되지 않은 패러미터로, 가장 마지막에 위치하여야한다.
fun sum(vararg numbers: Int){
    var sum = 0;
    for (n in numbers){
        sum += n
    }
    println(sum)
}