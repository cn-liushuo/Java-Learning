package com.example.a_extends;

public class A_Test {
    public static void main(String[] args) {
        // 目标：认识继承，好处。
        // 1、创建对象，封装老师数据
        // 子类可以继承父类的非私有成员
        // 子类对象其实是由子类和父类多张设计图共同创建出来的对象。
        Teacher t = new Teacher();
        t.setName("阿狸");
        t.setSkill("java、前端、mysql");
        t.setSex('男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
