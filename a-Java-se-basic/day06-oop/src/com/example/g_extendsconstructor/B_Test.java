package com.example.g_extendsconstructor;

public class B_Test {
    public static void main(String[] args) {
        // 目标：子类构造器调用父类构造器的应用场景。
        // 可以把子类继承自父类这一部分的数据，也完成初始化赋值。
        Teacher t = new Teacher("dilei", "java、javascript", '男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
