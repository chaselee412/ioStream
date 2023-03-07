package com.charles.chapter14.bytestream;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Volumes/D/JAVAProject/ioStream/b.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Volumes/D/JAVAProject/ioStream/copy2.txt"));
        //循环读取写到目的地
        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();//缓冲流减少了与磁盘的交互次数
    }

}
