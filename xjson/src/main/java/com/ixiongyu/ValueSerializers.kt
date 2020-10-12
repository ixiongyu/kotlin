package com.ixiongyu

import com.ixiongyu.deserialization.XJsonException
import java.lang.reflect.Type

/**
 * @author  xiongyu
 * @version Create at ：2020/10/12 8:39 下午
 */

fun serializerForBasicType(type: Type): ValueSerializer<out Any?> {
    assert(type.isPrimitiveOrString()) { "Expected primitive type or String: ${type.typeName}" }
    return serializerForType(type)!!
}

fun serializerForType(type: Type): ValueSerializer<out Any?>? =
        when (type) {
            Byte::class.java, Byte::class.javaObjectType -> ByteSerializer
            Short::class.java, Short::class.javaObjectType -> ShortSerializer
            Int::class.java, Int::class.javaObjectType -> IntSerializer
            Long::class.java, Long::class.javaObjectType -> LongSerializer
            Float::class.java, Float::class.javaObjectType -> FloatSerializer
            Double::class.java, Double::class.javaObjectType -> DoubleSerializer
            Boolean::class.java, Boolean::class.javaObjectType -> BooleanSerializer
            String::class.java -> StringSerializer
            else -> null
        }

private fun Any?.expectNumber(): Number {
    if (this !is Number) throw XJsonException("Expected number, was: $this")
    return this
}

object ByteSerializer : ValueSerializer<Byte> {
    override fun fromJsonValue(jsonValue: Any?) = jsonValue.expectNumber().toByte()
    override fun toJsonValue(value: Byte) = value
}

object ShortSerializer : ValueSerializer<Short> {
    override fun fromJsonValue(jsonValue: Any?) = jsonValue.expectNumber().toShort()
    override fun toJsonValue(value: Short) = value
}

object IntSerializer : ValueSerializer<Int> {
    override fun fromJsonValue(jsonValue: Any?) = jsonValue.expectNumber().toInt()
    override fun toJsonValue(value: Int) = value
}

object LongSerializer : ValueSerializer<Long> {
    override fun fromJsonValue(jsonValue: Any?) = jsonValue.expectNumber().toLong()
    override fun toJsonValue(value: Long) = value
}

object FloatSerializer : ValueSerializer<Float> {
    override fun fromJsonValue(jsonValue: Any?) = jsonValue.expectNumber().toFloat()
    override fun toJsonValue(value: Float) = value
}

object DoubleSerializer : ValueSerializer<Double> {
    override fun fromJsonValue(jsonValue: Any?) = jsonValue.expectNumber().toDouble()
    override fun toJsonValue(value: Double) = value
}

object BooleanSerializer : ValueSerializer<Boolean> {
    override fun fromJsonValue(jsonValue: Any?): Boolean {
        if (jsonValue !is Boolean) throw XJsonException("Expected boolean, was: $jsonValue")
        return jsonValue
    }

    override fun toJsonValue(value: Boolean) = value
}

object StringSerializer : ValueSerializer<String?> {
    override fun fromJsonValue(jsonValue: Any?): String? {
        if (jsonValue !is String?) throw XJsonException("Expected string, was: $jsonValue")
        return jsonValue
    }

    override fun toJsonValue(value: String?) = value
}
