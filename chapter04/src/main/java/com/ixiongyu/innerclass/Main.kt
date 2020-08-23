package com.ixiongyu.innerclass

import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream

/**
 * Kotlin中没有显示修饰符的嵌套类于java中的static修饰的是一样的。
 * Kotlin中inner修饰的嵌套类和java中非static嵌套类是一样的
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午9:28
 */
fun main(args: Array<String>) {
    val kotlinButton = KotlinButton()
    val currentState = kotlinButton.getCurrentState()
    val objectOutputStream = ObjectOutputStream(FileOutputStream(File("ktFile.txt")))
    objectOutputStream.writeObject(currentState)

}
