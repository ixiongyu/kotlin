package com.ixiongyu.interfaces.javaversion;

/**
 * @author xiongyu
 * @version Create at ：2020/8/23 下午8:44
 */
public interface Focusable {
    default void showOff() {
        System.out.println("Focusable showOff");
    }

    void setFocus(Boolean focus);
}
