package com.mathjx.maths;

import com.mathjx.maths.core.Core;

import com.mathjx.maths.geometry.Geometry;

public final class Maths {

    private Maths() {
        throw new IllegalArgumentException("Utility Class");
    }

    public static String facePlaceValue(int num, int digit) {
        return Core.facePlaceValue(num, digit);
    }

    public static boolean prime(int num) {
        return Core.isPrime(num);
    }

    public static boolean prime(long num) {
        return Core.isPrime(num);
    }

    public static String evenOdd(int num) {
        return Core.evenOdd(num);
    }

    public static int[] factor(int num) {
        return Core.factor(num);
    }

    public static int[] multiple(int num, int n) {
        return Core.multiple(num, n);
    }

    public static double squareRoot(double num, int precision) {
        return Core.squareRoot(num, precision);
    }

    public static double fractionSquareRoot(double num1, double num2) {
        return Core.fractionSquareRoot(num1, num2);
    }

    public static double cubeRoot(double num, int precision) {
        return Core.cubeRoot(num, precision);
    }

    public static double fractionCubeRoot(double num, int precision) {
        return Core.fractionCubeRoot(num, precision);
    }

    public static double percentage(double percent, double value) {
        return Core.percentage(percent, value);
    }

    public static double percentageIncrease(double original, double afterIncrease) {
        return Core.percentageIncrease(original, afterIncrease);
    }

    public static double percentageDecrease(double original, double afterDecrease) {
        return Core.percentageDecrease(original, afterDecrease);
    }

    public static String simpleInterest(double p, double r, double t) {
        return Core.simpleInterest(p,r,t);
    }

    public static String circle(double radius) {
        return Geometry.circle(radius);
    }

    public static String rectangle(double length, double breadth) {
        return Geometry.rectangle(length, breadth);
    }
}
