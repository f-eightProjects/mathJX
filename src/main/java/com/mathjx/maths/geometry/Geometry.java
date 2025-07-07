package com.mathjx.maths.geometry;

import com.mathjx.maths.core.Core;

import static com.mathjx.maths.core.Core.power;
import static com.mathjx.maths.core.Core.squareRoot;

/**
 * The {@code Geometry} class provides mathematical utility functions related to geometry
 * for the MathJX mathematics library.
 * <p>
 * This is a utility class that contains static constants and methods only.
 * It cannot be instantiated and is declared {@code final} to prevent subclassing.
 * </p>
 */
public class Geometry {

    private static final double PI =  3.141592653589793;
    /**
     * Private constructor to prevent instantiation of this utility class.
     * <p>
     * This constructor will never be invoked normally. It is provided as a
     * safeguard against accidental instantiation within the class itself
     * (e.g., through reflection).
     * </p>
     *
     * @throws AssertionError always, to indicate that this class cannot be instantiated
     */
    private Geometry() {
        throw new AssertionError("Cannot Instantiate");
    }

    public static String square(double a) {
        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Core.squareRoot(2.0,6);

        return "Square: { " +
                "Area: " + area +
                "Perimeter: " + perimeter +
                "Diagonal: " + diagonal +
                "}";
    }

    public static String circle(double radius) {
        double diameter = 2 * radius;
        double circumference =  PI * diameter;
        double area = PI * radius * radius;
        return "Circle: { " +
                "Radius: " + radius +
                "Diameter: " + diameter +
                "Circumference: " + circumference +
                "Area: " + area +
                "}";
    }

    public static String rectangle(double length, double breadth) {
        double perimeter = 2.0 * (length + breadth);
        double area = length * breadth;
        double diagonal = squareRoot(power(length, 2) + power(breadth, 2), 6);
        return "Rectangle: {" +
                "Length: " + length +
                "Breadth: " + breadth +
                "Perimeter: " + perimeter +
                "Area: " + area +
                "Diagonal: " + diagonal +
                "}";
    }

    public static String triangle(double base, double height) {
        double area = 0.5 * base * height;
        return "Triangle: {" +
                "Area: " + area +
                "}";
    }

    public static String herons(double ab, double bc, double ca) {
        double perimeter = ab + bc + ca;
        double s = perimeter / 2;
        double area = Core.squareRoot(s * ((s - ab) * (s - bc) * (s - ca)), 6);

        return "Triangle: Herons {" +
                "Perimeter: " + perimeter +
                "Area: " + area +
                "}";
    }

    public static String equilateral(double a) {
        double perimeter = 3 * a;
        double height = (a * Core.squareRoot(3, 6)) / 2;
        double area = (Core.squareRoot(3, 6) / 4) * (a * a);

        return "Equilateral Triangle: {" +
                "Perimeter: " + perimeter +
                "Height: " + height +
                "Area: " + area +
                "}";
    }

    public static String cube(double a) {
        double volume = a * a * a;
        double surfaceArea = 6 * a * a;
        double diagonal = a * Core.cubeRoot(3.0,6);

        return "Cube : { " +
                "Volume: " + volume +
                "Surface Area: " + surfaceArea +
                "Diagonal: " + diagonal +
                "}";
    }

    public static String cuboid(double l, double w, double h) {
        double volume = l * w * h;
        double surfaceArea = 2 * (l * w + w * h + h * l);

        return "Cuboid: {" +
                "Volume: " + volume +
                "Surface Area: " + surfaceArea +
                "}";
    }

}
