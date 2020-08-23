package com.ixiongyu.interfaces

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午8:34
 */
open class Button : Clickable, Focusable {
    override fun click() {
        println("click  me")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }


}
