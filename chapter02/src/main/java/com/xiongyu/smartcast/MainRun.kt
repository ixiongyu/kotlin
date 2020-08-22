package com.xiongyu.smartcast

/**
 * @author  xiongyu
 * @version Create at ：2020/8/22 下午8:00
 */
object MainRun {
    @JvmStatic
    fun main(args: Array<String>) {
        val eval=Eval()
        println(eval.eval(Sum(Sum(Num(1), Num(2)), Num(4))))
        println(eval.eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
        println(eval.evalWithLog(Sum(Sum(Num(1), Num(2)), Num(4))))
    }
}
