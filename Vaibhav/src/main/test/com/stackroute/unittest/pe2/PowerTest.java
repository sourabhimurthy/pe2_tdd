package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PowerTest {
    Power obj;
    int input;
    String expected;
    String result;
    @Before
    public void setUp() throws Exception {
        Power obj = new Power();
    }

    @After
    public void tearDown() throws Exception {
        Power obj = null;
    }

    @Test
    public void negNumTest(){
        input = -4;
        expected = "-4 is not power of 4";

        result = obj.powerCheck(input);
        assertEquals(expected, result);
    }

    @Test
    public void zeroTest(){
        input = 0;
        expected = "0 is not power of 4";

        result = obj.powerCheck(input);
        assertEquals(expected, result);
    }

    @Test
    public void trueTest(){
        input = 16;
        expected = "16 is not power of 4";

        result = obj.powerCheck(input);
        assertEquals(expected, result);
    }

    @Test
    public void falseTest(){
        input = 16;
        expected = "16 is not power of 4";

        result = obj.powerCheck(input);
        assertEquals(expected, result);
    }
}
