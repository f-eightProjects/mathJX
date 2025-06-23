package com.mathjx.maths.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.mathjx.maths.core.Core.*;

public class CoreTest {


    @Test
    void primeTest() {

        assertFalse(isPrime(9));

        assertFalse(isPrime(10));

        assertTrue(isPrime(2));

        assertFalse(isPrime(0));

        assertFalse(isPrime(1));

        assertFalse(isPrime(-1));

        assertFalse(isPrime(9223372036854775807L));

    }

    @Test
    void fpValueTest() {
        assertEquals("Face Value: 0, Place Value: 0", facePlaceValue(12045, 0));
    }


    @Test
    void evenOddTest() {
        assertEquals("Odd", evenOdd(17));
    }

    @Test
    void factorTest() {
        int[] expected = {1,2,3,6};
        assertArrayEquals(expected, factor(6));
    }

    @Test
    void multipleTest() {
        int[] expected = {3,6,9,12,15,18,21,24,27,30};
        assertArrayEquals(expected, multiple(3,10));
    }

    @Test
    void squareRootTest() {
        assertEquals(1.414214, squareRoot(2, 6));
    }

    @Test
    void percentTest() {
        assertEquals(125, percentage(25,500));
    }

    @Test
    void perIncTest() {
        assertEquals(35, percentageIncrease(0.0, 32.40));
    }

    @Test
    void perDecTest() {
        assertEquals(20.0, percentageDecrease(40.0, 32.0));
    }

    @Test
    void simpleInterestTest() {
        assertEquals("Simple Interest: 675.0, Amount: 3175.0", simpleInterest(2500, 1.5, 18));
    }

    @Test
    void cubeRootTest() {
        assertEquals(3.0, cubeRoot(27.0, 6));
    }

    @Test
    void powerTest() {
        assertEquals(8.0, power(2,3));
    }

    @Test
    void modTest() {
        assertEquals(1.1, absoluteValue(-1.1));
    }
}
