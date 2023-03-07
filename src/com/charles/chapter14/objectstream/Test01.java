package com.charles.chapter14.objectstream;

import java.io.*;
import java.util.ArrayList;

public class Test01 {
    //序列化多个对象
    public static void main(String[] args) throws IOException {
        Student01 s1 =new Student01("zha",23,"BJ");
        Student01 s2 =new Student01("csa",20,"CD");
        Student01 s3 =new Student01("lla",26,"SH");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("z.txt"));


        ArrayList<Student01> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();

    }
}
