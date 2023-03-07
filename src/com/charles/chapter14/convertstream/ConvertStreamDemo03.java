package com.charles.chapter14.convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo03 {
    /*
    利用转换流按照指定字符编码写出
     */
    public static void main(String[] args) throws IOException {
//        //crear convert object
        //GBT covert to UTF8
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("output.txt"),"GBK");
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f.txt"),"UTF-8");
//        int b;
//        while((b=isr.read())!=-1){
//            osw.write(b);
//        }
//        osw.close();
//        isr.close();
        //in the filefolder input "file -I filename"
        //2.supplement plan
        FileReader fr = new FileReader("output.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("g.txt",Charset.forName("UTF-8"));
        int b;
        while((b=fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();

    }
}

