package com.baohongfei.kotlin.start.p02oo

class EmptyClass

// 在Kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
// primary构造方法是class header的一部分，它位于类名后面，可以拥有过个参数
// 如果primary构造方法没有任何注解或是可见性关键字修饰，那么constructor关键字可以省略
class MyFirstClass constructor(username: String) {
    private val username: String = username.toUpperCase()

    init {
        println(username)
    }

    fun printInfo() {
        println("username: ${this.username}")
    }
}

fun main(args: Array<String>) {
    var myFirstClass = MyFirstClass("zhangsan")
    myFirstClass.printInfo()
}