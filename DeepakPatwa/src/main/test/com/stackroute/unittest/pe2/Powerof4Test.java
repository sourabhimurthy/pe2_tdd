package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Powerof4Test {

    @Test
    public void checkPower4True() {
        Powerof4 obj = new Powerof4();
        boolean res=obj.checkPower4(16);

        assertTrue("CheckPower4 failing", res);
    }

    @Test
    public void checkPower4False() {
        Powerof4 obj = new Powerof4();
        boolean res=obj.checkPower4(8);

        assertFalse("CheckPower4 failing", res);
    }
}