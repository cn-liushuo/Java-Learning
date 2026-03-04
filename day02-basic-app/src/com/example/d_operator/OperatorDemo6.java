package com.example.d_operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标：掌握逻辑运算符的使用
        System.out.println(isMatch(156, 55, '女')); // true
        System.out.println(isMatch(156, 55, '男')); // false

        System.out.println(isMatch2(170, 10000)); // true
        System.out.println(isMatch2(160, 200000)); // true
        System.out.println(isMatch2(160, 100)); // false

        isMatch3(true);

        System.out.println("--------------------------------------");

        isMatch4();

        System.out.println("--------------------------------------");

        print();
    }

    // 需求：判断啊某个人的条件是否满足择偶要求，如果满足返回true，否则是false。
    // 条件是：身高高于155，体重在50-60之间，且性别为女。
    // & 必须前后条件都是true，结果才是true，只要有一个为false，结果一定是false。
    public static boolean isMatch(int height, int weight, char sex) {
        boolean result = height > 155 & weight > 50 & weight < 60 & sex == '女';
        return result;
    }

    // 需求：找一个男朋友，要么身高高于170，要么收入高于10万。
    // | 只要有一个条件为true，结果就是true，只有两个条件都为false，结果才是false。
    public static boolean isMatch2(int height, int income) {
        boolean result = height >= 170 | income > 100000;
        return result;
    }

    // ! 非，你真我假，你假我真
    public static void isMatch3(boolean flag) {
        System.out.println(!flag);
    }

    // ^ 异或，条件相同为false，条件不同为true。
    public static void isMatch4() {
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(true ^ true); // false
        System.out.println(false ^ true); // true
    }

    // 判断 && || 与 & | 的区别。
    public static void print() {
        int a = 111;
        int b = 2;

        // System.out.println(a > 1000 && ++b > 1); // false && 发现左边条件为 false，右边直接不执行
        System.out.println(a > 1000 & ++b > 1); // false & 即便发现左边条件为 false，右边依旧执行
        System.out.println(b); // 2

        int i = 10;
        int j = 20;
        System.out.println(i > 6 || ++j > 1); // true || 发现左边条件为 true，右边直接不执行
        System.out.println(i > 6 | ++j > 1); // true | 即便发现左边条件为 true，右边依旧执行
        System.out.println(j); // 20
    }
}
