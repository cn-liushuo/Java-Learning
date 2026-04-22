package com.example.singleinstance;

// 设计成单例设计模式 -- 懒汉式单例
public class B {
    // 2、私有化静态变量
    private static B b;
    // 1、私有化构造器
    private B() {

    }

    // 3、提供静态方法返回对象。 真正需要对象的时候，才创建对象。
    public static B getInstance() {
        if (b == null) {
            // 第一次拿对象时，会创建对象，给静态变量b记住。
            b = new B();
        }
        return b;
    }
}
