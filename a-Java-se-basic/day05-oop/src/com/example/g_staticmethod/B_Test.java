package com.example.g_staticmethod;

public class B_Test {
    public static void main(String[] args) {
        // 目标：静态方法的应用，可以做工具类。
        // 登录界面
        // 开发一个验证码程序
        String code = VerifyCodeUtil.getCode(4);
        System.out.println(code);

        System.out.println(Math.random()); // [0, 1)
    }
}
