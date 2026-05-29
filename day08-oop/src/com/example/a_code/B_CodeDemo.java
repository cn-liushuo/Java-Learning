package com.example.a_code;

public class B_CodeDemo {
    private String name;
    private String[] direction = new String[4]; // 实例变量

    // 实例代码块：无 static 修饰，属于对象，每次创建对象时，都会优先执行一次
    // 基本作用：初始化对象的实例资源
    {
        System.out.println("实例代码块执行了");
        name = "dlhj"; // 赋值
        direction[0] = "N";
        direction[1] = "S";
        direction[2] = "E";
        direction[3] = "W";
    }

    public static void main(String[] args) {
        // 目标：实例代码块。
        System.out.println("main方法执行了");
        new B_CodeDemo();
        new B_CodeDemo();
        new B_CodeDemo();
    }
}
