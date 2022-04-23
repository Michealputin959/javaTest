package com.com.lwj.hutool;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.io.*;

/**
 * author: linweijie
 * DATE：  2022/4/23
 */
public class hello {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\39099\\Pictures\\jpg\\","1.txt");
        InputStream inputStream = new FileInputStream(file);

        File file2 = new File("C:\\Users\\39099\\Pictures\\jpg\\","2.txt");
        OutputStream outputStream = new FileOutputStream(file2);





        byte[] bytes = new byte[100];
        int len = -1;
StringBuilder stringBuffer = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1){
             stringBuffer.append(new String(bytes,0,len));

        }
        outputStream.write(stringBuffer.toString().getBytes());
        System.out.println(stringBuffer);
        inputStream.close();


    }

    public static void IO1() throws IOException{
        File file = new File("C:\\Users\\39099\\Pictures\\jpg\\1.txt");

        OutputStream outputStream = new FileOutputStream(file,true);
        String txt= "大家好！我是渣渣辉！";
        outputStream.write(txt.getBytes());
    }

    public void IO2(){

    }
}
