package com.charles.chapter14.bytestream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo07 {
    public static void main(String[] args) {
        FileInputStream fis = null; //fis为局部变量会报错,要声明全局变量
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/Users/cai/Downloads/GMT20200908-220648_Derivative_1920x1080.mp4");//如果路径不存在，连接没有建立，则传输空指针异常
            fos = new FileOutputStream("/Volumes/D/JAVAProject/ioStream/copy1.mp4");
            byte[] bytes = new byte[1024*1024*5];   //一次性写5MB的数组
            int len;
            while((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);//最后一次读写的时候可能装不满数组，先要量出最后这个数组的可读长度len
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();    //close再嵌套一个try catch 因为close也会报异常
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
