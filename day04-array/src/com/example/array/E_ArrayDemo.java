package com.example.array;

public class E_ArrayDemo {
    public static void main(String[] args) {
        // 目标：二维数组的认识。
        printArray();
        printArray2();
    }

    public static void printArray() {
        // 初始化二维数组存储学生姓名，考虑到座位不规则，直接定义每排的座位
        // 静态初始化数组
        String[][] classrooms = {
                {"张无忌", "赵敏", "周芷若"}, // 第一排
                {"张三丰", "宋远桥", "殷梨亭"}, // 第二排
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"}, // 第三排
                {"杨逍", "纪晓芙"} // 第四排
        };

        // 访问：数组名[行索引]
        String[] names = classrooms[2];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 访问2：数组名[行索引][列索引]
        System.out.println(classrooms[1][1]);
        System.out.println(classrooms[2][2]);

        // 长度访问 数组名.length
        System.out.println(classrooms.length); // 4
        System.out.println(classrooms[3].length); // 2

        // 动态初始化数组
        int arr[][] = new int[3][5]; // 三行五列
    }

    public static void printArray2() {
        String[][] classrooms = {
                {"张无忌", "赵敏", "周芷若"}, // 第一排
                {"张三丰", "宋远桥", "殷梨亭"}, // 第二排
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"}, // 第三排
                {"杨逍", "纪晓芙"} // 第四排
        };

        for (int i = 0; i < classrooms.length; i++) {
            // i = 0 1 2 3
            String[] names = classrooms[i];
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("======================另一种遍历方式=========================");

        for (int i = 0; i < classrooms.length; i++) {
            for (int j = 0; j < classrooms[i].length; j++) {
                System.out.print(classrooms[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
