package com.example.hello;

/**
 * Java 开发的软件，功能的最小单位是一个一个的方法
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        printLine();
        printHelloWorld();
        printLine();
        System.out.println(sum(1, 2));
    }

    // 打印分割线
    public static void printLine() {
        System.out.println("----------------------------------------");
    }

    // 打印3行Hello World
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    // 求任意两个整数的和
    public static int sum(int a, int b) {
        return a + b;
    }
}
