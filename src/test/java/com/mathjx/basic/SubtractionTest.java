package com.mathjx.basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SubtractionTest {

    @Test
    void intTest() {
        assertEquals(5, Subtraction.sub(2, 3));
    }

    @Test
    void doubleTest() {
        assertEquals(6.2357, Subtraction.sub(3.2000, 3.0357));
    }

    @Test
    void floatTest() {
        assertEquals(2.2, Subtraction.sub(2.1, 0.1));
    }

    @Test
    void longTest() {
        assertEquals(1000000001, Subtraction.sub(1000000000, 1));
    }

}
