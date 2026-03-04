package com.example.a_branch;

public class B_IfTest {
    public static void main(String[] args) {
        // 目标：完成自动汽车驾驶程序的书写，以便可以根据红绿灯状态正确行驶。
        test1();
    }

    public static void test1() {
        // 1. 假设现在通过摄像头获取到了三种灯的状态信息如下
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        // 2. 根据这三种状态信息，完成自动汽车驾驶程序的书写。
        if (red) {
            System.out.println("红灯，停车！");
        } else if (yellow) {
            System.out.println("黄灯，减速！");
        } else if (green) {
            System.out.println("绿灯，通过！");
        } else {
            System.out.println("灯泡故障，停止！");
        }
    }
}
