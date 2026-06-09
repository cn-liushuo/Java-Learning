package com.example.d_innerclass;

public class A_Test {
    public static void main(String[] args) {
        // 目标：认识匿名内部类，搞清楚其基本作用
        // 匿名内部类实际上是有名字：外部类名$编号.class
        // 匿名内部类本质是一个子类，同时会立即构建一个子类对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("猫是喵喵喵的叫~~~");
            }
        };
        a.cry();
    }
}

// class Cat extends Animal {
//
//     @Override
//     public void cry() {
//         System.out.println("猫是喵喵喵的叫~~~");
//     }
// }
