package com.charles.chapter14.bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine())!=null){
            list.add(line);
        }
        System.out.println(list);
        br.close();
        //rank
        Collections.sort(list, new Comparator<String>() {   //如果有多余的空行， 则空行无法转换比较然后报错
            @Override
            public int compare(String o1, String o2) {
                //get o1 o2number
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });
        System.out.println(list);



    }


}
