package com.example.b_loop;

public class ForTest2 {
    public static void main(String[] args) {
        // 目标：完成for循环求和的案例
        System.out.println("1的5的和是：" + sum(5));
    }

    public static int sum(int n) {
        // 1. 初始化一个变量，首先，你需要一个变量来存储累加和，初始值设为0.
        int sum = 0;
        // 2. 循环结构，因为要计算1到5的和，所以需要一个循环结构来以此处理这些数字，最简单的是使用for循环，从1遍历到5.
        for (int i = 1; i <= n; i++) {
            // i = 1,2,3,4,5
            // 3. 累加操作：在每次循环中，将当前数字累加在变量上
            sum += i;
        }
        // 4. 返回结果，循环结束后，返回累加变量的值，即为1到5的和。
        return sum;
    }
}
