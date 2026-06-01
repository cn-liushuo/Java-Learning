package com.example.g_methodreference;

import java.util.Arrays;
import java.util.Comparator;

public class C_Demo {
    public static void main(String[] args) {
        // 目标：特定类型的方法引用
        // 需求：有一个字符串数组，里面有一些人的名字都是，英文名称，请按照名字的首字母升序排序。
        String[] names = {"Tom", "Jerry", "Mixe", "angel", "Jack", "Andy", "Bobi", "曹操", "caocao"};

        // 把这个数组进行排序：Arrays.sort((names, Comparator))
        // Arrays.sort(names); // 默认就是按照首字母的编号升序排序。
        // 要求：忽略首字母的大小升序排序。(java官方默认是搞不定的，需要我们自己指定比较规则)
        // Arrays.sort(names, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         // o1 angel
        //         // o2 Andy
        //         return o1.compareToIgnoreCase(o2); // java 已经为我们提供了字符串按照首字母忽略大小写比较的方法：compareToIgnoreCase
        //     }
        // });

        // 简化
        // Arrays.sort(names, (o1,  o2) -> o1.compareToIgnoreCase(o2));

        // 特定类型的方法引用
        // 特定类的名称::方法
        // 使用场景：如果使用 lambda 表达式只是调用一个特定类型的实例方法，并且前面参数列表中的第一个参数作为方法的主调，后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用。
        Arrays.sort(names, String::compareToIgnoreCase);


        System.out.println(Arrays.toString(names));
    }
}
