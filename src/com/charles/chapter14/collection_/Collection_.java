package com.charles.chapter14.collection_;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
    @SuppressWarnings({"all"})  //抑制警告
    public static void main(String[] args) {
        //Map
        //Collection
        //1. 集合主要是两组(单列集合 , 双列集合)单列是列表和集合， 双列就是字典
        //2. Collection 接口有两个重要的子接口 List Set , 他们的实现子类都是单列集合
        //3. Map 接口的实现子类 是双列集合，存放的 K-V
        //4. 把老师梳理的两张图记住
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        HashMap hashMap = new HashMap();
        hashMap.put("No1","CD");
        hashMap.put("No2","SH");
        hashMap.put("No3","BJ");

    }
}
