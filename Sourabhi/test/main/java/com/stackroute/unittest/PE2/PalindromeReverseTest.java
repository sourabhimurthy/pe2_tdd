package main.java.com.stackroute.unittest.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeReverseTest {
    PalindromeReverse obj;

    @Before
    public void setUp() throws Exception {
        PalindromeReverse obj=new PalindromeReverse();
    }

    @After
    public void tearDown() throws Exception {
        PalindromeReverse obj=null;
    }

    @Test
    public void reverse() {
        assertEquals("madam",obj.reverse("madam"));
    }

    @Test
    public void isPalindrome() {
        assertEquals("Yes",obj.IsPalindrome("madam"));
    }

    @Test
    public void reverse1() {
        assertEquals("mad",obj.reverse("dam"));
    }

    @Test
    public void isPalindrome1() {
        assertEquals("No",obj.IsPalindrome("dam"));
    }

    @Test
    public void reverse2() {
        assertEquals("dnas",obj.reverse("sand"));
    }

    @Test
    public void isPalindrome2() {
        assertEquals("No",obj.IsPalindrome("dnas"));
    }
}