package com.charles.chapter14.objectstream;

import java.io.*;

public class ObjectStreamDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("z.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o);//只返回了地址
        ois.close();
    }
}
