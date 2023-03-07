package com.charles.chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

public class Collection_01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList(); ///List 是接口
        list.add("jack"); //add 是object的子类对象都能往里放
        list.add(10);
        list.add(true);
        System.out.println("list:"+list);
        list.remove(1);//删除第一个元素索引
        System.out.println("list"+list);
        list.remove(true); //指定删除某元素
        System.out.println("list"+list);
        System.out.println(list.contains("jack"));//T
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println("list"+list);
        //addall 添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("CD");
        list2.add("BJ");
        list.addAll(list2);
        System.out.println("list"+list);
        //containsAll 查找多个元素是否存在  包含关系
        System.out.println(list.containsAll(list2)); //T
        list.add("SH");
        list.removeAll(list2);
        System.out.println("list="+list);//"SH"

    }
}


