package com.baohongfei.kotlin.start.p02oo

/**
 * 延迟初始化属性
 * kotlin要求非空类型的属性必须要在构造方法中进行初始化
 */
class TheClass {
    lateinit var name: String

    fun init() {
        this.name = "zhangsan"
    }

    fun print() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    var theClass = TheClass()

    theClass.init()
    theClass.print()
}