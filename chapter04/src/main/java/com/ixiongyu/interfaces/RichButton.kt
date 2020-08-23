package com.ixiongyu.interfaces

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午9:00
 */
open class RichButton : Clickable, Focusable {
   final override fun click() {
        println("RichButton showOff")

    }

    override fun showOff() {
        println("RichButton showOff")
    }

    fun disable(disable: Boolean) {
        println("disable:${disable}")
    }

}
