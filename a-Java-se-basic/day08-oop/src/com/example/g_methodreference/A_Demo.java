package com.example.g_methodreference;

import java.util.Arrays;
import java.util.Comparator;

public class A_Demo {
    public static void main(String[] args) {
        // 目标：静态方法引用，演示一个场景
        test();
    }

    public static void test() {
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 35, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("金毛狮王", 53, 181.5, '男');
        students[3] = new Student("刘嘉玲", 35, 172.5, '女');
        students[4] = new Student("小昭", 19, 165.5, '女');
        students[5] = new Student("赵敏", 27, 167.5, '女');

        // 需求：按照年龄升序排序，可以调用 sun 公司写好的 API 直接对数据进行排序。
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        Arrays.sort(students, (o1, o2) -> Student.compareByAge(o1, o2));
        // 静态方法引用
        // 类名::静态方法
        // 使用场景：如果某个 lambda 表达式里只是调用一个静态方法，并且 ">" 前后参数的形式一致，就可以使用静态方法引用。
        Arrays.sort(students, Student::compareByAge);

        // 遍历数组中的学生对象开始输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
