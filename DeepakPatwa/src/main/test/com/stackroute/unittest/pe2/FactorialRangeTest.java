package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialRangeTest {
    @Test
    public void checkOverflow(){
        FactorialRange fr=new FactorialRange();
        boolean res1=fr.checkOverflow(33, 44);
        boolean res2=fr.checkOverflow(44, 33);
        assertTrue("checkOverflow is failing",res1);
        assertFalse("checkOverflow is failing",res2);
    }

}