package com.example.a_branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // 目标：搞清楚switch分支结构的应用和书写，理解其执行流程。
        test1();
    }

    // 需求：根据男女的性别不同，推荐不同的书本信息给其观看。
    public static void test1() {
        // 1. 让用户输入自己的性别。
        System.out.println("请输入您的性别（男/女）：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next(); // "男" "女" "其他的"

        // 2. 根据用户输入的性别这个值，判断该做什么
        switch (sex) {
            case "男":
                System.out.println("推荐《JAVA从入门到精通》");
                break;
            case "女":
                System.out.println("推荐《从你的全世界路过》");
                break;
            default:
                System.out.println("你不是人，没有东西推荐！");
        }
    }
}
