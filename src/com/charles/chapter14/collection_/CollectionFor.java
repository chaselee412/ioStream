package com.charles.chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑", 3));
        list.add(new Dog("大黄", 100));
        list.add(new Dog("大壮", 8));
        for (Object dog : list) {   //list不停取出元素对象扔给dog变量
            System.out.println("dog=" + dog);
        }
        int[] nums ={1,8,10,9};
        for (int i : nums) {
            System.out.println(i);
        }
        //创建 3 个 Dog {name, age} 对象，放入到 ArrayList 中，赋给 List 引用
        //用迭代器和增强 for 循环两种方式来遍历
        //增强for底层仍然是迭代器
        //增强for简化版的迭代器遍历
        //大写I shortcut
    }
}

class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
