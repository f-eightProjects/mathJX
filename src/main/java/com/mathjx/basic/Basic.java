package com.mathjx.basic;

import java.util.Arrays;

public class Basic {

    // Face Value and Place Value
    // --- start ----

    public static String fpValue (int num, int digit) {

        int placeValue = 0, proxyNum = num, i = 1;

        if(num == 0) {
            return "0";
        } else {
            while(proxyNum > 0) {
                if(proxyNum % 10 == digit) {
                    placeValue = digit * i;
                }
                i *= 10;
                proxyNum /= 10;
            }
        }
        return "Face Value: " + digit + ", " + "Place Value: " + placeValue;
    }

    // Face Value Place Value
    // -----end------

    // Prime Number
    // ---- start ------

    public static boolean prime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i+=2) {
            if(num % i == 0) {
             return false;
            }
        }

        return true;
    }

    public static boolean prime(long num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if(num % 2 == 0) {
            return false;
        }

        for (long i = 3; i * i <= num; i+=2) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Prime Number
    // ----end------

    // Even and Odd
    // -- start ---

    public static String evenOdd(int num) {
        if(num == 0) {
            return "Even";
        }
        if(num == 1) {
            return "Odd";
        }
        if(num >= 2 && num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    // Even and Odd
    // --- end -----

    // Factor
    // ----- start -----

    public static int[] factor(int num) {
        int[] a = new int[num];
        int c = 0;
        if (num == 0){
            return new int[]{};
        }
        for(int i = 1; i <= num; i++) {
            if(num % i == 0)
            {
                a[c++] = i;
            }
        }
        // TODO
        return Arrays.copyOf(a,c);
    }

    // Factor
    // ------ end -----
}
