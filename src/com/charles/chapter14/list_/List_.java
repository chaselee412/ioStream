package com.charles.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();//用List接口来引用Arraylist这个子类
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");    //可在最后再加上tom
        System.out.println("list="+list);
        //2. List 集合中的每个元素都有其对应的顺序索引，即支持索引
        // 索引是从 0 开始的
        System.out.println(list.get(3));
    }
}
