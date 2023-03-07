package com.charles.chapter14.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
//a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30      //方法优先走运行类型 因为a和newB的运行类型/内存地址绑定
        System.out.println(a.sum1());//?30-> 20      //属性没有动态绑定机制，哪里声明哪里使用
    }
}

class A {//父类
    public int i = 10;
    //动态绑定机制:
    public int sum() {//父类 sum()
        return getI() + 10;//20 + 10
    }

    public int sum1() {//父类 sum1()
        return i + 10;//10 + 10
    }
    public int getI() {//父类 getI
        return i;
    }
}

class B extends A {//子类
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {//子类 getI()
        return i;
    }
    public int sum1() {
        return i + 10;  //找当前作用域的i
    }
}