package com.example.constructor;

public class A_Test {
    public static void main(String[] args) {
        // 目标：认识类的构造器，搞清楚其特点和常见应用场景
        // 构造器的特点：创建对象时，对象会立即自动调用构造器。
        Student si = new Student();
        Student si2 = new Student("西门吹雪");

        System.out.println("=========================");
        Student t1 = new Student();
        t1.name = "石轩";
        t1.age = 22;
        t1.sex = '男';
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.sex);
    }
}
