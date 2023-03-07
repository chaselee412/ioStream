package com.charles.chapter14.convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo04 {
    /*

    利用字节流读取文件中的数据，每次读一整行，且不能出现乱码
    1。字节流在读取中文的时候 ，是会出现乱码的，但是只有字符流可以
    2。字节流没有读一整行方法， 只有字符缓冲流才能搞定

     */
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("e.txt");
//        InputStreamReader isr = new InputStreamReader(fis); //字符流
//        BufferedReader br = new BufferedReader(isr); //字符缓冲流
//        String str = br.readLine();
//        System.out.println(str);
//        br.close();       //可以多次嵌套

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e.txt")));
        String str;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }

        br.close();
    }
}

