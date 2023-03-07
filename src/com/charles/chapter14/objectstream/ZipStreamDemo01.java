package com.charles.chapter14.objectstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Volumes/D/JAVAProject/JavaSE");
        File destParent =src.getParentFile();
        //File 表示压缩包的路径
        File dest = new File(destParent,src.getName()+".zip");
        System.out.println(dest);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //src里面每个文件编程zipentry对象放压缩包中
        toZip(src,zos, src.getName());

        zos.close();

    }
    /*
    获取src每个文件，编程zip entry对象，放压缩包当中
    数据源
    压缩流
    压缩包内部的路径
     */
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        //1。进入src文件夹
        File[] files = src.listFiles();
        //for
        for (File file : files) {

            if(file.isFile()){
                //p判断文件，变成zipentry对象，放到压缩包中
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());//aaa\\哈哈.txt
                zos.putNextEntry(entry);
                System.out.println();
                //  读取数据写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();//当前文件书写完毕
            }else{
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }


}
