package com.charles.chapter14.bytestream;

import java.io.*;
import java.lang.invoke.VarHandle;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Volumes/D/JAVAProject/ioStream/b.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Volumes/D/JAVAProject/ioStream/copy2.txt"));
        //循环读取写到目的地
        int b;
        while((b = bis.read())!=-1){
            bos.write(b);
        }
        bos.close();//在底层已经关掉基本流
        bis.close();
    }

}
