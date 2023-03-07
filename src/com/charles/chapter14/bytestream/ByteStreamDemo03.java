package com.charles.chapter14.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流的循环读取
         */
        FileInputStream fis = new FileInputStream("/Volumes/D/JAVAProject/ioStream/a.txt");
        int b;
        while((fis.read()!=-1)){
            System.out.println((char)fis.read());//read 表示读取数据，读一个数据就移动一次指针输出 o I
        }
//        while ((b=fis.read())!=-1){
//            System.out.print((char)b);
//        }
        fis.close();


    }
    //字节输入流 FileInputStream
    //读取文件中的数据


}
