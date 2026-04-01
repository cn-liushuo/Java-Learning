package com.example.g_extendsconstructor;

public class C_Test {
    public static void main(String[] args) {
        // 目标：理解this(...)调用兄弟构造器
        // 创建对象，存储一个学生的数据。
        Student s1 = new Student("张无忌", '男', 23);
        System.out.println(s1);

        Student s2 = new Student("赵敏", '女', 19, "清华大学");
        System.out.println(s2);
    }
}
