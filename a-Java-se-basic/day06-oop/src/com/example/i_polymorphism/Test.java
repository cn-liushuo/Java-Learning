package com.example.i_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态的的代码。
        // 1、多态的好处1：右边对象是解耦合的。
        Animal a1 = new Tortoise();
        a1.run();
        // a1.shrinkHead(); // 多态下的一个问题：报错：多态下不能调用子类独有功能。

        // 2、多态的的好处2：父类类型的变量作为参数，可以接收一个子类对象。
        Wolf w = new Wolf();
        go(w);

        Tortoise t = new Tortoise();
        go(t);
    }

    // 动物游戏，所有动物都可以送给这个方法并开始跑步
    // 2、多态的的好处2：父类类型的变量作为参数，可以接收一个子类对象。
    public static void go(Animal a) {
        System.out.println("开始 . . . . ");
        a.run();
    }
}
