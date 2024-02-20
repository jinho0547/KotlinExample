package org.example.generic

fun main(){
    GenericUse(A()).doShout()
    GenericUse(B()).doShout()
    GenericUse(C()).doShout()

    genericFun(A())
}

fun<T:A> genericFun(t : T){
    t.shout()
}

class GenericUse<T:A> (val t : T) {
    fun doShout(){
        t.shout()
    }
}

open class A {
    open fun shout(){
        println("A가 소리친다.")
    }
}
class B : A(){
    override fun shout() {
        println("B가 소리친다.")
    }
}

class C : A() {
    override fun shout() {
        println("C가 소리친다")
    }
}

