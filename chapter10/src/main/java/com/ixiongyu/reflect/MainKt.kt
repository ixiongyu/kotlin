package com.ixiongyu.reflect

import com.ixiongyu.main.Person
import kotlin.reflect.full.callSuspend
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.memberProperties

/**
 * @author  xiongyu
 * @version Create at ：2020/9/9 9:46 下午
 */
fun main() {
    val person = Person("xiongyu", 12)
    val kClass = person.javaClass.kotlin
    println(kClass)
    kClass.memberProperties.forEach { println(it.name) }
    println(kClass.simpleName)
    kClass.declaredFunctions.forEach { println(it) }

    println()
    kClass.members.forEach { println(it) }


    val kFunction = ::foo
    kFunction(1)
    kFunction.invoke(2)


    Person::class.declaredMemberFunctions.firstOrNull { it.name == "say" }?.call(person, "12")
}

fun foo(x: Int) = println(x)
