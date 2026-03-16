package com.example.array;

public class F_ArrayTest {
    public static void main(String[] args) {
        // 目标：完成数字华容道的初始化和随机乱序
        start(5);
    }

    public static void start(int n) {
        // 1、定义一个二维数组存储数字列表
        int[][] arr = new int[n][n];

        // 2、遍历二维数组，给二维数组赋值
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        printArray(arr);

        // 3、打乱二维数组中的元素顺序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int m = (int) (Math.random() * arr.length);
                int p = (int) (Math.random() * arr.length);
                int temp = arr[i][j];
                arr[m][p] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        System.out.println("----------------------------");

        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
