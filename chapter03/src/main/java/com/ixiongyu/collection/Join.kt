@file:JvmName("StringFunctions")

package com.ixiongyu.collection

import java.lang.StringBuilder

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 上午10:23
 */

@JvmOverloads
fun <T> toMyString(collection: Collection<T>, separator: String = ",", prefix: String = "", postfix:
String = ""):
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
