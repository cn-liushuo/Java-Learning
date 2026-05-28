package com.example.i_interface;

public class A_Test {
    public static void main(String[] args) {
        // 目标：完成接口的小案例
        // 1、定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据。
        // 2、开始准备学生数据，目前我们自己造一些测试数据
        Student[] allStudent = new Student[10];
        allStudent[0] = new Student("李逍遥", '男', 85.5);
        allStudent[1] = new Student("赵灵儿", '女', 92.0);
        allStudent[2] = new Student("悟空", '男', 78.5);
        allStudent[3] = new Student("素贞", '女', 88.0);
        allStudent[4] = new Student("郭靖", '男', 95.5);
        allStudent[5] = new Student("黄蓉", '女', 76.0);
        allStudent[6] = new Student("乔峰", '男', 82.5);
        allStudent[7] = new Student("甄嬛", '女', 90.0);
        allStudent[8] = new Student("韦小宝", '男', 67.5);
        allStudent[9] = new Student("小燕子", '女', 94.0);

        // 3、提供两套业务实现方案，支持灵活切换(解耦合)，面向接口编程
        // 3.1、定义一个接口(规范思想)：必须完成打印全班学生信息，打印平均分(ClassDataInter)
        // 3.2、定义第一套实现类：实现接口：实现打印学生信息，实现打印平均分
        // 3.3、定义第二套实现类：实现接口：实现打印学生信息(男女人数)，实现打印平均分(去掉最高分和最低分)
        ClassDataInter cdi = new A_ClassDataInterImpl(allStudent);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
