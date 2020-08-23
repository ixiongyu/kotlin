package com.ixiongyu.collection;

import java.util.ArrayList;

/**
 * @author xiongyu
 * @version Create at ：2020/8/23 上午9:36
 */

public class JavaMain {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(2);
        objects.add(2);
        System.out.println(StringFunctions.toMyString(objects));
        System.out.println("2131");

        String name="xiongyu";
        System.out.println(KotlinExtensions.lastChar(name));
        System.out.println(KotlinExtensions.getLastCharStr(new StringBuilder(name)));

    }
}
