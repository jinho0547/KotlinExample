package org.example.collection
/*
 * List 는 데이터를 모아 관리하는 Collection 클래스 중 가장 단순한 형태
 * 여러개의 데이터를 원하는 순서대로 넣어 관리하는 클래스
 *
 * List 는 List 와 MutableList 가 존재
 *
 * List는 생성되면 대체, 추가, 삭제 불가
 * MutableList 는 생성 후에도 변경 할 수 있다.
 *
 * listOf(1,2,3)
 * mutableListOf("A","B","C")
 *
 * mutableList는
 * add(데이터), add(데이터, 인덱스)
 * remove(데이터), removeAt(인덱스)
 * 의 추가 삭제 함수 외에도
 * shuffle(), sort() 의 무작위 정렬, 정렬의 함수도 존재하며
 * list[index] = "대체될 데이터"
 * 해당 방법으로 변경 가능하다
 */

fun main() {
    var a = listOf("사과","딸기","참외")
    for (fruit in a){
        println("${fruit} : ")
    }
    println()

    var b = mutableListOf(6,3,1)
    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.remove(3)
    println(b)

    b.removeAt(3)
    println(b)

    b.sort()
    println(b)

    b.shuffle()
    println(b)



}