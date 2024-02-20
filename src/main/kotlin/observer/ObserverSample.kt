package org.example.observer

import org.example.`object`.Counter

/*  Observer Pattern
*  옵저버 패턴은 함수로 직접 요청하지 않았지만,
* 시스템, 루틴에 따라 발생되는 동작을 이벤트라 부르며
* 이 이벤트가 발생할때 마다 '즉각적으로' 처리할수 있도록 만드는 프로그래밍 패턴
*
* 이벤틀를 수신하는 클래스, 이벤트의 발생 및 전달하는 클래스
* 각각 A, B라고 칭한다
* A 클래스에서는 이벤트를 수신하여 실행할 메서드를 구현하고 이 이벤트를 B() 객체를 생성하여 전달받는다
* B 클래스에서는 다시 A에게 전달 할 방법이 없다
* 그래서 이 사이에 인터페이스를 껴넣는다
*
* 이 인터페이스를 observer 코틀린에서는 listener 라고 칭한다.
* 이벤트를 넘겨주는 행위를 callback이라고 부른다
*/



fun main(){
    EventPrinter().start()
}

interface EventListener{
    fun onEvent(count: Int)
}
class Counter (var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if(i%5 ==0) listener.onEvent(i)
        }
    }
}
//class EventPrinter : EventListener{
//    override fun onEvent(count: Int)  {
//        print("${count}-")
//    }
//    fun start(){
//        var counter = Counter(this)
//        counter.count()
//    }
//}

//클래스를 만들지 않고 익명의 객채를 만들어보자

class EventPrinter {
    fun start(){
        var counter = Counter(object: EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}
