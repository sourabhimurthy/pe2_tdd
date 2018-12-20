package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome1Test {
    Palindrome1 palindrome_obj;
    @Before
    public void setUp() throws Exception {
        Palindrome1 palindrome_obj  = new Palindrome1();
    }

    @After
    public void tearDown() throws Exception {
        Palindrome1  palindrome_obj = null;
    }

    @Test
    public void palindrome_check() {
        assertEquals("Number is a Palindrome Number.", palindrome_obj.palindrome_check(121));
    }
}