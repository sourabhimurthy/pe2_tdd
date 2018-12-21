package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.CheckPowerOf4;
import org.junit.Test;

public class CheckPowerOf4Test {

    @Test
    public  void checkPowerOf4_1 () {
        CheckPowerOf4 c = new CheckPowerOf4();
        assertEquals(true,c.checkPowerOf4(64));
    }
    @Test
    public  void checkPowerOf4_2 () {
        CheckPowerOf4 c = new CheckPowerOf4();
        assertEquals(false,c.checkPowerOf4(32));
    }

}