package com.example.j_interface;

public class A_Test {
    public static void main(String[] args) {
        // 目标：搞清楚接口新增的三种方式，并理解其好处。
        AImpl a = new AImpl();
        a.go();
        A.show();
    }
}

class AImpl implements A {

}
