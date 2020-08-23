package com.ixiongyu.innerclass

/**
 * 定义在一个类内部的类，叫作“嵌套类”。嵌套类分为两种：static的和非static的。后者又有一个专门的名字，叫作“内部类”。
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午9:50
 */
class KotlinButton : View {
    override fun getCurrentState(): State {
        return KtButtonState()
    }

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    /**
     * Kotlin中没有显示修饰符的嵌套类于java中的static修饰的是一样的。
     * Kotlin中inner修饰的嵌套类和java中非static嵌套类是一样的
     */
    inner class KtButtonState : State {

    }
}
