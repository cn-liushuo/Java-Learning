package com.example.b_loop;

public class WhileTest5 {
    public static void main(String[] args) {
        // 目标：完成while循环的需求：复利计算。
        System.out.println("需要多少年：" + calc());
    }

    // 复利计算：我们本金是10万，复利是1.7%。请问多少年后本金翻倍。
    public static int calc() {
        // 1. 定义变量记录程序需要处理的数据。
        double money = 100000;
        double rate = 0.017;
        int year = 0; // 需要存多少年

        // 2. 控制循环，只要发现当前本金还是小于目标金额200000时，需要继续存一年。
        while (money < 200000) {
            year++;
            // 金额计算一下。
            money = money * (1 + rate);
        }
        return year;
    }
}
