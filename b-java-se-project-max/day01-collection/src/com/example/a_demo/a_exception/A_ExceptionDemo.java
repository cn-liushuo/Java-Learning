package com.example.a_demo.a_exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A_ExceptionDemo {
    public static void main(String[] args) {
        // 目标：认识异常的体系，搞清楚异常的基本作用
        // show();
        try {
            // 监视代码，出现异常，会被 catch 拦截住这个异常
            show2();
        } catch (Exception e) {
            e.printStackTrace(); // 打印这个异常信息
        }
    }

    // 定义一个方法认识编译异常。
    public static void show2() throws Exception {
        System.out.println("=====程序开始=====");
        // 编译异常：编译阶段报错，编译不通过
        String str = "2024-07-09 11:12:13";
        // 把字符串事件解析成 Java 中的一个日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员这里的程序很容易出错，请你注意！
        System.out.println(date);

        InputStream is = new FileInputStream("D:/meinv.png");

        System.out.println("=====程序结束=====");
    }

    // 定义一个方法认识运行时异常
    public static void show() {
        System.out.println("=====程序开始=====");
        // 运行时异常的特点：编译时不报错，运行时出现的异常，继承自 RuntimeException.
        int[] arr = {1, 2, 3};
        // System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

        // System.out.println(10 / 0); // ArithmeticException

        // 空指针异常
        String str = null;
        System.out.println(str);
        System.out.println(str.length()); // NullPointerException

        System.out.println("=====程序结束=====");
    }
}
