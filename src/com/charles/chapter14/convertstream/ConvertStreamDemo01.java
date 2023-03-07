package com.charles.chapter14.convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo01 {
    /*
    利用转换流按照指定字符编码读取数据
     */
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("output.txt"),"GBK");
//        int ch;
//        while((ch=isr.read())!=-1){
//            System.out.println((char)ch);
//        }
//        isr.close();
        FileReader fr = new FileReader("output.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }
}

