package com.example.f_abstract;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的使用场景之二：模板方法设计模式。
        // 学生和老师都要写一篇作文：《我的爸爸》
        //                  第一段是一样的：我爸爸是一个好人，我特别喜欢他，他对我很好，我来介绍一下：
        //                  第二段是不一样的：老师和学生各自写各自的。
        //                  第三段是一样的：我的爸爸真好，你有这样的爸爸吗？
        // 解决：抽出一个父类，父类中还抽出一个模板方法给子类直接用。
        Student s = new Student();
        s.write();
    }
}
