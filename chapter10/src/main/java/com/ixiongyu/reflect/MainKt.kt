package com.ixiongyu.reflect

import com.ixiongyu.main.Person
import kotlin.reflect.KFunction
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.memberProperties

/**
 * @author  xiongyu
 * @version Create at ：2020/9/9 9:46 下午
 */

var counter = 0


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
    //调用属性的call方法会调用属性的get方法
    println(Person::class.memberProperties.firstOrNull { it.name == "name" }?.call(person))

    val kMutableProperty0 = ::counter
    kMutableProperty0.setter.call(12)
    println(kMutableProperty0.get())
    println(kMutableProperty0.call())

    val kFunction2 = ::sum
    println(kFunction2.invoke(1, 3))
    println(kFunction2(3, 4))
}

fun foo(x: Int) = println(x)

fun sum(a: Int, b: Int): Int {
    return a + b;
}
