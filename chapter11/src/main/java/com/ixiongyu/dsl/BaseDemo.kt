package com.ixiongyu.dsl

/**
 * @author  XiongYu
 * @version Create at ：2020/10/16 11:19
 */


fun buildingStr(buildAction: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    buildAction(sb)
    return sb.toString()
}


fun buildingStr2(buildAction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.buildAction()
    return sb.toString()
}

fun main() {
    val buildingStr = buildingStr(fun(it: StringBuilder) {
        it.append("da")
        it.append("ye")
    })
    println(buildingStr)

    val buildingStr2 = buildingStr2(fun StringBuilder.() {
        append("s")
        append("12131i").deleteCharAt(0)
    })
    println(buildingStr2)
}
