package com.ixiongyu.jointostring

import java.lang.StringBuilder

/**
 * @author  xiongyu
 * @version Create at ：2020/9/3 下午9:32
 */


fun <T> Collection<T>.joinToMyString(
        separator: String = ",",
        prefix: String = ",",
        postfix: String = ",",
        transformer: ((T) -> String)? = null,
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0)
            result.append(separator)
        val str = transformer?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}


