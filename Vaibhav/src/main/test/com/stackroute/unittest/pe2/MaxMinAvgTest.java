package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinAvgTest {

    MaxMinAvg obj;
    @Before
    public void setUp() throws Exception {
        MaxMinAvg obj = new MaxMinAvg();
    }

    @After
    public void tearDown() throws Exception {
        MaxMinAvg obj = null;
    }

    @Test
    public void studentMax() {
        int[] arr = new int[4];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 10;
        arr[3] = 11;
        assertEquals(11,obj.StudentMax(arr));
    }

    @Test
    public void studentMin() {
        int[] arr = new int[4];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 10;
        arr[3] = 11;
        assertEquals(8,obj.StudentMin(arr));
    }

    @Test
    public void studentAvg() {
        int[] arr = new int[4];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 10;
        arr[3] = 11;
        assertEquals(9.50 ,obj.StudentAvg(arr));
    }
}