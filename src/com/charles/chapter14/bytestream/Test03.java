package com.charles.chapter14.bytestream;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test03 {
    /*
    \
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Volumes/D/JAVAProject/ioStream/b.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);
        String str = sb.toString();
        String[] arrstr = str.split("-"); //2-1-9-4-7-8
        //3.写出
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrstr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);

        FileWriter fw = new FileWriter("/Volumes/D/JAVAProject/ioStream/b.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1){

                fw.write(list.get(i)+"");//整数加字符串，字符串类型的整数
            }else{
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();

    }
} 
