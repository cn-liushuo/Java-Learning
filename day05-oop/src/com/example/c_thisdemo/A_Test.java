package com.example.c_thisdemo;

public class A_Test {
    public static void main(String[] args) {
        // 目标：认识 this 关键字，搞清楚 this 关键字的应用场景:
        // 1、主要用来解决变量名称冲突的问题
        Student s1 = new Student();
        s1.name = "张三";
        s1.print();
        System.out.println(s1);

        System.out.println("=============================");

        Student s2 = new Student();
        s2.print();
        System.out.println(s2);

        System.out.println("=============================");

        Student s3 = new Student();
        s3.name = "阿狸";
        s3.printHobby("唱歌");
    }
}
