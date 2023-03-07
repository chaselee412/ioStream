package com.charles.chapter14.bytestream;

import javax.xml.transform.Source;
import java.io.*;

public class Test02 {
    /*
    ^两遍相同false
     两边不同true
     100：1100100
     10：1010
     1100100
     0001010
     ————————
      1101110    十进制110
     ^0001010
     ————————
      1100100    十进制100
     */
    public static void main(String[] args) throws IOException {
        System.out.println(100^10); //110
        System.out.println(110^10); //100
        FileInputStream fis = new FileInputStream("/Volumes/D/code/copy.pdf");
        FileOutputStream fos =   new FileOutputStream("/Volumes/D/code/redu.pdf");
        int b= 0;
        while((b= fis.read())!=-1){
            fos.write(b^2);
        }
        fos.close();
        fis.close();
    }
} 
