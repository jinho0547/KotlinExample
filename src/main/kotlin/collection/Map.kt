package org.example.collection

/* Map
 * Map은 객체를 넣을 때 그 객체를 찾아낼 수 있는 Key를 같이 넣어준다
 * [key, value] 쌍의 형태로 MutableMap.MutableEntry 객체에 담겨져 있다.
 * 이런 구조때문에 객체의 위치가 아닌 고유한 키를 통해 객체를 찾아내는 특징을 가지고 있다.
 * 또한 같은 key에 객체를 넣으면 기존의 객체가 대체되니 주의해야한다
 *
 * Map 역시 Map과 MutableMap이 존재한다
 * put 추가 remove 삭제
 */

fun main() {
    val a = mutableMapOf("레드벨벳" to "음파음파",
                        "트와이스" to "Fancy",
                        "ITZY" to "ICY")

    for(entry in a){
        println("${entry.key} : ${entry.value}")
    }
    a.put("오마이걸","번지")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["레드벨벳"])
}