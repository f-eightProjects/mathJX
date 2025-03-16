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
}
