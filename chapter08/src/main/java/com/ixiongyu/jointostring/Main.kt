package com.ixiongyu.jointostring

/**
 * @author xiongyu
 * @version Create at ：2020/9/3 下午9:43
 */


fun main(args: Array<String>) {
    val listOf = listOf<Int>(1, 2, 3, 4, 5)
    val joinToString = listOf.joinToMyString(separator = "_", prefix = "{", postfix = "}", transformer = { i -> (i + 1)
            .toString() })
    println(joinToString)
}
