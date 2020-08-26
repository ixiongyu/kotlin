package com.ixiongyu.sam;

import com.ixiongyu.lambdaandcollection.Item;

/**
 * @author xiongyu
 * @version Create at ：2020/8/26 下午10:28
 */

public class JavaMain {
    public static void main(String[] args) {
        Item item = new Item("xiongyu", 123);
        JavaDoSomething javaDoSomething = new JavaDoSomething(item);
        javaDoSomething.delegateWork(Item::component1);
        System.out.println(item.component2());
    }
}
