package com.example.singleinstance;

// 设计成单例设计模式 -- 饿汉式单例
public class A {
    // 2、定义一个静态变量，用于记住本类的一个唯一对象。
    private static final A a = new A();

    // 1、私有化构造器: 确保单例类对外不能创建太多对象，单例才有可能性。
    private A() {
    }

    // 3、提供静态方法，返回这个类的唯一对象。
    public static A getInstance() {
        return a;
    }
}
