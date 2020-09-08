package com.ixiongyu.outin

/**
 * @author  xiongyu
 * @version Create at ：2020/9/8 8:34 下午
 */
class Herd<T : Animal> {
    var i = 0;
    val size: Int
        get() {
            return i
        }

    operator fun get(i: Int): T? {
        return null
    }
}
