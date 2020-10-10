//package com.ixiongyu.deserialization
//
//import java.io.Reader
//import java.io.StringReader
//import kotlin.reflect.KClass
//
///**
// * @author  xiongyu
// * @version Create at ：2020/9/29 9:05 下午
// */
//
//inline fun <reified T : Any> deserialize(json: String): T {
//
//    return deserialize(StringReader(json))
//}
//
//inline fun <reified T : Any> deserialize(json: Reader): T {
//    return deserialize(json, T::class)
//}
//
//fun <T: Any> deserialize(json: Reader, targetClass: KClass<T>): T {
//    val seed = ObjectSeed(targetClass, ClassInfoCache())
//    Parser(json, seed).parse()
//    return seed.spawn()
//}
//
//interface JsonObject{
//    fun setSimpleProperty(propertyName: String, value: Any?)
//
//    fun createObject(propertyName: String): JsonObject
//
//    fun createArray(propertyName: String): JsonObject
//}
