package com.mathjx.basic;

public class Basic {

    // Addition
    // ------- start ----

    public static int add(int a, int b) {

        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    // Addition
    // ---- end ------------

    // Subtraction
    // ---- start ------

    public static int sub(int a, int b) {

        return a - b;
    }

    public static double sub(double a, double b) {

        return a - b;
    }

    public static float sub(float a, float b) {

        return a - b;
    }

    public static long sub(long a, long b) {

        return a - b;
    }

    // Subtraction
    // ----- end -------

    // Multiplication
    // ------ start ------

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static long mul(long a, long b) {
        return a * b;
    }

    // Multiplication
    // ------ end -----

    // Face Value and Place Value
    // --- start ----

//    public static int fpValue (int num) {
//
//
//        int placeValue;
//
//        if (num == 0) {
//            placeValue = num;
//        }
//
//        while(num>0) {
//            if()
//        }
//
//        return placeValue;
//
//    }

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
}
