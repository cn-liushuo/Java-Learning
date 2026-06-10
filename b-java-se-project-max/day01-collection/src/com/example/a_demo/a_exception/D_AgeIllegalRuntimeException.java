package com.example.a_demo.a_exception;

/**
 * 自定义的编译时异常
 * 1、继承 RuntimeException 做爸爸。
 * 2、重新 RuntimeException 的构造器。
 * 3、哪里需要用这个异常返回，哪里就 throw
 */
public class D_AgeIllegalRuntimeException extends RuntimeException {
    public D_AgeIllegalRuntimeException() {
    }

    public D_AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
