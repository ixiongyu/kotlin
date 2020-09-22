package com.ixiongyu.serialization

import com.ixiongyu.JsonExclude
import com.ixiongyu.JsonName
import com.ixiongyu.joinToStringBuilder
import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/**
 * @author  xiongyu
 * @version Create at ：2020/9/21 10:12 下午
 */

fun serialize(obj: Any): String = buildString { serializeObject(obj) }


private fun StringBuilder.serializeObject(obj: Any) {
    val kotlin = obj.javaClass.kotlin
    val memberProperties = kotlin.memberProperties
    memberProperties
            .filter { it.findAnnotation<JsonExclude>() == null }
            .joinToStringBuilder(this, prefix = "{", postfix = "}")
            { prop ->
                serializeProperty(prop, obj)

            }
}

private fun StringBuilder.serializeProperty(prop: KProperty1<Any, *>, obj: Any) {
    val jsonNameAnn = prop.findAnnotation<JsonName>()
    val propName = jsonNameAnn?.name ?: prop.name
    serializeString(propName)
    append(":")
    serializePropertyValue(prop.get(obj))

}


private fun StringBuilder.serializePropertyValue(value: Any?) {
    when (value) {
        null -> append("null")
        is String -> serializeString(value)
        is Number, is Boolean -> append(value.toString())
        is List<*> -> serializeList(value)
        else -> serializeObject(value)
    }
}

private fun StringBuilder.serializeList(data: List<Any?>) {
    data.joinToStringBuilder(this, prefix = "[", postfix = "]") {
        serializePropertyValue(it)
    }
}

private fun StringBuilder.serializeString(str: String) {
    //添加开始的引号
    append("\"")
    str.forEach { append(it.escape()) }
    append("\"")
}

private fun Char.escape(): Any =
        when (this) {
            '\\' -> "\\\\"
            '\"' -> "\\\""
            '\b' -> "\\b"
            '\u000C' -> "\\f"
            '\n' -> "\\n"
            '\r' -> "\\r"
            '\t' -> "\\t"
            else -> this
        }
