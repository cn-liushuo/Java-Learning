package com.example.c_thisdemo;

public class Student {
    // 成员变量
    String name;
    public void print() {
        // this 是一个变量，用在方法中，用于拿到当前对象。
        // 哪个对象，调用这个方法，this 就拿到哪个对象。
        System.out.println(this);
        System.out.println(this.name);
    }

    // 局部变量
    public void printHobby(String name) {
        System.out.println(this.name + "爱好是：" + name);
    }
}
