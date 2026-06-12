package com.example.b_genericity;

public class B_GenericDemo {
    public static void main(String[] args) {
        // 目标：学会自定义泛型类
        // 需求：请您模拟 ArrayList 集合自定义一个  MyArrayList
        // B_MyArrayList<String> list = new B_MyArrayList<String>();
        B_MyArrayList<String> mlist = new B_MyArrayList<>(); // JDK 7开始支持后面的类型可以不写
        mlist.add("hello");
        mlist.add("world");
        // list.add(555); // 报错
        mlist.add("java");
        mlist.add("javaScript");

        System.out.println(mlist.remove("world"));

        System.out.println(mlist);
    }
}
