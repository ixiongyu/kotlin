@file:JvmName("KotlinExtensions")

package com.ixiongyu.collection

import java.lang.StringBuilder

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 上午10:32
 */


/**
 * 扩展函数不存在重写，因为java会把他们当成静态方法对待
 */

fun String.lastChar(): Char = this[this.length - 1]


object KotlinExtension {
    @JvmStatic
    fun main(args: Array<String>) {
        val name = "xiongyu"
        val stringBuilder = StringBuilder(name)
        println(name.lastChar())
        println(stringBuilder.lastCharStr)
        stringBuilder.lastCharStr = 'd'
        println(stringBuilder.lastCharStr)
    }
}


fun <T> Collection<T>.toBeautifulString(separator: String = ",", prefix: String = "", postfix:
String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)

        }
        result.append(element)
    }
    return result.append(postfix).toString()
}

fun Collection<String>.stringToBeautifulString(separator: String = ",", prefix: String = "", postfix:
String = ""): String = toBeautifulString(separator = "string")


//添加扩展属性
var StringBuilder.lastCharStr: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }
