package com.baohongfei.kotlin.start.p02oo

open class MyParent {
    open val name: String = "parent"
}

class MyChild : MyParent() {
    override val name: String = "child"
}

class MyChild2(override val name: String) : MyParent() {

}


open class MyParent3 {
    open fun method() {
        println("parent method")
    }

    // 1. val可以override val
    // 2. var可以override var
    // 3. val无法override var
    // 本质上，var相当于get方法，var相当于get和set方法
    open val name: String get() = "parent"
}

class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }

    override val name: String get() = super.name + " and child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)

    var myChild3 = MyChild3()
    myChild3.method()
    println(myChild3.name)

}