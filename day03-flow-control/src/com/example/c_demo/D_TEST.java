package com.example.c_demo;

public class D_TEST {
    public static void main(String[] args) {
        // 目标：找出101到200之间的全部素数。
        int count = 0;
        // 1. 遍历 101-200 之间的所有数
        for (int i = 101; i <= 200; i++) {
            // i  = 101 102 ... 200
            // 2. 每遍历一个数字，判断按这个数字是否为素数，是则输出。（独立功能独立成方法）
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("101-200之间的素数有" + count + "个");
    }

    public static boolean isPrime(int num) {
        // num = 101 / 102
        // 定义一个循环从2开始找到该数的一半，只要发现有一个数字能整除num这个数，num就不是素数。
        // 如果都没有找到，那么num就是素数。
        for (int i = 2; i < num / 2; i++) {
            // i = 2 3 4 5 ...
            // 2. 判断 num 是否能被 i 整除，能则返回 false，不能则返回 true
            if (num % i == 0) {
                return false;
            }
        }
        return true; // 是素数。
    }
}
