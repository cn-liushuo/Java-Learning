package com.example.a_exception;

public class C_ExceptionDemo {
    public static void main(String[] args) {
        // 目标：认识自定义编译时异常。
        System.out.println("程序开始......");
        try {
            saveAge(300);
            System.out.println("成功了！");
        } catch (C_AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("失败了！");
        }
        System.out.println("程序结束...");
    }

    // 需求：我们公司的系统只要收到了年龄小于1岁或者大于200岁就是一个年龄非法异常。
    public static void saveAge(int age) throws C_AgeIllegalException {
        if (age < 1 || age > 200) {
            // 年龄非法，抛出一个异常返回。
            throw new C_AgeIllegalException("年龄非法 age 不能低于 1 岁，不能高于 200 岁");
        } else {
            System.out.println("年龄合法");
            System.out.println("保存年龄" + age);
        }
    }
}
