package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAndCheckPalindromeTest {

    @Test
    public void Reverse() {
        ReverseAndCheckPalindrome obj = new ReverseAndCheckPalindrome();
        String res=obj.Reverse("Hello");

        assertEquals("Reverse is failing", res, "olleH");
    }

    @Test
    public void CheckPalindromeTrue() {
        ReverseAndCheckPalindrome obj = new ReverseAndCheckPalindrome();
        boolean res=obj.CheckPalindrome("Hello", "olleH");
        assertTrue("CheckPalindrome is failing" ,res);
    }

    @Test
    public void CheckPalindromeFalse() {
        ReverseAndCheckPalindrome obj = new ReverseAndCheckPalindrome();
        boolean res=obj.CheckPalindrome("Hello", "olleh");
        assertFalse("CheckPalindrome is failing" ,res);
    }
}