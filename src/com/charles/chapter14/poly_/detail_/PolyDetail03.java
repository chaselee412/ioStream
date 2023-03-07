package com.charles.chapter14.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);// true
        System.out.println(bb instanceof AA);// true
//aa 编译类型 AA, 运行类型是 BB
//BB 是 AA 子类
        AA aa = new BB();
        System.out.println(aa instanceof AA);//判断aa的运行类型是否是X类型或X类型的子类型
        System.out.println(aa instanceof BB);
        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
//System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}
class AA {} //父类
class BB extends AA {}//子类