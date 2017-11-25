package com.baohongfei.kotlin.start.p01basic

fun main(args: Array<String>) {
    var array = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")
    for (item in array) {
        println(item)
    }

    array.filter { it.length >5 }.map { it.toUpperCase() }.sorted().forEach({ println(it)})

}