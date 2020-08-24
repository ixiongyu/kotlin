package com.ixiongyu.innerclass;

import java.io.*;

/**
 * 申明                java                      kotlin
 * 嵌套类              static class A            class A
 * 内部类              class A                   inner class  A
 *
 *
 * 定义在一个类内部的类，叫作“嵌套类”。嵌套类分为两种：static的和非static的。后者又有一个专门的名字，叫作“内部类”。
 * 如果JavaButton没有实现Serializable就会报错。因为java中内部类默认有存储他的外部类。如果把一个嵌套类申明为static，那么这个嵌套类就不会包含包围他的类的隐式调用
 * @author xiongyu
 * @version Create at ：2020/8/23 下午9:30
 */

public class JavaMain {
    public static void main(String[] args) throws IOException {

        JavaButton javaButton = new JavaButton();
        State currentState = javaButton.getCurrentState();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("state.txt")));
        objectOutputStream.writeObject(currentState);
        javaButton.restoreState(currentState);
    }
}
