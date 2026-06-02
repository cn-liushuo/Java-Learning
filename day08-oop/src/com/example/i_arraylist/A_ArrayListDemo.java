package com.example.i_arraylist;

import java.util.ArrayList;

public class A_ArrayListDemo {
    public static void main(String[] args) {
        // 目标：掌握 ArrayList 集合的基本使用。
        // 创建 ArrayList 对象，代表一个集合容器
        ArrayList<String> list = new ArrayList<>(); // 泛型定义集合
        // 添加数据
        list.add("java");
        list.add("java2");
        list.add("java3");
        list.add("赵敏");
        System.out.println(list); // [java, java2, java3, 赵敏]
        // 查看数据
        System.out.println(list.get(0)); // java
        System.out.println(list.get(1)); // java2
        System.out.println(list.get(2)); // java3
        System.out.println(list.get(3)); // 赵敏

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // i 0 1 2 3
            String s = list.get(i);
            System.out.println(s);
        }

        // 删除数据
        System.out.println(list.remove(2)); // 根据索引删除
        System.out.println(list);

        System.out.println(list.remove("赵敏")); // 根据元素删除
        System.out.println(list);

        // 修改数据
        list.set(0, "java4");
        System.out.println(list);
    }
}
