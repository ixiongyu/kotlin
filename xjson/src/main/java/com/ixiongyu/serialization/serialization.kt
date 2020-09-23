package com.ixiongyu.serialization

import com.ixiongyu.*
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.createInstance
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

fun KProperty<*>.getSerializer(): ValueSerializer<Any?>? {
    val customSerializerAnn = findAnnotation<CustomSerializer>() ?: return null
    val serializerClass = customSerializerAnn.serializerClass

    val valueSerializer = serializerClass.objectInstance
            ?: serializerClass.createInstance()
    @Suppress("UNCHECKED_CAST")
    return valueSerializer as ValueSerializer<Any?>
}

/**
 *序列化键
 */
private fun StringBuilder.serializeProperty(prop: KProperty1<Any, *>, obj: Any) {
    //判断键是否被JsonName注释。改注解表示启用别名
    val jsonNameAnn = prop.findAnnotation<JsonName>()
    val propName = jsonNameAnn?.name ?: prop.name
    serializeString(propName)
    append(":")
    val value = prop.get(obj)
    val jsonValue = prop.getSerializer()?.toJsonValue(value) ?: value
    //这里注意。如果该属性被定义序列化方式的注解注解的话，那么返回的值就是一个字符串。如果没有自定义序列化方式，而且该属性的值是一个对象。那么这里的jsonValue就一个对象。调用serializePropertyValue
    // 的时候又回回过头调用serializeObject
    serializePropertyValue(jsonValue)

}

/**
 * 序列化键对应的值
 */
private fun StringBuilder.serializePropertyValue(value: Any?) {
    when (value) {
        null -> append("null")
        is String -> serializeString(value)
        is Number, is Boolean -> append(value.toString())
        is List<*> -> serializeList(value)
        is Map<*, *> -> serializeMap(value)
        else -> serializeObject(value)
    }
}

private fun StringBuilder.serializeMap(data: Map<*, *>) {
    data.entries.joinToStringBuilder(this, prefix = "{", postfix = "}") {
        serializeString(it.key.toString())
        append(":")
        serializePropertyValue(it.value.toString())
    }
}

/**
 *序列化集合
 */
private fun StringBuilder.serializeList(data: List<Any?>) {
    data.joinToStringBuilder(this, prefix = "[", postfix = "]") {
        serializePropertyValue(it)
    }
}

/**
 * 序列化字符串
 */
private fun StringBuilder.serializeString(str: String) {
    //添加开始的引号
    append("\"")
    str.forEach { append(it.escape()) }
    append("\"")
}

/**
 *转义字符串
 */
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
