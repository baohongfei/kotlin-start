package com.baohongfei.kotlin.start.p02oo

interface A {
    fun method() {
        println("A")

    }
}

open class B {
    open fun method() {
        println("B")
    }

}

class C : A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}