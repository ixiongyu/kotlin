package com.ixiongyu.sevenone

/**
 * @author  xiongyu
 * @version Create at ：2020/8/31 下午9:16
 */
data class Point(val x: Int, val y: Int) {
    //重载运算符的所有函数都需operator标记
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}
