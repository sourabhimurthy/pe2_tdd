package main.java.com.stackroute.unittest.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargeFactorialTest {
    LargeFactorial obj;

    @Before
    public void setUp() throws Exception {
        LargeFactorial obj=new LargeFactorial();
    }

    @After
    public void tearDown() throws Exception {
        LargeFactorial obj=null;
    }

    @Test
    public void factorial() {
        assertEquals("120",obj.factorial(5));
    }

    @Test
    public void factorial1() {
        assertEquals("479001600",obj.factorial(12));
    }

    @Test
    public void factorial2() {
        assertEquals("720",obj.factorial(6));
    }
}