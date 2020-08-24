package com.ixiongyu.innerclass

/**
 * class 基类名称
sealed class 基类名称 {
class 子类1
class 子类2
}
这样，这个基类就变成了这两个子类专属的父类，其他子类无法继承这个基类


 如果一个类A继承了另一个B并且没有提供任何构造方法，那么A必须显式的调用B的构造方法。接口没有默认的构造方法，所以不需要

 如果想要自己的类不被实例话，就必须用private修饰构造方法

 * @author xiongyu
 * @version Create at ：2020/8/24 下午7:53
 */
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()

}

fun eval(expr: Expr): Int =
        when (expr) {
            is Expr.Num -> expr.value
            is Expr.Sum -> eval(expr.left) + eval(expr.right)
        }



