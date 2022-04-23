package com.com.lwj.hutool;

import java.util.HashMap;
import java.util.Map;

/**
 * 求斐波那契数列的第n项
 *
 */
public class feibonaqie {



        Map<Integer,Integer> map = new HashMap<>();
        public int add(int a){
            if (a == 0){ return 0; }
            if (a ==1){return 1;}

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
            feibonaqie letcode70 = new feibonaqie();
            int a = letcode70.add(10);
            System.out.println(a);

        }
    }

