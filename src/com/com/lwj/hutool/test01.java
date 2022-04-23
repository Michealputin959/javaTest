package com.com.lwj.hutool;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.lang.Assert;

public class test01 {
    public static void main(String[] args) {
        String a = "小屋子";
        String encode = Base64.encode(a);
        System.out.println(encode);
        String decodeStr = Base64.decodeStr(encode);
        System.out.println(decodeStr);
    }
}
