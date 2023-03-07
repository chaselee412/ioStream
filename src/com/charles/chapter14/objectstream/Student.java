package com.charles.chapter14.objectstream;

import java.io.Serializable;
/*
Serilizable 接口没有抽象方法，标记性接口
一旦实现接口， 表示当前的Student类可以被序列化
理解合格证
 */
public class Student implements Serializable {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
