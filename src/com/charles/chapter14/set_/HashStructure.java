package com.charles.chapter14.set_;



public class HashStructure {
    public static void main(String[] args) {
        //模拟hashset的底层hashmap底层
        //创建一个数组 数组的类型是Node[]
        //Node数组就是表
        Node[] table = new Node[16];
        System.out.println(table);
//p520 8m:16s
    }
}
class Node{
    Object item;
    Node next;

}