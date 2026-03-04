package com.example.b_loop;

public class DoWhileDemo6 {
    public static void main(String[] args) {
        // 目标：认识do-while循环的写法，搞清楚其执行流程
        test1();
    }

    // 使用do-while循环，控制打印三行HelloWorld
    public static void test1() {
        // 特点：先执行后判断（一定会执行一次）
        int i = 0;
        do {
            System.out.println("Hello World!");
            i++;
        } while (i < 3);
    }
}
