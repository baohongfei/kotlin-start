package com.baohongfei.kotlin.start.p01basic

fun main(args: Array<String>) {
    println(convert2Uppercase("Hello world!!!"))
    println(convert2Uppercase(23))

}

fun convert2Uppercase(str: Any): String? {
    if (str is String) {
        return str.toUpperCase()
    }

    return null
}

