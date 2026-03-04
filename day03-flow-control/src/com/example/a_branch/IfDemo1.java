package com.example.a_branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        // 目标，认识if语句，搞清楚写法和应用场景。（独立功能，独立成方法）
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int age = 20;
        if (age >= 18) {
            System.out.println("可以上网");
        }
        System.out.println("洗洗睡吧！");
        // 注意，if语句中如果只有一行代码，大括号可以省略不写
    }

    public static void test2() {
        // 需求：假如您的钱包金额是90元，现在要转出去80元。请用if分支实现。
        // 要求：钱够就提示转账成功，钱不够提示余额不足。
        int money = 90;
        if (money >= 80) {
            System.out.println("转账成功");
        } else {
            System.out.println("余额不足");
        }
    }

    public static void test3() {
        // 需求：有个绩效系统，每个月由主管给员工打分。
        // 会输出你这个月的绩效级别：A+ A B C D
        // 级别区间的情况：A+ 90-100 A 80 - 90 B 70-80 C 60-70 D 0-60
        System.out.println("请您录入该员工的分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A+");
        } else if (score >= 80 && score <90) {
            System.out.println("A");
        } else if (score >= 70 && score < 80) {
            System.out.println("B");
        } else if (score >= 60 && score < 70) {
            System.out.println("C");
        } else if (score >0 && score < 60) {
            System.out.println("D");
        } else {
            System.out.println("分数输入有误！");
        }
    }
}
