package com.example.j_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态的的代码。
        // 1、多态的好处1：右边对象是解耦合的。
        Animal a1 = new Tortoise();
        a1.run();
        // a1.shrinkHead(); // 多态下的一个问题：报错：多态下不能调用子类独有功能。

        // 强制类型转换
        Tortoise t1 = (Tortoise) a1;
        t1.shrinkHead();

        // 有继承关系就可以强制装欢，编译阶段不会报错！
        // 运行时可能会出现类型转换异常：ClassCastException
        // Wolf w1 = (Wolf) a1;

        System.out.println("=================================");

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
        // a.shrinkHead(); // 多态下的一个问题：报错：多态下不能调用子类独有功能。
        // java建议强制转换前，应该判断对象的真实类型，再进行强制类型转换。
        if (a instanceof Wolf) {
            Wolf w1 = (Wolf) a;
            w1.eatSheep();
        } else if (a instanceof Tortoise) {
            Tortoise t1 = (Tortoise) a;
            t1.shrinkHead();
        }
    }
}
