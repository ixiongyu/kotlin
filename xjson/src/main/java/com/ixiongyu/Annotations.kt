package com.ixiongyu

import kotlin.reflect.KClass

/**
 * @author  xiongyu
 * @version Create at ：2020/9/17 9:00 下午
 */


/**
 * 用了标记需要排除系列化的对象
 * @Target(AnnotationTarget.PROPERTY)用来表示注解作用于属性之上
 */


@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class JsonExclude


/**
 * 指定序列化的时候属性的key的别名
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class JsonName(val name: String)


/**
 * 反序列化的时候,当属性是一个接口的时候，用来指定一个具体的实现类
 * KClass是Java中java.lang.Class的对应类型，out关键字表明参数可是使用那些继承自Any的类
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class DeserializeInterface(val targetClass: KClass<out Any>)


/**
 * 自定义序列化实现
 */
interface ValueSerializer<T> {
    fun toJsonValue(t: T): String
    fun formJsonValue(json: String): T
}

/**
 * @see ValueSerializer
 * 使用该注解表示该属性使用自定义的注解实现规则
 * <*>表示允许序列化任何值，前面的out表示接受实现了ValueSerializer的任何类。
 */
@Target(AnnotationTarget.PROPERTY)
annotation class CustomSerializer(val serializerClass: KClass<out ValueSerializer<*>>)
