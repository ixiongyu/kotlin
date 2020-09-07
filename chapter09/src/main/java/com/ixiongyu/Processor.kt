package com.ixiongyu

/**
 * @author  xiongyu
 * @version Create at ：2020/9/7 9:04 下午
 */
class Processor<T:Any> {

    fun process(value:T){
        println(value.hashCode())
    }
}
