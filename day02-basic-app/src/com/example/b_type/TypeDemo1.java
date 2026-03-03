package com.example.b_type;

import org.w3c.dom.ls.LSOutput;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：认识自动类型转换，强制类型转换。
        byte a = 12;
        print(a); // 自动类型转换
        print2(a); // 自动类型转换

        System.out.println("===========================");

        int i = 20;
        // print3(i); // 类型范围大的变量不能直接赋值给类型范围小的变量，会报错的！！

        // 强制类型转换。类型 变量2 = (类型) 变量1
        byte j = (byte) i; // 强制类型转换
        print3(j);

        System.out.println("===========================");

        int m = 1500;
        byte n = (byte) m;
        System.out.println(m);
        System.out.println(n); // 出现数据溢出！！！

        System.out.println("===========================");

        double k = 3.14;
        int l = (int) k; // 浮点型转换成小型，直接去掉小数部分
        System.out.println(l); // 3
    }

    public static void print(int b) {
        System.out.println(b);
    }

    public static void print2(double c) {
        System.out.println(c);
    }

    public static void print3(byte j) {
        System.out.println(j);
    }
}
