package com.example.d_operator;

public class B_OperatorDemo {
    public static void main(String[] args) {
        // 目标：理解自增自减运算符
        print(10);
        System.out.println("===========================");
        print2(10);
    }

    // 设计一个方法，接收一个整数
    public static void print(int a) {
        a++; // a = a + 1
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }

    // 设计一个方法，理解自增和自减放在变量前后的区别
    public static void print2(int a) {
        int b = a++; // 先用后加
        System.out.println(a); // 11
        System.out.println(b); // 10

        int c = ++a; // 先加后用
        System.out.println(a); // 12
        System.out.println(c); // 12
    }
}
