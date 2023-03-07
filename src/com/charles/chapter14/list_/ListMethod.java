package com.charles.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        //在 index = 1 的位置插入一个对象
        list.add(1, "韩顺平");//如果不给index默认插入最后
        System.out.println("list=" + list);
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);//在 index = 1 的位置插入一个对象
        System.out.println("list"+list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf("韩顺平"));   //2 //返回 list 在集合中首次出现的位置
        list.add("韩顺平");
        System.out.println(list.lastIndexOf("韩顺平"));
        list.remove(0);
        list.set(1,"mary");//相当于是替换
        System.out.println("list="+list);
        //list.set(10,"jack");不能越界
        List returnlist = list.subList(0, 2);//前闭后开
        System.out.println("returnlist=" + returnlist);
    }
}
