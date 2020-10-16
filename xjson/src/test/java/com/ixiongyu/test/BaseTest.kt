package com.ixiongyu.test

import com.ixiongyu.deserialization.deserialize
import com.ixiongyu.entity.Person
import com.ixiongyu.serialization.serialize
import org.junit.Test
import java.time.LocalDateTime
import kotlin.reflect.full.memberProperties

/**
 * @author  xiongyu
 * @version Create at ：2020/9/18 9:11 下午
 */

class BaseTest {
    @Test
    fun testReflect() {
        val person = Person("xiongyu", 18, 1, LocalDateTime.now(), hashMapOf("1" to "1", "2" to "3", 1 to 20))
        val javaClass = person.javaClass
        println(javaClass)
        val kotlin = javaClass.kotlin;
        println(kotlin)
        println(kotlin.simpleName)
        val memberProperties = kotlin.memberProperties
        memberProperties.forEach { println(it.name) }
        memberProperties.forEach { println(it.returnType) }
        fun foo(x: Int) = println(x)
        //kFunction1 1表示接受一个参数，
        val kFunction1 = ::foo
        kFunction1(12)
        val kProperty0 = person::age
        kProperty0.get()
    }


    @Test
    fun testSerialize() {
        val person = Person("xiongyu", 18, 1, LocalDateTime.now(), hashMapOf("1" to "1", "2" to "3", 1 to 20))
        println(serialize(person))
    }


    @Test
    fun testDeserialize() {
        var josn = "{\"age\":18, \"birthDate\":\"2020-10-15 11:05:16\", \"map\":{\"1\":\"1\", \"1\":20, \"2\":\"3\"}, " +
                "\"customName\":\"xiongyu\"}";
        val deserialize = deserialize<Person>(josn)
        println(deserialize)
    }
}
