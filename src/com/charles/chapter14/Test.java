package com.charles.chapter14;

import java.util.ArrayList;
import java.util.List;
/*
//模拟一个简单的双向链表
Node jack = new Node("jack");
Node tom = new Node("tom");
Node hsp = new Node("老韩");
//连接三个结点，形成双向链表
//jack -> tom -> hsp
jack.next = tom;
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
while (true) {
if(last == null) {
break;
}
//输出 last 信息
System.out.println(last);
last = last.pre;
}
//演示链表的添加对象/数据，是多么的方便
//要求，是在 tom --------- 老韩直接，插入一个对象 smith
//1. 先创建一个 Node 结点，name 就是 smith
Node smith = new Node("smith");
//下面就把 smith 加入到双向链表了
smith.next = hsp;
hsp.pre = smith;
tom.next = smith;
//让 first 再次指向 jack
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
//定义一个 Node 类，Node 对象 表示双向链表的一个结点
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
*/