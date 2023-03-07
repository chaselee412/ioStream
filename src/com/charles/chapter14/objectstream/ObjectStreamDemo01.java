package com.charles.chapter14.objectstream;

import java.io.*;

public class ObjectStreamDemo01 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("chase",23);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("z.txt"));
        oos.writeObject(stu);
        oos.close();

    }

}
