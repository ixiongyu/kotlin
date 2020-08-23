package com.ixiongyu.interfaces

/**
 * 接口的成员始终是open的，不能改为final
 * 抽象类中的非抽象方法默认不是open的，但是可以改为open
 * 类的扩展函数不能访问他的private个protected成员
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午8:35
 */
fun main(args: Array<String>) {
    println(Button().click())
    //当实现的多个接口中有相同的默认方法，那实现类必须对这个重名方法有自己的实现 java也是一样的
    println(Button().showOff())
}
