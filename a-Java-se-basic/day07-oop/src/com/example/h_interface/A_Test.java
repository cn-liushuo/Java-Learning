package com.example.h_interface;

public class A_Test {
    public static void main(String[] args) {
        // 目标：去理解Java设计接口的好处、用处。
        // 接口弥补了类单继承的不足，可以让类拥有更多角色，类的功能更强大。
        People p = new Student();
        Driver d = new Student();
        BoyFriend bf = new Student();

        // 接口可以实现面向接口编程，更利于解耦合。
        Driver a = new Student();
        BoyFriend b = new Student();
    }
}

interface Driver {
};

interface BoyFriend {
};

class People {
};

class Student extends People implements Driver, BoyFriend {
};

class Teacher implements Driver, BoyFriend {
};
