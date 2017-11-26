package com.baohongfei.kotlin.start.p02oo

open class BaseClass{
    open fun method() {

    }
}

abstract class ChildClass : BaseClass() {
    override abstract fun method()
}