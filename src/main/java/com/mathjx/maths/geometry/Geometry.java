package com.mathjx.maths.geometry;

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
}
