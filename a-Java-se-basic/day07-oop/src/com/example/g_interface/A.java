package com.example.g_interface;

// 接口：使用interface关键字定义的
public interface A {
    // JDK8之前，接口中只能定义常量和抽象方法。
    // 1、常量：接口中定义常量可以省略 public static final 不写，默认会加上去。
    String SCHOOL_NAME = "DLHJ";
    // public static final String SCHOOL_NAME = "DLHJ";

    // 2、抽象方法: 接口中定义抽象方法可以省略 public abstract ,默认会加上去。
    void run();

    String go();
}
