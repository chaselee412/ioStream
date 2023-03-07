package com.charles.chapter14.bytestream;

import java.io.*;
import java.util.*;

public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c.txt"));
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while((line= br.readLine())!=null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();

    }


}
