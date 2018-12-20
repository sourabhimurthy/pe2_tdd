package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class GradeDetailsTest {

    @Test
    public void getMin() {
        GradeDetails gd=new GradeDetails();
        int res=gd.getMin(99,1);
        assertEquals("getMin is failing ", res,1);
    }

    @Test
    public void getMax() {
        GradeDetails gd=new GradeDetails();
        int res=gd.getMax(99,1);
        assertEquals("getMin is failing ", res,99);
    }

    @Test
    public void getAvg() {
        GradeDetails gd=new GradeDetails();
        float res=gd.getAvg(100,3);
        assertEquals("getMin is failing ", res,33.33, 0.05);
    }
}