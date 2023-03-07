package com.charles.chapter14.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo06 {
    public static void main(String[] args) throws IOException {
    /*
    public int read(byte[] buffer)
    
     */
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/Users/cai/Downloads/GMT20200908-220648_Derivative_1920x1080.mp4");
        FileOutputStream fos = new FileOutputStream("/Volumes/D/JAVAProject/ioStream/copy1.mp4");
        byte[] bytes = new byte[1024*1024*5];   //一次性写5MB的数组
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);//最后一次读写的时候可能装不满数组，先要量出最后这个数组的可读长度len
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


}
