package com.baohongfei.kotlin.start.s02oo

/**
 * output
zhangsan
lisi
lisi,30
wangwu
wangwu,40
username: zhangsan,age: 20,address: beijing
username: lisi,age: 30,address: beijing
username: wangwu,age: 40,address: address
 */
class Person constructor(username: String) {
    private var username: String
    private var age: Int
    private var address: String

    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    constructor(username: String, age: Int) : this(username) {
        println(username + "," + age)
        this.username = username
        this.age = age
        this.address = "beijing"
    }

    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = "address"
    }

    fun printInfo() {
        println("username: ${this.username},age: ${this.age},address: ${this.address}")
    }
}

fun main(args: Array<String>) {
    val person = Person("zhangsan")
    val person2 = Person("lisi", 30)
    val person3 = Person("wangwu", 40, "hangzhou")

    person.printInfo()
    person2.printInfo()
    person3.printInfo()
}
