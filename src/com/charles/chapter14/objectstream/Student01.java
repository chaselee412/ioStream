package com.charles.chapter14.objectstream;

import java.io.Serial;
import java.io.Serializable;

/*
Serilizable 接口没有抽象方法，标记性接口
一旦实现接口， 表示当前的Student类可以被序列化
理解合格证
 */
public class Student01 implements Serializable {
    @Serial
    private String name;
    private int age;
    private String address;
    public Student01(){

    }
    public Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

