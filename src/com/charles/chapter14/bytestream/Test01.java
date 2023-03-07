package com.charles.chapter14.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {

        File src = new File ("/Volumes/D/JAVAProject/ioStream");
        File dest = new File ("/Volumes/D/dest");
        copydir(src,dest);
    }
    /*
    参数一数据源
    参数二目的地
     */
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();//若没有dest文件夹则会自主创建
        //递归
        //进入数据源
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            //判断文件， 拷贝，//从文件开始，从文件结束
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));//父级路径dest子集路径取拷贝的名字//拷贝过程中字节是写到文件中
                byte[] bytes = new byte[1024];
                int lens;//当前读取到了多少个字节
                while((lens= fis.read(bytes))!=-1){
                    fos.write(bytes,0,lens);
                }
                fos.close();
                fis.close();
            }else{
                copydir(file, new File(dest, file.getName()));
                //file子文件夹名字也被复制进来成为了目标路径，子文件夹路径被复制并在这个子文件夹里遍历，若子文件夹还有文件夹，继续套娃copydir函数
            }
        }

        //判断文件夹， 递归

    }
} 
