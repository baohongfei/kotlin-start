package com.baohongfei.kotlin.start.s01basic

fun main(args: Array<String>) {
    val a = 5
    val b = 10

    if (a in 2..b) {
        println("a is in the range")
    }

    if (a !in 2..b) {
        println("a is out of the range")
    }

    for (i in 2..10) {
        println(i)
    }

    for (i in 2.rangeTo(10)) {
        println(i)
    }

    for (i in 2..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 2 step 4) {
        println(i)
    }
}