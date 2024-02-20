package org.example.dataclass

/*
 *
 */

data class DataClass(val name:String, val age:Int)
class NormalClass(val name:String, val age:Int)

fun main(){
    val data1 = NormalClass("한진호",30)
    val data2 = NormalClass("한진호",30)

    println(data1.hashCode())
    println(data2.hashCode())
    println(data1 == data2) //false -> 일반 클래스는 객체마다 주소가 다름
    println(data1.toString()) //해당 클래스의 이름과 주소를 반환
    println("============================")

    val data3 = DataClass("한진호",30)
    val data4 = DataClass("한진호",30)

    println(data3.hashCode())
    println(data4.hashCode())
    println(data3 == data4) //true
    println(data3.toString()) // 해당 클래스의 인자값을 차례대로 반환

    println("My name is ${data3.component1()}")
    println("My age is ${data3.component2()}")
    println("============================")

    val (name,age) = data3
    println(name)
    println(age)
    println("============================")

    val data5 = data3.copy()
    val data6 = data3.copy(name="HanJinho")
    println(data5.hashCode())
    println(data6.hashCode())
    println(data5 == data6) //false -> 값이 달라지면 인스턴스 해쉬코드가 달라진다
    println(data6.toString())
    println("============================")
}