package com.example.c_demo;

import java.util.Random;
import java.util.Scanner;

public class B_TEST {
    public static void main(String[] args) {
        // 目标：猜数字游戏
        guess();
    }

    public static void guess() {
        // 1. 生成随机数：1-100之间
        // 方式一：
        // Math.random() 返回 [0, 1) 之间的随机小数
        // Math.random() * 100 返回 [0, 100) 之间的随机整数 => [0, 99] + 1 => [1, 100]
        // int num = (int)(Math.random() * 100) + 1;
        // System.out.println(num);

        // 方式二：
        Random r = new Random(); // 得到一个随机数对象
        int luckNumber = r.nextInt(100) + 1; // [0, 99] + 1 => [1, 100]

        // 2. 定义一个死循环让用户一直猜，直到猜中才结束循环
        Scanner sc = new Scanner(System.in);
        while (true){
            // 3. 让用户输入猜测的数字
            System.out.println("请输入你猜的数字（1-100）：");
            int guessNumber  = sc.nextInt();

            // 4. 判断猜测的数字和随机数是否一致
            if (guessNumber == luckNumber) {
                System.out.println("恭喜您，猜对了！");
                break;
            } else if (guessNumber > luckNumber) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
        }
    }
}
