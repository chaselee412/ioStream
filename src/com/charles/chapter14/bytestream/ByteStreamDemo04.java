package com.charles.chapter14.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Volumes/D/FIN 5605 - Sample Exam 1.pdf");
        FileOutputStream fos = new FileOutputStream("/Volumes/D/JAVAProject/ioStream/copy.pdf");
        int b;
        while((b= fis.read())!=-1){
            fos.write(b);
        }
        //释放资源
        //先开的最后关闭
        fos.close();
        fis.close();
    }


}
