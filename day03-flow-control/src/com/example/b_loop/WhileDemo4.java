package com.example.b_loop;

public class WhileDemo4 {
    public static void main(String[] args) {
        // 目标：认识while循环的写法，搞清楚其执行流程
        test1();
    }

    public static void test1() {
        int i = 0;
        while (i < 3) {
            System.out.println("Hello World！");
            i++;
        }
    }
}
