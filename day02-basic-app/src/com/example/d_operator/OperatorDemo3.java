package com.example.d_operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 目标：掌握扩展的赋值运算符。
        receive(5);
    }

    // 需求：收红包
    public static void receive(int b) {
        // 拿到自己钱包的金额
        int a = 100;
        a += b; // 等价于 (a的类型) a = a + b;
        System.out.println("收到红包后，我的钱包金额是: " + a);

        byte a1 = 10;
        byte a2 = 20;
        a1 += a2; // 等价于 a1 = (byte) (a1 + a2); 扩展运算符自带强制类型转换。
        System.out.println(a1);
    }

    // 需求：其他几个扩展的赋值运算符
    public static void print() {
        int a = 10;
        a -= 5; // 等价于 a = (a的类型) a - 5;
        System.out.println(a); // 5

        int b = 10;
        b *= 5; // 等价于 b = (b的类型) b * 5;
        System.out.println(b); // 50

        int c = 10;
        c /= 5; // 等价于 c = (c的类型) c / 5;
        System.out.println(c); // 2

        int d = 10;
        d %= 5; // 等价于 d = (d的类型) d % 5;
        System.out.println(d); // 0
    }
}
