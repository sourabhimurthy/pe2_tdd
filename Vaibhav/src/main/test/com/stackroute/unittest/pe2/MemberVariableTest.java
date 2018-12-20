package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable obj;
    String expected;
    String result;
    @Before
    public void setUp() throws Exception {
        MemberVariable obj = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        MemberVariable obj = null;
    }

    @Test
    public void nullTest(){
        expected = "Name: , Age: , Salary: ";

        result = obj.MemberVariable();
        assertEquals(expected, result);
    }

    @Test
    public void incompleteInfoTest1(){
        expected = "Name:Vaibhav , Age: , Salary: ";

        result = obj.MemberVariable(Vaibhav);
        assertEquals(expected, result);
    }

    @Test
    public void incompleteInfoTest2(){
        expected = "Name:Vaibhav , Age: , Salary: ";

        result = obj.MemberVariable(Vaibhav);
        assertEquals(expected, result);
    }

    @Test
    public void incompleteInfoTest3(null, 10){
        expected = "error";

        result = obj.MemberVariable(null, null, 1000);
        assertEquals(expected, result);
    }

    @Test
    public void negSalTest(null, 10){
        expected = "error";

        result = obj.MemberVariable("Vaibhav", 20, -1000);
        assertEquals(expected, result);
    }

    @Test
    public void negAgeTest(null, 10){
        expected = "error";

        result = obj.MemberVariable("Vaibhav", -10, -1000);
        assertEquals(expected, result);
    }

}
