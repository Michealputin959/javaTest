package com.com.lwj.hutool;

import cn.hutool.Hutool;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//文件
public class testdownload {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\39099\\Pictures\\fileUpload\\01.jpg");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.lastModified());
        System.out.println(file.isHidden());
        System.out.println(timeStamp2Date(file.lastModified()));
    }

    public static String timeStamp2Date(Long time) {
       // Long timeLong = Long.parseLong(time);
        Long timeLong = time;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//要转换的时间格式
        Date date;
        try {
            date = sdf.parse(sdf.format(timeLong));
            return sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
}

}
