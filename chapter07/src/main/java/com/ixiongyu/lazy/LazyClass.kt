package com.ixiongyu.lazy

/**
 * @author  xiongyu
 * @version Create at ：2020/9/2 下午8:48
 */
class LazyClass {
    val lazyFiled: String by lazy {
        println("I'm in lazy.")
        "lazyFiled"
    }
}

fun main() {
    val lazyClass = LazyClass()
    println(lazyClass.lazyFiled)
    println(lazyClass.lazyFiled)
}
