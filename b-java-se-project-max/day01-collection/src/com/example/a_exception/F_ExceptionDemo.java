package com.example.a_exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class F_ExceptionDemo {
    public static void main(String[] args) {
        // 目标：掌握异常的处理方案1：地城异常都抛出去给最外层调用者，最外层捕获异常，记录异常，响应合适的信息给用户观看。
        System.out.println("程序开始......");
        try {
            show();
            System.out.println("这次操作成功了~~~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("这次操作失败了~~~");
        }
        System.out.println("程序结束......");

    }

    // 定义一个方法认识编译异常。
    public static void show() throws Exception {
        // 编译异常：编译阶段报错，编译不通过
        String str = "2024-07-09 11:12:13";
        // 把字符串事件解析成 Java 中的一个日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员这里的程序很容易出错，请你注意！
        System.out.println(date);

        InputStream is = new FileInputStream("D:/meinv.png");
    }
}
