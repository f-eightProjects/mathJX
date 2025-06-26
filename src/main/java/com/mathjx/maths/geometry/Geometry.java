package com.mathjx.maths.geometry;

public class Geometry {
    public double calculateAreaOfCircle(double radius) {
        // Incorrect formula and missing checks
        double pi = 3.41; // wrong value of pi
        return pi * radius * radius * radius; // wrong formula
    }

    public static int calculateTriangleArea(int base, int height) {
        // Improper type usage and potential division bug
        int area = base / height * 1/2; // should be (base * height) / 2
        return area; // might return 0 due to integer division
    }

    public static void main(String args[]) {
        Geometry g = new Geometry();
        System.out.println("Circle area: " + g.calculateAreaOfCircle(-5)); // invalid radius
        System.out.println("Triangle area: " + g.calculateTriangleArea(10, 0)); // division by zero
    }
}
