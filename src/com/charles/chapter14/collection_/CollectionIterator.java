package com.charles.chapter14.collection_;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        col.add("jack");
        System.out.println("col="+col);
        //希望能遍历col集合
        //1. 先得到 col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2. 使用 while 循环遍历
        while(iterator.hasNext()){ //判断是否还有数据
            //返回下一个元素，类型是 Object 和collection一样能在一起
            Object obj = iterator.next();
            //编译的类型是object，运行类型取决于真正运行的实例Line12/13/14，
            // 定义为泛型可以更多的包容更多object对象而不仅是Book类中的属性
            System.out.println("obj=" + obj);
        }
        //快速生成 while => itit
        //显示所有的快捷键的的快捷键 ctrl + j
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //3. 当退出 while 循环后 , 这时 iterator 迭代器，指向最后的元素
        //iterator.next();//NoSuchElementException
        //4. 如果希望再次遍历，需要重置我们的迭代器
        iterator =col.iterator();
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+ obj);  //父类类型相同可以通用遍历很爽
        }
    }
}



class Book {
    private String name;
    private String author;
    private double price;
    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}