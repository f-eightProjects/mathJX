package com.mathjx.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class AdditionTest {

    @Test
    void intTest() {
        assertEquals(5, Addition.add(2, 3));
    }

    @Test
    void doubleTest() {
        assertEquals(6.2357, Addition.add(3.2000, 3.0357));
    }

    @Test
    void floatTest() {
        assertEquals(2.2, Addition.add(2.1, 0.1));
    }

    @Test
    void longTest() {
        assertEquals(1000000001, Addition.add(1000000000, 1));
    }



}
