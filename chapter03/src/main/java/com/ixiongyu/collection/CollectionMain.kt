package com.ixiongyu.collection

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 上午11:43
 */
fun main(args: Array<String>) {
    val listOf = listOf(1, 2, 3, 4)
    val listOf1 = listOf("args:",*args)
    for (arg in args) {
        println(arg)
    }
    println(listOf.last())
    println(listOf1)
    println(listOf.maxOrNull())
}

