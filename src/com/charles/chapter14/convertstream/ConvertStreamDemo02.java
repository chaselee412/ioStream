package com.charles.chapter14.convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo02 {
    /*
    利用转换流按照指定字符编码写出
     */
    public static void main(String[] args) throws IOException {
//        //crear convert object
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output1.txt"),"GBK");
        osw.write("你好");
        osw.close();

    }
}

