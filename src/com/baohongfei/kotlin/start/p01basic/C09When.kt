package com.baohongfei.kotlin.start.p01basic

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("test"))

    println(myPrint2("test"))

    testWhen()
}

private fun testWhen() {
    var a = 11
    var result = when (a) {
        1 -> {
            println("a = 1")
            10
        }
        2, 3 -> {
            println("a in [2,3]")
            20
        }
        in 4..10 -> {
            println("a in [4,10]")
            30
        }
        else -> {
            println("a in else")
            40
        }
    }

    println(result)
}

fun myPrint(str: String): String {
    when (str) {
        "hello" -> return "Hello"
        "world" -> return "World"
        else -> return "other input"
    }
}


fun myPrint2(str: String): String =
        when (str) {
            "hello" -> "Hello"
            "world" -> "World"
            else -> "other input"
        }