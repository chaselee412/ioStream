package com.charles.chapter14.bytestream;

import java.io.*;

public class BufferedStreamDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Volumes/D/JAVAProject/ioStream/b.txt"));
        String Line;
        while (((Line = br.readLine())!=null)){
            System.out.println(Line);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt",true));
        bw.write("你能否看见");
        bw.newLine();
        bw.write("another test");
        bw.newLine();
        bw.close();

    }

}
