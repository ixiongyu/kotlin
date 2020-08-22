package com.xiongyu

import com.xiongyu.enum.Color

/**
 * @author  xiongyu
 * @version Create at ：2020/8/22 下午6:14
 */
object HelloWorld {

    @JvmStatic
    fun main(args: Array<String>) {


        println("Hello world")
        println(max(1, 3))
        println(min(1, 3))

        var name = "xiongyu"
        name = "xiongdayu"
        val gender = "man"
        //不能再赋值 val 不可变引用
//        gender='women'

        println("Hello,$name $args[0]")

        val person=Person("xiongyu",12)
        person.age=1
        println(person)

        val rectangle =Rectangle(1.0, 3.0)
        println(rectangle.isRectangle)

    }

    private fun max(a: Int, b: Int): Int {
        //在kotlin中if是有返回值的表达式
        return if (a > b) a else b
    }


    //表达式类型的函数返回值可以省略。为什么具有返回值代码块的函数不能省略呢，因为这个代码块可能会有多个返回值
    private fun min(a: Int, b: Int) = if (a > b) b else a
}
