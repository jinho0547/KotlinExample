package org.example.dataclass

/* Data Class
 * 데이터클래스는 데이터를 다루는 데에 최적화된 class로
 *  '5가지 기능'을 내부적으로 자동으로 생성해준다.
 * equals() - 내용의 동일성 확인
 * hashcode() - 객체의 내용에서 고유한 코드를 생성
 * toString() - 포함된 속성을 나열
 * copy() - 객체를 복사하여 같은내용의 새 객체를 생성, 생성자와 같은 파라미터를 주어 일부 속성을 변경 할 수 있다.
 * componentN() - 사용자가 직접 호출하기 위한 함수는 아니고, 배열등에 객체가 담겨있을 때 이 내용을 사용할수 있도록 지원하는 기능
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