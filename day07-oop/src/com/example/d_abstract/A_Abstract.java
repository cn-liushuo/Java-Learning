package com.example.d_abstract;

public class A_Abstract {
    public static void main(String[] args) {
        // 目标：认识抽象类，抽象方法，搞清楚他们的特点。
        // 抽象类的核心特点，有得有失(得到了抽象方法的能力，失去了创建对象的能力)
        // 抽象类不能创建对象(重点)。
        // A a = new A(); // 报错了
        // 抽象类的使命就是被继承，就是为了生孩子。
        B b = new B();
        b.setName("张三");
        b.setAge(18);
        System.out.println(b.getName() + "---" + b.getAge());
        b.show();
        b.show1();
    }
}
