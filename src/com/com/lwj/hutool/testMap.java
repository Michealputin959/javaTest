package com.com.lwj.hutool;

import java.util.HashMap;
import java.util.Map;

public class testMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,17);
        map.put(2,29);
        map.put(3,94);
        map.put(4,92);
        map.put(5,19);
        map.put(6,39);
        System.out.println(map.size());
        map.get(3);
        System.out.println(map.get(5));
        int id2=0;
        for (int i = 1; i <= map.size(); i++) {
            if (map.get(i).equals("92")) {
                id2 = map.get(i-1);
                break;
            }
        }
        System.out.println("id2="+id2);
    }
}
