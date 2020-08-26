package com.ixiongyu.sam;

import com.ixiongyu.lambdaandcollection.Item;

/**
 * @author xiongyu
 * @version Create at ：2020/8/26 下午10:28
 */

public class JavaDoSomething {
    private Item item;

    public JavaDoSomething(Item item) {
        this.item = item;
    }

    String delegateWork(JavaInterface f) {
        return f.doSomething(item);
    }

}
