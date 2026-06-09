package com.example.c_extendsmodifier;

import com.example.b_extendsmodifier.Fu;

public class A_Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
        // fu.privateMethod();
        // fu.method();
        // fu.protectedMethod();
        fu.publicMethod();
    }
}
