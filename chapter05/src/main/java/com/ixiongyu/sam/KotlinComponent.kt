package com.ixiongyu.sam

import com.ixiongyu.lambdaandcollection.Item

/**
 * @author  xiongyu
 * @version Create at ：2020/8/26 下午10:49
 */
class KotlinComponent(private val item: Item = Item("KotlinComponent",12)) {

    fun delegateWork(f: KotlinInterface): String {
        return f.doSomething(item)
    }

}
