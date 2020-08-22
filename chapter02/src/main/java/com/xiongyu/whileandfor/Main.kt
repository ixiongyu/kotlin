package com.xiongyu.whileandfor

import java.util.*

/**
 * @author  xiongyu
 * @version Create at ：2020/8/22 下午8:28
 */
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
//        val oneToTen = 1..20
//        for (i in oneToTen) {
//            println(fizzBuzz(i))
//        }
//
//        for (i in 100 downTo 1 step 2) {
//            println(fizzBuzz(i))
//        }

        iterateMap()
    }

    fun fizzBuzz(num: Int): String = when {
        num % 15 == 0 -> {
            "FizzBuzz"
        }
        num % 5 == 0 -> {
            "Buzz"
        }

        num % 3 == 0 -> {
            "Fizz"
        }
        else -> {
            "$num"
        }
    }

    fun iterateMap() {
        val binaryReps = TreeMap<Char, String>();
        for (c in 'A'..'F') {
            binaryReps[c] = Integer.toBinaryString(c.toInt())
        }

        for ((letter, binary) in binaryReps) {
            println("letter:$letter,binary:$binary")
        }


    }
}
