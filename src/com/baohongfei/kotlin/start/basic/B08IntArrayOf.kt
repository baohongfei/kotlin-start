package com.baohongfei.kotlin.start.basic

fun main(args: Array<String>) {
    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)

    for (item: Int in array) {
        println(item)
    }

    for (i: Int in array.indices) {
        println("array[$i] = ${array[i]}")
    }

    // 关于字符串模板的idea，java的日志打印可以用这样的模板
    for ((index, value) in array.withIndex()) {
        println("array[$index] = $value")
    }

}