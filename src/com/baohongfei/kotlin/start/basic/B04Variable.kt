package com.baohongfei.kotlin.start.basic

//import com.baohongfei.kotlin.start.basic2.multiply
import com.baohongfei.kotlin.start.basic2.multiply as myMultiply

fun main(args: Array<String>) {
    // constant
    val a: Int = 1
    val b = 2

    // variable
    var c: Int
    c = 3

    var d = 3
    d = 4

    println(d)

    /**
     *
     */

    /*
    /*

     */
     */

    var x = 10
    var y: Byte = 20

    x = y.toInt()

    println(x)

//    println(multiply(2, 3))
    println(myMultiply(2, 3))

    val m = intArrayOf(1, 2, 3)
//    m= intArrayOf(4,5)

    m.set(0, 4)

    for (item in m) {
        println(item)
    }




}