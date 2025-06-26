package com.mathjx.maths.core;

public final class Core {

    private Core() {
        throw new AssertionError("Cannot Instantiate");
    }

    /**
     * Returns the face and place value of a digit in a number.
     * @param num the number to analyze
     * @param digit the digit whose values are to be found
     * @return string showing face and place value
     */
    public static String facePlaceValue(int num, int digit) {
        int placeValue = 0;
        int proxyNum = num;
        int i = 1;
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

    /**
     * Tells whether a number is prime or not.
     * @param num (int) the number to be checked if it is prime or not.
     * @return true or false.
     */
    public static boolean isPrime(int num) {
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

    /**
     * Tells whether a number is prime or not.
     * @param num (long) the number to be checked if it is prime or not.
     * @return true or false.
     */
    public static boolean isPrime(long num) {
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

    /**
     * Tells whether a number is odd or even.
     * @param num the number to be checked if it is even or odd.
     * @return String: "Odd" if the number is odd, otherwise "Even".
     */
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

    /**
     * Returns factors of a given number.
     * @param num the number to be used for finding the factors.
     * @return integer array which contains factors.
     */
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
        int[] result = new int[c];
        System.arraycopy(a, 0, result, 0, c);
        return result;
    }

    //TODO
    // Sieve of Eratosthenes

    //TODO
    // HCF LCM Multiples

    /**
     * Returns multiples of a given number.
     * @param num the number to be used for finding the multiples.
     * @param n the number of multiples for the given number.
     * @return integer array which contains multiples.
     */
    public static int[] multiple(int num, int n) {
        int[] a = new int[n];
        int c = 0;
        if(num == 0) {
            return new int[]{};
        }
        for(int i = 1; i <= n; i++) {
            a[c++] = num * i;
        }
        int[] result = new int[c];
        System.arraycopy(a, 0, result, 0, c);
        return result;
    }

    /**
     * Returns square root of a number using <b>Newton-Raphson Algorithm</b>.
     * @param num the number we need to find the square root of.
     * @param precision the number of decimal places we need our to be accurate at.
     * @return double value with the precision provided, for e.g., if precision is 3
     * then value will be something like 0.000.
     */
    public static double squareRoot(double num, int precision) {
        double total = 1 / Math.pow(10, precision);
        double root;
        double x = num;
        while(true) {
            root = 0.5 * (x + (num/x));
            double ans = x - root;
            if(Math.abs(ans) < total) {
                break;
            }
            x = root;
        }
        return Math.round(root * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    /**
     * Returns the square root value of two numbers in fraction.
     * @param num1 the first number.
     * @param num2 the second number.
     * @return double value of sqrt(num1) / sqrt(num2).
     *
     * <p><b>Note:</b> Precision is set to <b>six</b>.</p>
     */
    public static double fractionSquareRoot(double num1, double num2) {
        return Core.squareRoot(num1, 6) / Core.squareRoot(num2, 6);
    }

    /**
     * Returns cube root of a number using <b>Newton-Raphson Algorithm</b>.
     * @param num the number we need to find the cube root of.
     * @param precision the number of decimal places till which we need to be our value to accurate.
     * @return double value with the precision provided, for e.g., if precision is 3
     * then value will be something like 0.000.
     */
    public static double cubeRoot(double num, int precision) {
        double x = num;
        double epsilon = 1 / Math.pow(10, precision);
        while (true) {
            double next = (2 * x + num / (x * x)) / 3;
            if (Math.abs(next - x) < epsilon) {
                break;
            }
            x = next;
        }
        return Math.round(x * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    /**
     * Returns the cube root value of two numbers in fraction.
     * @param num1 the first number.
     * @param num2 the second number.
     * @return double value of sqrt(num1) / sqrt(num2).
     *
     * <p><b>Note:</b> Precision is set to <b>six</b>.</p>
     */
    public static double fractionCubeRoot(double num1, double num2) {
        return cubeRoot(num1, 6) / cubeRoot(num2, 6);
    }

    //TODO
    // ratio

    /**
     * Calculates the percentage value of a given number.
     *
     * @param percent The percentage to apply (e.g., 25 for 25%).
     * @param value The base value to which the percentage is applied.
     * @return The calculated percentage of the base value.
     *
     * <p><b>Example:</b> If percent = 25 and value = 200, the result is 50.</p>
     */
    public static double percentage(double percent, double value) {
        return percent * value / 100;
    }

    /**
     * Calculates the percentage increase from an original value to a new value.
     *
     * @param original The original value before the increase.
     * @param afterIncrease The value after the increase.
     * @return The percentage increase from the original to the new value.
     *
     * <p><b>Example:</b> If original = 100 and afterIncrease = 120, the result is 20.0.</p>
     *
     * <p><b>Note:</b> If {@code original} is 0, this method will result in infinity.</p>
     */
    public static double percentageIncrease(double original, double afterIncrease) {
        if(original == 0.0) {
            throw new IllegalArgumentException("original value cannot be zero");
        }
        return ((afterIncrease - original) / original ) * 100.0;
    }

    /**
     * Calculates the percentage decrease from an original value to a new value.
     *
     * @param original The original value before the decrease.
     * @param afterDecrease The value after the decrease.
     * @return The percentage decrease from the original to the new value.
     *
     * <p><b>Example:</b> If original = 100 and afterDecrease = 70, the result is 30.0.</p>
     *
     * <p><b>Note:</b> If {@code original} is 0, this method will result in infinity.</p>
     */

    public static double percentageDecrease(double original, double afterDecrease) {
        return ((original - afterDecrease) / original) * 100.0;
    }

    //TODO
    //profit and loss

    /**
     * Returns simple interest and amount for the given p, r and t.
     *
     * @param p The principal amount (initial amount)
     * @param r The rate of interest.
     * @param t The time
     * @return a String containing the Simple Interest and Total Amount
     */
    public static String simpleInterest(double p, double r, double t) {
        double si = (p * r * t) / 100;
        return "Simple Interest: " + si + ", " + "Amount: " + (si + p);
    }

    /**
     * Computes the factorial of a non-negative integer using {@code long}.
     * <p>
     * This implementation is valid for inputs in the range 0 ≤ n ≤ 20.
     * For n = 0 or n = 1, the result is 1. If n > 20, the result cannot be
     * represented in a {@code long} and an exception is thrown.
     * </p>
     *
     * @param num the number whose factorial is to be calculated; must be ≥ 0
     * @return {@code n!} as a {@code long} (1 for n = 0 or n = 1)
     * @throws IllegalArgumentException if {@code n < 0}
     * @throws ArithmeticException if {@code n > 20} (overflow risk)
     */
    public static long factorial(long num) {
        if(num < 0) {
            throw new IllegalArgumentException("Number cannot be zero.");
        }
        if(num <= 1) {
            return 1;
        }
        if(num > 20) {
            throw new ArithmeticException("Overflow, will become too lengthy for long");
        }
        long factorial = 1;
        for(int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double power(double num, long exponent) {
        if(num == 0.0) {
            return 0.0;
        }
        if(exponent == 0) {
            return 1;
        }
        double power = 1.0;
        long e = exponent;
        if(e < 0) {
            num = 1 / num;
            e = -e;
        }
        while(e > 0) {
            if(e % 2 != 0) {
                power *= num;
            }
            e /= 2;
            num *= num;
        }
        return power;
    }

    public static double absoluteValue(double num) {
        if (Double.doubleToRawLongBits(num) == 0.0 || Double.doubleToRawLongBits(num) == -0.0) {
            return 0;
        }
        return num > 0 ? num : -num;
    }

    public static boolean isPalindrome(long num) {
        if(num <= 0) {
            throw new IllegalArgumentException("Palindrome checks are only for positive natural integers");
        }
        long p = num;
        long rev = 0;
        while(p > 0) {
            rev = rev * 10 + (p % 10);
            p /= 10;
        }
        return num == rev;
    }

    public static boolean isArmstrong(long num) {
        long a = num;
        long s = 0;
        while(a > 0) {
            long r = a % 10;
            s = s + (r * r * r);
            a /= 10;
        }
        return num == s;
    }

    public static boolean isNiven(long num) {
        long n = num;
        long s = 0;
        while(n > 0) {
            long r = n % 10;
            s += r;
            n /= 10;
        }
        if(s == 0) {
            throw new IllegalArgumentException("s cannot be zero");
        }
        return num % s == 0;
    }

    public static boolean isPerfect(long num) {
        if(num <= 1) {
            return false;
        }
        long s = 1;
        for(int i = 2; (long) i * i <= num; i++) {
            if (num % i == 0) {
                s += i;
                if((long) i * i != num) {
                    s += (num/i);
                }
            }
        }
        return s == num;
    }
}
