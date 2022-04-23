package com.com.lwj.hutool;

public class testflex {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());


        long n=400;
        long a = 0;
        for (int i1 = 0; i1 < n; i1++) { a = a + 1;
            for (int i2 = 0; i2 < n; i2++) {a = a + 1;
                for (int i3 = 0; i3 < n; i3++) {a = a + 1;
                    for (int i4 = 0; i4 < n; i4++) {a = a + 1;

                    }
                }
            }
        }


        System.out.println(System.currentTimeMillis());
        System.out.println(a);
    }
}
