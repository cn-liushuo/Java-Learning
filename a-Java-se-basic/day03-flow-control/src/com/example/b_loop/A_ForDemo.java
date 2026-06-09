package com.example.b_loop;

public class A_ForDemo {
    public static void main(String[] args) {
        // 目标：掌握for循环的书写，搞清楚其执行流程
        test1();
    }

    public static void test1() {
        // 需求：使用for循环，打印三行HelloWorld
        /**
         * 计算机通过for知道要开启循环，然后立即执行 int i = 0
         * 接着判断循环条件 0 < 3，成立，执行循环体输出第一行Hello World，然乎执行 i++，i = 1
         * 接着判断循环条件 1 < 3，成立，执行循环体输出第二行Hello World，然乎执行 i++，i = 2
         * 接着判断循环条件 2 < 3，成立，执行循环体输出第三行Hello World，然乎执行 i++，i = 3
         * 接着判断循环条件 3 < 3，不成立，循环结束。
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
        // System.out.println(i); // 报错

        System.out.println("====================================");

        for (int i = 1; i < 6; i++) {
            // i = 1,2,3,4,5
            System.out.println("Hello World!");
        }

        System.out.println("====================================");

        for (int i = 1; i <= 9; i += 2) {
            // i = 1,3,5,7,9
            System.out.println("Hello World!");
        }
    }
}
