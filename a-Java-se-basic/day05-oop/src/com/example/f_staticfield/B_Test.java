package com.example.f_staticfield;

public class B_Test {
    public static void main(String[] args) {
        // 目标：了解静态变量的应用。
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.count);
    }
}
