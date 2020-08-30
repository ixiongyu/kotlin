package com.ixiongyu.nulls

/**
 * @author  xiongyu
 * @version Create at ：2020/8/27 下午9:17
 */
fun main(args: Array<String>) {
    println("你好".strLen())
    println(stringCanNullLen(null))
    val nullString:String?=null
    println(nullString.isNullOrBlank())

}


fun String.strLen() = this.length


fun stringLen(s: String) = s.length


/**
 * 存在的？表示改变量可以存储null。因此所有常见的类型默认都是非空的
 * ?.允许把一次null检查和一次方法执行合并调用 例如：if(s!=null) s.toUpperCase() else null和s?.toUpperCase()等效
 * 如果调用非null值的方法，则该方法会正常执行。但是如果是null，则调用不会发生。
 * 注意：?.的调用结果是可空的
 * ?: 运算符：如果前面不为空，则返回前面一部分，如果前面为null，则返回后面一部分
 */
fun stringCanNullLen(s: String?) = s?.length ?: 0


