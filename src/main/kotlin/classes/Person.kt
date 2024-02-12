package org.example.classes

class Person(var name:String, val birthYear:Int) {   //기본 생성자
    constructor(name:String):this(name,1995)// 보조 생성자
    init{
        //인스턴스 생성 시 실행할 구문
        println("${this.birthYear}년생 ${this.name}님의 자료가 생성되었습니다.")
    }

    fun introduce(){
        println("안녕하세요. 저는 ${birthYear}년생 ${name}입니다.")
    }
}