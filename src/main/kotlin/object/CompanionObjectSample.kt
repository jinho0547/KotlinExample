package org.example.`object`


fun main() {
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}, ${b.name} : ${b.count}, 총 ${FoodPoll.total}")

}
class FoodPoll(val name:String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote(){
        count++
        total++
    }
}