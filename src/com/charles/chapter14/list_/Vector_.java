package com.charles.chapter14.list_;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        //无参构造器
        //有参数的构造
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);

        }
        vector.add(100);
        System.out.println("vector=" + vector);
    }
}
/*
//老韩解读源码
//1. new Vector() 底层
public Vector() {
this(10);
}
补充：如果是 Vector vector = new Vector(8);
走的方法:
public Vector(int initialCapacity) {
this(initialCapacity, 0);
}
2. vector.add(i)
//下面这个方法就添加数据到 vector 集合
public synchronized boolean add(E e) {
modCount++;
ensureCapacityHelper(elementCount + 1);
elementData[elementCount++] = e;
return true;
}
//确定是否需要扩容 条件 ： minCapacity - elementData.length>0
private void ensureCapacityHelper(int minCapacity) {
// overflow-conscious code
if (minCapacity - elementData.length > 0)
    }
*/