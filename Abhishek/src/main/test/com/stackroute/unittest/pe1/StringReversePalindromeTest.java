package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringReversePalindromeTest {

    @Test
    public void StringInput() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("abba");

        assertArrayEquals("yes",result);
    }

    @Test
    public void NumericInput() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("1221");

        assertArrayEquals("yes",result);
    }

    @Test
    public void AlphaNumericInput() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("12abba21");

        assertArrayEquals("yes",result);
    }

    @Test
    public void SpecialCharacterInput() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("12ab@@ba21");

        assertArrayEquals("yes",result);
    }

    @Test
    public void StringInputFalse() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("abbaba");

        assertArrayEquals("no",result);
    }

    @Test
    public void NumericInputFalse() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("123421");

        assertArrayEquals("no",result);
    }

    @Test
    public void AlphaNumericInputFalse() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("12abcbba21");

        assertArrayEquals("no",result);
    }

    @Test
    public void SpecialCharacterInput() {
        StringReversePalindrome s1 = new StringReversePalindrome();

        String result = s1.checkpalindrome("12ab@@ba21");

        assertArrayEquals("no",result);
    }
}
