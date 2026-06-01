package com.example.e_lambda;

public class A_Lambda {
    public static void main(String[] args) {
        // 目标：认识 lambda 表达式：搞清楚其基本最用。
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("猫是喵喵喵的叫~~~");
            }
        };
        a.cry();

        // 错误示范：lambda 并不是可以简化全部的匿名内部类，lambda 只能简化函数式接口的匿名内部类。
        // Animal a1 = cry() -> {
        //     System.out.println("猫是喵喵喵的叫~~~");
        // }
        // a1.cry();

        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳贼快");
            }
        };
        s1.swimming();

        // 简化：lambda 只能简化函数式接口的匿名内部类
        Swim s2 = () -> {
            System.out.println("学生游泳贼快");
        };
        s2.swimming();
    }
}

abstract class Animal {
    public abstract void cry();
}

// 函数式接口：只有一个抽象方法的接口.
@FunctionalInterface // 声明函数式接口的注解
interface Swim {
    void swimming();
}
