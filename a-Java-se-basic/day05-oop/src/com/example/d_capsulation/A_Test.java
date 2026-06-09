package com.example.d_capsulation;

public class A_Test {
    public static void main(String[] args) {
        // 目标：掌握封装的设计思想：合理隐藏，合理暴露。学会如何隐藏，如果暴露。
        Student s1 = new Student();
        s1.setAge(19); // 赋值
        System.out.println(s1.getAge()); // 取值
    }
}
