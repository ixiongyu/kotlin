package com.ixiongyu.delegate

import kotlin.reflect.KProperty

/**
 * @author  xiongyu
 * @version Create at ：2020/9/1 下午9:25
 */
class Delegate {



    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}
