package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PalindromeTest {
    Palindrome obj;
    String input;
    String expected;
    String result;
    @Before
    public void setUp() throws Exception {
        Palindrome obj = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        Palindrome obj = null;
    }

    @Test
    public void emptyInput(){
        input = "";
        expected = " is a palindrome, reverse is ";

        result = obj.palCheck(input);
        assertEquals(expected, result);
    }

    @Test
    public void singleChar(){
        input = "-";
        expected = "- is a palindrome, reverse is -";

        result = obj.palCheck(input);
        assertEquals(expected, result);
    }

    @Test
    public void oddString(){
        input = "a1a";
        expected = "a1a is a palindrome, reverse is a1a";

        result = obj.palCheck(input);
        assertEquals(expected, result);
    }

    @Test
    public void evenString(){
        input = "a1a1a";
        expected = "a1a1a is a palindrome, reverse is a1a1a";

        result = obj.palCheck(input);
        assertEquals(expected, result);
    }

}
