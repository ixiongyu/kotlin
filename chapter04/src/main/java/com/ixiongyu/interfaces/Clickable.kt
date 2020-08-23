package com.ixiongyu.interfaces

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午8:34
 */
interface Clickable {
    fun click()
    //默认方法可以直接使用，也可以在实现内中有自己的实现
    fun showOff() = println("Clickable showOff")
}
