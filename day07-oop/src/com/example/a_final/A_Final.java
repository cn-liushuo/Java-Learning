package com.example.a_final;

public class A_Final {
    // final 修饰静态成员变量
    // final 修饰静态变量，这个变量今后被称为常量，可以记住一个固定值，并且程序中不能修改了，通常这个值作为系统的配置信息。
    // 常量的名称，建议全部大写，多个单词用下划线链接
    public static final String COMPANY_NAME = "DLHJ";

    // final 修饰实例变量(一般没有意义)
    private final String name = "猪刚鬣";

    public static void main(String[] args) {
        // 目标：认识关键字 final 的作用
        // 3、final 修饰变量，变量有且仅能被赋值一次。
        /*
         * 变量有哪些呢？
         * a、成员变量:
         *     静态成员变量
         *     实例成员变量
         * b、局部变量
         * */
        final double rate = 3.14;
        // rate = 3.16; // 第二次赋值，报错。

        buy(0.8);

        A_Final f = new A_Final();
        System.out.println(f.name);
//        f.name = "高翠兰"; // 第二次赋值，报错。

        final int a = 20;
//        a = 30; // 二次赋值，报错。

        final int[] arr = {11, 22, 33, 44};
//        arr = new int[]{33,55,44}; // 二次赋值，报错。
        arr[2] = 90;
    }

    public static void buy(final double z) {
        // z = 0.1; // 第二次赋值，报错。
        System.out.println(z);
    }
}

// 1、final 可以修饰类，类不能被继承。
final class A {
}

//class B extends A {
//}

// 2、final修复方法，方法不能被重写。
class C {
    public final void show() {
        System.out.println("show方法执行了");
    }
}

class D extends C {
//    @Override
//    public void show() {
//        System.out.println("重写show方法执行了");
//    }
}