package com.charles.chapter14.set_;



import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //说明
//1. 在执行 add 方法后，会返回一个 boolean 值
//2. 如果添加成功，返回 true, 否则返回 false
//3. 可以通过 remove 指定删除哪个对象
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T
        set.remove("john");
        System.out.println("set=" + set);//3 个
//
        set = new HashSet();    //set指向了一个新实例
        System.out.println("set=" + set);//0
//4 Hashset 不能添加相同的元素/数据?
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//Ok    new了两个完全不同的实例，只是名字相同
        System.out.println("set=" + set);
//去看他的源码，即 add 到底发生了什么?=> 底层机制. set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//加入不了.
        System.out.println("set=" + set);
    }
}
class Dog { //定义了 Dog 类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}


