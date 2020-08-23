package com.ixiongyu.collection

import java.lang.StringBuilder

/**
 * @author  xiongyu
 * @version Create at ：2020/8/22 下午10:27
 */
object OfMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val hashSetOf = hashSetOf(1, 2, 4)
        val listOf = listOf(1, 3, 5)
        val strListOf = listOf("1", "2", "3")
        println(listOf.maxOrNull())
        println(listOf.toBeautifulString(separator = "toBeautifulString"))
        println(strListOf.stringToBeautifulString())
        println(toMyString(listOf, ",", "{", "}"))
        println(toMyString(listOf, separator = ",", prefix = "{", postfix = "}"))
        println(toMyString(listOf, separator = ",", postfix = "}", prefix = "{"))
        println(toMyString(listOf, postfix = "------"))
        val hashMapOf = hashMapOf(1 to 2, 3 to 4)
        println(hashMapOf)
        println(hashMapOf[1])
    }

    @JvmOverloads
    fun <T> toMyString(collection: Collection<T>, separator: String = ",", prefix: String = "", postfix: String = ""):
            String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) {
                result.append(separator)

            }
            result.append(element)
        }
        return result.append(postfix).toString()
    }
}
