package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.Palindrome;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void reverseInput_1 () {
        Palindrome p = new Palindrome();
        assertEquals("malayalam",p.reverseInput("malayalam"));
    }
    @Test
    public void reverseInput_2 () {
        Palindrome p = new Palindrome();
        assertEquals("olleh",p.reverseInput("hello"));
    }
    @Test
    public void checkPalindrome_1 () {
        Palindrome p = new Palindrome();
        assertEquals(false,p.checkPalindrome("hello"));
    }
    @Test
    public void checkPalindrome_2 () {
        Palindrome p = new Palindrome();
        assertEquals(true,p.checkPalindrome("malayalam"));
    }

}