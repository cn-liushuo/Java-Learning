package com.example.c_enum;

public class A_Test {
    public static void main(String[] args) {
        // 目标：认识枚举类，搞清楚其本质特点
        A a1 = A.X;
        System.out.println(a1);

        A a2 = A.Y;
        System.out.println(a2);

        System.out.println(a1.name()); // X
        System.out.println(a2.name()); // Y
        System.out.println(a1.ordinal()); // 索引 0
        System.out.println(a2.ordinal()); // 索引 1

    }
}
