package com.charles.chapter14.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("sh");
        Node tom = new Node("bj");
        Node hsp = new Node("cd");
        //连接三个结点，形成双向链表
        //jack -> tom -> hsp
        jack.next =tom;
        tom.next = hsp;
        //hsp -> tom -> jack
        hsp.pre = tom;
        tom.pre = jack;
        Node first = jack;//让 first 引用指向 jack,就是双向链表的头结点
        Node last = hsp; //让 last 引用指向 hsp,就是双向链表的尾结点
        //演示，从头到尾进行遍历
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if(first == null) {
                break;
            }
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }
        //演示，从尾到头的遍历
        System.out.println("====从尾到头的遍历====");
        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        //演示链表的添加对象/数据，是多么的方便
        //要求，是在 tom --------- hsp之间，插入一个对象 smith
        //1. 先创建一个 Node 结点，name 就是 smith
        Node smith = new Node("sz");
        smith.next = hsp;
        hsp.pre = smith;
        tom.next = smith;
        smith.pre = tom;
        //让 first 再次指向 jack  first上面已经走到最后，需重制
        first = jack;//让 first 引用指向 jack,就是双向链表的头结点
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if(first == null) {
                break;
            }
        //输出 first 信息
            System.out.println(first);
            first = first.next;
        }
        last = hsp; //让 last 重新指向最后一个结点
        //演示，从尾到头的遍历
        System.out.println("====从尾到头的遍历====");
        while (true) {
            if(last == null) {
                break;
            }
        //输出 last 信息
            System.out.println(last);
            last = last.pre;
        }


    }
}
//定义一个Node类，Node的对象表示双向链表的一个节点
class Node {
    public Object item; //真正存放数据
    public Node next; //指向后一个结点
    public Node pre; //指向前一个结点
    public Node(Object name) {
        this.item = name;
    }
    public String toString() {
        return "Node name=" + item;
    }
}
