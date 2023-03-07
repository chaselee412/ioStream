package com.charles.chapter14.bytestream;

import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.tools.javac.Main;

import java.io.FileInputStream;

import java.io.IOException;

public class ByteStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Volumes/D/JAVAProject/ioStream/a.txt");
        int b1 = fis.read();
        System.out.println((char)b1);
        int b2 = fis.read();
        System.out.println((char)b2);
        int b3 = fis.read();
        System.out.println((char)b3);
        int b4 = fis.read();
        System.out.println((char)b4);
        int b5 = fis.read();
        System.out.println((char)b5);
        int b6 = fis.read();
        System.out.println(b6);//如果读不到字符则返回-1
        fis.close();

    }
    //字节输入流 FileInputStream
    //读取文件中的数据


}
