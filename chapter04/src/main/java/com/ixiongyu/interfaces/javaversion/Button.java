package com.ixiongyu.interfaces.javaversion;

/**
 * @author xiongyu
 * @version Create at ：2020/8/23 下午8:46
 */

public class Button implements Clickable, Focusable {
    @Override
    public void showOff() {
        Clickable.super.showOff();
        Focusable.super.showOff();
    }

    @Override
    public void click() {

    }

    @Override
    public void setFocus(Boolean focus) {
    }
}
