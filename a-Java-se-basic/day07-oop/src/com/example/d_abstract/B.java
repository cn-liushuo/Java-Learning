package com.example.d_abstract;

// 一个类继承抽象类，必须重写完继承的全部抽象方法，否则这个类也定义成抽象类
public class B extends A {

    @Override
    public void show() {
        System.out.println("B类重写show方法");
    }
}
