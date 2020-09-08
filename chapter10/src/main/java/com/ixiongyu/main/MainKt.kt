package com.ixiongyu.main

import com.ixiongyu.jkid.deserialization.deserialize
import com.ixiongyu.jkid.serialization.serialize

/**
 * @author  xiongyu
 * @version Create at ：2020/9/8 10:24 下午
 */
fun main() {
    val person = Person("xiongyu", 18)
    val serialize = serialize(person)
    println(serialize)
    val deserialize = deserialize<Person>(serialize)
    println(deserialize)
}
