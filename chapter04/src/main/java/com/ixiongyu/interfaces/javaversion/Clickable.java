package com.ixiongyu.interfaces.javaversion;

/**
 * @author xiongyu
 * @version Create at ：2020/8/23 下午8:44
 */
public interface Clickable {
    default void showOff() {
        System.out.println("Clickable showOff");
    }

    void click();
}
