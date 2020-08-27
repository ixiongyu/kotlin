package com.ixiongyu.withandapply

import com.ixiongyu.lambdaandcollection.Book

/**
 * @author  xiongyu
 * @version Create at ：2020/8/27 下午8:47
 */
fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet2())
    val apply = Book("title", listOf("1", "2")).apply {
        page = 123
    }

    println(apply)
}


    fun alphabet(): String {
        val stringBuilder = StringBuilder()
        return with(stringBuilder, {
            for (letter in 'A'..'z') {

                this.append(letter)
            }

            this.append("end").toString()
        })
    }


    fun alphabet2() = with(StringBuilder()) {
        for (letter in 'A'..'z') {

            append(letter)
        }
        append("end")
        toString()
    }
