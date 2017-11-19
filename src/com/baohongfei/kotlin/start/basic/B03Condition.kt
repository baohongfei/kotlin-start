package com.baohongfei.kotlin.start.basic

fun main(args: Array<String>) {
    conditon01()

    conditon02()

    condition03()

}

private fun condition03() {
    var x = 10
    var y = 20

    // 最后一行当做返回
    var max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min = if (x > y) {
        println("x > y")
        y
    } else {
        println("x <= y")
        x
    }

    println("max = $max, min = $min")
}

private fun conditon02() {
    var x = 10
    var y = 20

    var max = if (x > y) x else y
    var min = if (x > y) y else x

    println("max = $max, min = $min")
}

private fun conditon01() {
    var x = 10
    var y = 20

    var max: Int
    var min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("max = $max, min = $min")
}