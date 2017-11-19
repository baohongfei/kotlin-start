package com.baohongfei.kotlin.start.basic

import java.util.function.Consumer


fun main(args:Array<String>){
    println("Hello World!")

    val list: List<String> = listOf("string1","string2","string3")

    for(str in list){
        println(str)
    }

    list.forEach(Consumer { println(it) })

    list.forEach(System.out::println)

}
