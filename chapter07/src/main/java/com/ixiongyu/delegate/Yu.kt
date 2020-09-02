package com.ixiongyu.delegate

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * @author  xiongyu
 * @version Create at ：2020/9/2 下午8:55
 */
class Yu {
    var age: Int by Delegates.observable(18) { property: KProperty<*>, oldValue: Int, newValue: Int ->
        println("property'name is ${property.name}, oldValue = $oldValue, newValue = $newValue")
    }

    var vetoable: Int by Delegates.vetoable(18) { property: KProperty<*>, oldValue: Int, newValue: Int ->
        println("property'name is ${property.name}, oldValue = $oldValue, newValue = $newValue")
        newValue>=18
    }
}

fun main() {
    val yu = Yu()
    println(yu.age)
    yu.age=12
    println(yu.age)
    println(yu.vetoable)
    yu.vetoable=12
    println(yu.vetoable)
    yu.vetoable=22
    println(yu.vetoable)
}
