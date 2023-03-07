package com.charles.chapter14.objectstream;

import java.io.*;
import java.util.ArrayList;

public class Test02 {
    //序列化多个对象
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("z.txt")));
        ArrayList<Student01> list =(ArrayList<Student01>) ois.readObject(); //读取对象又强制转成此类型
        for (Student01 student01 : list) {
            System.out.println(student01);
        }
        ois.close();
    }
}
