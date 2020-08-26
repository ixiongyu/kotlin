package com.ixiongyu.sam

import com.ixiongyu.lambdaandcollection.Item

/**
 * @author  xiongyu
 * @version Create at ：2020/8/26 下午10:42
 */


fun delegateWork(f: JavaInterface): String {
    return f.doSomething(Item("kt", 12))

}

fun main() {
    val item = Item("xiongyu", 234)
    val javaDoSomething = JavaDoSomething(item)
    println(javaDoSomething.delegateWork { it.name + "haha" })
    delegateWork { it.name + "haha" }
    val kotlinComponent = KotlinComponent()
    println(kotlinComponent.delegateWork(object : KotlinInterface {
        override fun doSomething(item: Item): String {
            return item.name + "KotlinComponent"
        }

    }))


}


