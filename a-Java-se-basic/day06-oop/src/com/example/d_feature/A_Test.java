package com.example.d_feature;

public class A_Test {
    public static void main(String[] args) {
        // 目标：继承的注意事项，继承的特点
        A a = new A();

        B b = new B();
    }
}

// 1. java 的类只能是单继承的，不支持多继承，支持多层继承
// 2. 一个类要么直接继承 Object 类，要么默认继承 Object 类，要么间接继承Object 类
class A {
}

class B extends A {
}

class C extends B {
}
