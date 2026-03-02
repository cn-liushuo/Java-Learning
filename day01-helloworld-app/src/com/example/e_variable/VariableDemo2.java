package com.example.e_variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标：掌握8种基本数据类型定义变量。
        printVariable();
    }

    // 请帮我设计一个方法，打印出8种基本数据类型定义的变量。
    public static void printVariable() {
        // 1、整型
        byte b = 10;
        // byte b2 = 128; // 越界了，报错
        short s = 20;
        int i = 30;
        // 注意：随便写一个数字字面量默认是int类型的。334254235555这个数据虽然没有超过long的范围，但是超过了int的范围，所以报错
        // 如果希望334254235555这个是long类型，需要显示的指定，加上L或l
        long l1 = 334254235555L;
        long l = 40;

        // 2、浮点型
        // 注意：随便写一个浮点数默认是double类型的。如果希望1.1是float类型的，必须加上f或F
        // float f2 = 1.1;
        float f = 1.1f;
        double d = 2.2;

        // 3、字符型
        char c = 'a';

        // 4、布尔型
        boolean flag = true;

        // 5、字符串类型（引用数据类型，后面再讲）：定义字符变量记住字符串数据的
        String str = "hello";
        System.out.println(str);
    }
}
