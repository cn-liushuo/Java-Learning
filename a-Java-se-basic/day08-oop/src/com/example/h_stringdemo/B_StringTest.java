package com.example.h_stringdemo;

public class B_StringTest {
    public static void main(String[] args) {
        // 目标：生成验证码
        String code = getCode(4);
        System.out.println(code);

        System.out.println(getCode(6));
    }

    // 帮我生成指定位数的随机验证码返回，每位可能是大小写字母或者数字。
    // 帮我用 String 变量记住全部要用到的字符。
    public static String getCode(int n) {
        // 1、定义一个变量记住所有字符
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // 2、定义一个变量用于记住验证码的随机字符
        String code = "";
        // 3、循环 n 次，每次生成一个随机字符，拼接成字符串。
        for (int i = 0; i < n; i++) {
            // 4、随机一个索引
            int index = (int) (Math.random() * str.length()); // [0, 1) * 50 = [0, 49]
            // 5、根据索引获取字符，拼接成字符串
            code += str.charAt(index);
        }
        // 6、返回验证码
        return code;
    }
}
