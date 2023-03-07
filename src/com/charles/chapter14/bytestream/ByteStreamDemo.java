package com.charles.chapter14.bytestream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
//换行符
//windows \r\n
//Linux:    \n
//Mac:      \r
//如果想要续写手动打开续写开关true

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Volumes/D/JAVAProject/ioStream/a.txt",true);
        String str = "TomISHere";
        byte[] arr = str.getBytes();    //写出字节数组转换ASCII码
        System.out.println(Arrays.toString(arr));
        fos.write(arr);
        String wrap = "\r";
        byte[] bytes = wrap.getBytes();
        fos.write(bytes);
        String str2="666";
        byte[] arr2 = str2.getBytes();
        fos.write(arr2);
        fos.close();
    }
}
