package com.example.f_staticfield;

public class Student {
    // 静态变量(类变量): 有 static 修饰，属于类，只加载一份，可以被类和类的全部对象共享访问
    static String name;
    // 实例变量(对象变量): 没有 static 修饰，属于对象，每个对象都有一份。
    int age;
}
