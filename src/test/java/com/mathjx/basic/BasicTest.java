package com.mathjx.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.mathjx.basic.Basic.*;

public class BasicTest {


    @Test
    void primeTest() {

        assertFalse(prime(9));

        assertFalse(prime(10));

        assertTrue(prime(2));

        assertFalse(prime(0));

        assertFalse(prime(1));

        assertFalse(prime(-1));

        assertFalse(prime(9223372036854775807L));

    }

    @Test
    void fpValueTest() {
        assertEquals("Face Value: 0, Place Value: 0", fpValue(12045, 0));
    }


    @Test
    void evenOddTest() {
        assertEquals("Odd", evenOdd(17));
    }

    @Test
    void factorTest() {
        int[] expected = {};
        assertArrayEquals(expected, factor(0));
    }

    @Test
    void multipleTest() {
        int[] expected = {3,6,9,12,15,18,21,24,27,30};
        assertArrayEquals(expected, multiple(3,10));
    }

    @Test
    void squareRootTest() {
        assertEquals(2.1, fracSqrt(441,100));
    }

    @Test
    void cubeRootTest() {
        assertEquals(1.639882997800068, fracCbrt(441,100));
    }

    @Test
    void percentTest() {
        assertEquals(125, percent(25,500));
    }

    @Test
    void perIncTest() {
        assertEquals(35, perInc(24.0, 32.40));
    }

    @Test
    void perDecTest() {
        assertEquals(20.0, perDec(40.0, 32.0));
    }

    @Test
    void simpleInterestTest() {
        assertEquals("Simple Interest: 675.0, Amount: 3175.0", simpleInterest(2500, 1.5, 18));
    }

}
