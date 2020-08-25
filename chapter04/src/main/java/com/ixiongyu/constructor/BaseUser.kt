package com.ixiongyu.constructor

/**
 * @author  xiongyu
 * @version Create at ：2020/8/24 下午8:31
 */
interface BaseUser {
    //该属性必须被重写
    val head: String


    //可以被继承
    val emailName: String
        get() = head.substring(0, 2)
}
