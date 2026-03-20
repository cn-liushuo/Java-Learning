package com.example.e_javabean;

public class A_Test {
    public static void main(String[] args) {
        // 目标：搞清楚实体类是啥？搞清楚其基本作用和应用场景。
        // 实体类的基本作用：创建它的对象，存取数据（封装数据）
        Student s = new Student();
        s.setName("播妞");
        s.setChinese(100);
        s.setMath(100);
        System.out.println(s.getName());
        System.out.println(s.getChinese());
        System.out.println(s.getMath());

        Student s2 = new Student("播仔", 59, 80);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        // 实体类在开发中的应用场景。
        // 创建一个学生的操作对象专门负责对学生对象的数据进行业务处理。
        StudentOperator operator = new StudentOperator(s2);
        operator.printTotalScore();
        operator.printAverageScore();
    }
}
