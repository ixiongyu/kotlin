package com.xiongyu.smartcast

/**
 * @author xiongyu
 * @version Create at ：2020/8/22 下午8:03
 */
class Eval {
    fun eval(expr: Expr): Int {
        if (expr is Num) {
            return expr.value
        }

        if (expr is Sum) {
            return eval(expr.right) + eval(expr.left)

        }

        throw IllegalArgumentException("Unknown expression")
    }

    fun eval2(expr: Expr) = when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.right) + eval(expr.left)
        else -> throw IllegalArgumentException("Unknown expression")

    }

    fun evalWithLog(expr: Expr): Int = when (expr) {
        is Num -> {
            println("num is :${expr.value}")
            expr.value
        }
        is Sum -> {
            val left = evalWithLog(expr.left)
            val right = evalWithLog(expr.right)
            println("sum:${left}+${right}")

            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")

    }

}
