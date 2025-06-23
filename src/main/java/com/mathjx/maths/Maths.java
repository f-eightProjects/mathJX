package com.mathjx.maths;

public class Maths {

    private Maths() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    /**
     * Returns the face and place value of a digit in a number.
     * @param num the number to analyze
     * @param digit the digit whose values are to be found
     * @return string showing face and place value
     */
    public static String facePlaceValue(int num, int digit) {
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

    /**
     * Tells whether a number is prime or not.
     * @param num (int) the number to be checked if it is prime or not.
     * @return true or false.
     */
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

    /**
     * Tells whether a number is prime or not.
     * @param num (long) the number to be checked if it is prime or not.
     * @return true or false.
     */
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
        double X = num;
        while(true) {
            root = 0.5 * (X + (num/X));
            double ans = X - root;
            if(Math.abs(ans) < total) {
                break;
            }
            X = root;
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
        return Maths.squareRoot(num1, 6) / Maths.squareRoot(num2, 6);
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
    public static double fracCbrt(double num1, double num2) {
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

}
