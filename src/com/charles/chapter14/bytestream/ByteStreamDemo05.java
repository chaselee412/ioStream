package com.charles.chapter14.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo05 {
    public static void main(String[] args) throws IOException {
    /*
    public int read(byte[] buffer)
    
     */
        FileInputStream fis = new FileInputStream("/Volumes/D/JAVAProject/ioStream/a.txt");
        byte[] bytes = new byte[3];
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到多少个字节数据
        int len = fis.read(bytes);
        System.out.println(len);    //2
        String str = new String(bytes,0,len);
        System.out.println(str);

        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到多少个字节数据
        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);
        String str3 = new String(bytes,0,len3);//offset为初始， len3等于1
        System.out.println(str3);
        fis.close();

    }


}
