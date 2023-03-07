package com.charles.chapter14.bytestream;

import java.io.*;

public class Test08 {
    public static void main(String[] args) throws IOException {
        /*
        实现一个验证程序运行次数的小程序，要求如下：
        第一次运行控制台输出： 欢迎使用本软件，第1次使用免费
        第二次运行控制台输出： 欢迎使用本软件，第2次使用免费
        第三次运行控制台输出： 欢迎使用本软件，第3次使用免费
        第四次及之后运行控制输出：本软件只能免费使用3次，欢迎您注册
        次数 计数器
        int count = 0;  //内存
        IO：随用随创建
         */

        //1.把文件中的数字读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("count.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        count++;
        //2.判断
        if(count<=3){
            System.out.println("welcome to the "+count+" use for free");
        }else{
            System.out.println("only have "+count+" to access data");
        }
        // 》3 正常运行
        // 《3 不能运行
        //自增count写回
        BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
        //bw,输出流若已存在文件，内容会被清空所以不能放20行的位置
        bw.write(count+"");//写97没有双引号输出a
        bw.close();


    }
}
