package com.baohongfei.kotlin.start.basic

fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum2(3,4))

    myPrint(2,3)
    myPrint2(2, 3)

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

// command + shift +enter
fun myPrint(a:Int,b:Int):Unit{
    println(a + b)
}

// 字符串模板 String Template
fun myPrint2(a:Int,b:Int){
    println("$a + $b = ${(a + b)}")
}