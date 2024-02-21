package org.example.collection
/* Set
 * Set은 List와 달리 순서가 정렬이 되지 않으며, 중복이 허용되지 않는 컬렉션
 * 따라서 Set은 인덱스로 위치를 지정하여 객체를 참조할 수 없으며
 * contains로 객체가 Set 안에 존재하는지 확인하는 여부로만 사용된다
 * Set 역시 객체의 추가,삭제가 가능한 mutableSet이 존재한다 (추가 add, 삭제 remove)
 */

fun main() {
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a) {
        println(item)
    }
    a.add("자몽")
    a.remove("바나나")
    println(a.contains("바나나"))

    println(a)
}