package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    @Test
    public void evenNumberCheckTrue(){
        EvenNumber en=new EvenNumber();
        boolean res=en.isEven(4);
        boolean res1=en.isEven(5);
        assertTrue("isEven is failing", res);
        assertFalse("isEven is failing", res1);
    }

}