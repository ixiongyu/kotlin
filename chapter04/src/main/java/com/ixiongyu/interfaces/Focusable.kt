package com.ixiongyu.interfaces

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午8:40
 */
interface Focusable {
    fun setFocus(focus: Boolean) {
        println("focus:${focus}");
    }

    fun showOff() = println("Focusable showOff")
}
