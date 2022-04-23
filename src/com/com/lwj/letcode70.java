package com.com.lwj;

import java.util.HashMap;
import java.util.Map;

public class letcode70 {
     Map<Integer,Integer> map = new HashMap<>();
    public int add(int a){
        if (a ==1){return 1;}
        if (a == 2){ return 2; }
        if (null!=map.get(a)){
            System.out.println(map.toString());
            return map.get(a);

        }else{
            int result = add(a-1)+add(a-2);
            map.put(a,result);
            return result;
        }

    }

    public static void main(String[] args) {
        letcode70 letcode70 = new letcode70();
        int a = letcode70.add(10);
        System.out.println(a);

    }
}
