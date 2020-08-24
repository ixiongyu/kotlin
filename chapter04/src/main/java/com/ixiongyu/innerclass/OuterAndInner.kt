package com.ixiongyu.innerclass

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午10:37
 */
class OuterAndInner {
    inner class Inner {
        fun getRef(): OuterAndInner = this@OuterAndInner
    }
}
