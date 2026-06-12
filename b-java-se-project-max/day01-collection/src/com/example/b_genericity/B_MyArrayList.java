package com.example.b_genericity;

import java.util.ArrayList;

// 自定义泛型类
public class B_MyArrayList<E> {
    private ArrayList<E> list = new ArrayList<>();

    public boolean add(E e) {
        list.add(e);
        return true;
    }

    public boolean remove(E e) {
        return list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
