package com.mathjx.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.mathjx.basic.Basic.*;

public class BasicTest {

    @Test
    void addTest() {
        assertEquals(3, add(3,0));
    }

    @Test
    void mulTest() {
        assertEquals(4, mul(2, 2));
    }

    @Test
    void subTest() {
        assertEquals(2, sub(4,2));
    }

    @Test
    void primeTest() {


        assertFalse(prime(9));

        assertFalse(prime(10));

        assertTrue(prime(2));

        assertFalse(prime(0));

        assertFalse(prime(1));

        assertFalse(prime(-1));

        assertFalse(prime(1000000000));


    }
}
