package com.charles.chapter14.bytestream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test04 {
    /*
     细节1：文件的数据不要换行
     细节2： bom头
     */
    public static void main(String[] args) throws IOException {
        //读取数据
        FileReader fr = new FileReader("/Volumes/D/JAVAProject/ioStream/b.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);
        //排序

        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);//方法引用 创建integer对象的数组
        //写出
        FileWriter fw = new FileWriter("/Volumes/D/JAVAProject/ioStream/b.txt");
        String s = Arrays.toString(arr).replace(", ","-");
        System.out.println(s);
        String result = s.substring(1, s.length() - 1);
        System.out.println(result);
        fw.write(result);
        fw.close();
    }
}
