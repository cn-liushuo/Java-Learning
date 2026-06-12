package com.example.a_exception;

/**
 * 自定义的编译时异常
 * 1、继承 Exception 做爸爸。
 * 2、重新 Exception 的构造器。
 * 3、哪里需要用这个异常返回，哪里就 throw
 */
public class C_AgeIllegalException extends Exception {
    public C_AgeIllegalException() {
    }

    public C_AgeIllegalException(String message) {
        super(message);
    }
}
