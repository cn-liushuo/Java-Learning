package com.example.d_abstract;

// 抽象类
public abstract class A {
    private String name;
    private int age;

    public A() {
        System.out.println("A的无参构造器");
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法：必须用 abstract 修饰：没有方法体，只有方法名。
    public abstract void show();

    public void show1() {
        System.out.println("show1方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
