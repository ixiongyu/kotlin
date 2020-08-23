package com.ixiongyu.innerclass

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午9:29
 */


interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}
