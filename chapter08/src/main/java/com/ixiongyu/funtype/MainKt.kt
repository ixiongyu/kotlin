package com.ixiongyu.funtype

import java.util.function.BiPredicate

/**
 * @author  xiongyu
 * @version Create at ：2020/9/2 下午9:37
 */

fun main() {

    val action = { str: Any? -> println(str) }
    action(1)


    var funOrNull: ((Int, Int) -> Int)? = null

    funOrNull = null

    val actionInt = { x: Int, y: Int -> x + y }
    funOrNull = actionInt


    towAndThree { x, y -> x + y }


    val string = "123asdcsa3"
    val filter = string.filter { c -> c in 'a'..'z' }
    println(filter)
}


fun towAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println(result)
}


fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)

        }
    }
    return sb.toString();
}
