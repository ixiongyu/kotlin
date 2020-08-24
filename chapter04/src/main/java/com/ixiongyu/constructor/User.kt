package com.ixiongyu.constructor

/**
 * 如果所有的构造方法参数都有默认值，kotlin或默认生成一个无参构造方法来使用默认的属性值，以此来简化调用
 * @author  xiongyu
 * @version Create at ：2020/8/24 下午8:09
 */
open class User(val nickName: String, val isSubscribed: Boolean = true) : BaseUser {
    override val head: String
        get() = "21"

}
