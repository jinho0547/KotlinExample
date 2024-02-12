package org.example.variable

fun main(){

    //String
    var str:String = "String 자료형 명시"
    var str2 = "타입추론(자료형 추론)이 가능하므로 명시해줄 필요가 없다"
    val str3 = "고정된 값을 사용하기위해서 val로 선언"
    str = "var은 변경이 가능하지만"
    //str3 = "val은 값 변환이 불가능하다"

    //코틀린은 기본적으로 null을 허용하지 않는다.

    //Null을 사용하기 위해선
    var a:Int? = null //nullable 선언 해야 사용가능
    //var b:Int = null

    //해당 방식으로 변수 바로 사용 가능
    println("${str}")

    // 형변환의 경우 암시적 형변환은 허용하지 않으며 반드시 명시적 형변환을 통해서만 변환이 가능
    var aa:Int = 12345
    //var bb:Long = aa  // 자바의 경우 Long의 메모리가 더 크므로 가능했겠지만
    var bb = aa.toLong() // 명시를 해줘야 변환 가능



    //자료형은 대부분 자바와 비슷
    //자바의 경우 Object가 최상위 자료형이었으나 코틀린의 경우 Any

}