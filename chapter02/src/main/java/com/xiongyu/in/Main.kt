package com.xiongyu.`in`

/**
 * @author  xiongyu
 * @version Create at ：2020/8/22 下午8:54
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(isLetter('c'))
        println(isLetter('.'))
        println(isNotDigit('.'))
        println(isNotDigit('1'))
    }

    private fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    private fun isNotDigit(c: Char) = c !in '0'..'9'
}
