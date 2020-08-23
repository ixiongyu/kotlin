package com.ixiongyu.interfaces

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午9:18
 */
internal open class BadButton : Focusable {
    private fun yell() = println("yell")
    protected fun whisper() = println("whisper")
}

//fun BadButton.gaveSpeech() {
//    yell();
//    whisper()
//}
