package com.baohongfei.kotlin.start.s01basic

fun main(args: Array<String>) {
    println(convert2Int("a"))

    printMultipy("2","3")
    printMultipy("2","a")

}

// ?表示可能返回null
fun convert2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultipy(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    //println(a2Int * b2Int)

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}
