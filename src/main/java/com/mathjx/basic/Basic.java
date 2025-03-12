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

    // Prime Number
    // ---- start ------

    public static boolean prime(int num) {


        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean prime(long num) {

        System.out.println("Fun Facts :-");
        System.out.println("  1. Prime Numbers are +ve Integers greater than 1.");
        System.out.println("  2. 2 is the only Even Prime Number.");
        System.out.println("  3. Prime Numbers are divisible by 1 and the number itself.");

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
