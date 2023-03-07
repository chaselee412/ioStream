package com.charles.chapter14.map_;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        //finish code
        Map hashMap = new HashMap();
        hashMap.put(1, new Emp("jack", 3000000, 1));
        hashMap.put(2, new Emp("tom", 21000, 2));
        hashMap.put(3, new Emp("milan", 12000, 3));
        //遍历 2 种方式
//并遍历显示工资>18000 的员工(遍历方式最少两种)
        //1. 使用 keySet -> 增强 for
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            //先取value
            Emp emp = (Emp) hashMap.get(key);//object 对象类转成Emp，向下转
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
//2. 使用 EntrySet -> 迭代器
 //体现比较难的知识点
 //慢慢品，越品越有味道.
        Set entrySet = hashMap.entrySet();
        System.out.println("======迭代器======");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {                        //Entry 本身就是entryset的元素，用Map.entry 限制一下类型没问题
            Map.Entry entry = (Map.Entry) iterator.next();//Entry是Map里面的内部类，必须要转到map.entry这一步才能用getValue取到对应的值
            // 通过 entry 取得 key 和 value
            System.out.println(entry.getKey());
            Emp emp = (Emp) entry.getValue();
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
    }


}