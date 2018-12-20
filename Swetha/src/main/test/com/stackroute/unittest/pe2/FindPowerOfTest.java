package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindPowerOfTest {
    FindPowerOf power_obj;

    @Before
    public void setUp() throws Exception {
        FindPowerOf power_obj = new FindPowerOf();
    }

    @After
    public void tearDown() throws Exception {
        FindPowerOf power_obj = null;
    }

    @Test
    public void find_PowerOf4() {
        assertEquals("The given number is a power of 4", power_obj.find_PowerOf4(64));
    }

    @Test
    public void test() {
        assertEquals("The given number is not a Power of 4 (-_-)", power_obj.find_PowerOf4(12));
    }

}