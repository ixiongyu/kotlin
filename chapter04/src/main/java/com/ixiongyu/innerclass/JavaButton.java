package com.ixiongyu.innerclass;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * @author xiongyu
 * @version Create at ：2020/8/23 下午9:30
 */

public class JavaButton implements View {


    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {
    }

    /**
     * 如果JavaButton没有实现Serializable就会报错。因为java中内部类默认有存储他的外部类。如果把一个嵌套类申明为static，那么这个嵌套类就不会包含包围他的类的隐式调用
     */
    public  class ButtonState implements State {

    }
}
