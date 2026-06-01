package com.example.d_innerclass;

public class B_Test {
    public static void main(String[] args) {
        // 目标：搞清楚匿名内部类的使用形式(语法)：通常可以做为一个对象参数传输给方法使用。
        // 需求：学生、老师都要参加游泳比赛。
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生🏊‍贼快");
            }
        };
        start(s1);

        System.out.println("===============");

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师🏊‍贼六");
            }
        });
    }

    // 设计一个方法，可以接收老师，和学生开始比赛。
    public static void start(Swim s) {
        System.out.println("开始...");
        s.swimming();
        System.out.println("结束...");
    }
}

interface Swim {
    void swimming(); // 游泳方法
}
