package com.stackroute.unittest.pe2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest obj;

    @Before
    public void setUp() throws Exception {
        obj = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        EvenNumTest obj = null;
    }

    @Test
    public void zeroTest() {
        assertEquals(true,obj.isEven(0));
    }

    @Test
    public void nefEvenTest() {
        assertEquals(true,obj.isEven(-2));
    }

    @Test
    public void negOddTest() {
        assertEquals(false,obj.isEven(-5));
    }

    @Test
    public void posEvenTest() {
        assertEquals(true,obj.isEven(4));
    }
    @Test
    public void posOddTest() {
        assertEquals(false,obj.isEven(5));
    }
}