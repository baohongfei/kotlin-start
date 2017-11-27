package com.baohongfei.kotlin.start.p02oo


/**
 * var propertyName:propertyType = initializer
 *     getter()...
 *     setter()...
 * javap -c com.baohongfei.kotlin.start.p02oo.ThePerson
 */
class ThePerson(address: String, name: String) {
    // val age: Int = 20
    val age: Int
        get() = 20
    // private int age

    var address: String = address
        get() {
            println("get invoked")
            return field
        }
        set(value) {
            println("set invoked")
            field = value
        }

    var name: String = name
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
        private set
        public get
}

fun main(args: Array<String>) {
    var person = ThePerson("shanghai", "zhangsan")
    println(person.age)
    println(person.address)
    person.address = "tianjin"
    println(person.address)
    println(person.name)
    // person.name = "lisi"
    println(person.name)
}