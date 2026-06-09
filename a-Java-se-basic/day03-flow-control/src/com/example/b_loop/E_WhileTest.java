package com.example.b_loop;

public class E_WhileTest {
    public static void main(String[] args) {
        // 目标：完成while循环的需求：复利计算。
        System.out.println("需要多少年：" + calc());
        System.out.println("需要折叠多少次：" + calc2());
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

    // 需求：珠穆朗玛峰高度是8848860，纸张厚度是0.1，折叠多少次可以达到山峰高度。
    public static int calc2() {
        // 1. 把数据拿到程序中来
        double height = 8848860;
        double thickness = 0.1;
        int count = 0;

        // 2. 控制循环，只要纸张厚度还没有达到珠穆朗玛峰的高度，就需要继续折叠
        while (thickness < height) {
            // 3. 计算折叠次数
            count++;
            // 4. 计算纸张厚度
            thickness *= 2; // thickness = thickness * 2;
        }
        // 5. 返回折叠次数
        return count;
    }
}
