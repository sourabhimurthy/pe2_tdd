package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.CheckPowerOf4;
import org.junit.Test;

public class EvenNumTestTest {
    @Test
    public void isEven_1(){
        EvenNumTest evenNumTest=new CheckPowerOf4.EvenNumTest();
        assertEquals(true,evenNumTest.isEven(22));
    }
    @Test
    public void isEven_2(){
        EvenNumTest evenNumTest=new CheckPowerOf4.EvenNumTest();
        assertEquals(false,evenNumTest.isEven(1));
    }
}