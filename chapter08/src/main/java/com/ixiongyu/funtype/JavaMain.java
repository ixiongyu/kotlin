package com.ixiongyu.funtype;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author xiongyu
 * @version Create at ：2020/9/2 下午10:11
 */

public class JavaMain {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("12");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
    }
}
