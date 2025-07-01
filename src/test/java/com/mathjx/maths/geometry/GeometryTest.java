package com.mathjx.maths.geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static com.mathjx.maths.core.Core.*;

class GeometryTest {

    private static final double DELTA = 1e-6;

    @Test
    void testCircleOutput() {
        String result = Geometry.circle(5);
        assertTrue(result.contains("Radius: 5.0"));
        assertTrue(result.contains("Diameter: 10.0"));
        assertTrue(result.contains("Circumference: 31.4159")); // approx
        assertTrue(result.contains("Area: 78.5398")); // approx
    }

    @Test
    void testRectangleOutput() {
        String result = Geometry.rectangle(3, 4);
        assertTrue(result.contains("Length: 3.0"));
        assertTrue(result.contains("Breadth: 4.0"));
        assertTrue(result.contains("Perimeter: 14.0"));
        assertTrue(result.contains("Area: 12.0"));
        assertTrue(result.contains("Diagonal: 5.0")); // 3-4-5 triangle
    }
}
