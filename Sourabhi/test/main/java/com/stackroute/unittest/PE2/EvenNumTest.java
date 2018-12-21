package main.java.com.stackroute.unittest.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum obj;

    @Before
    public void setUp() throws Exception {
        EvenNum obj=new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
        EvenNum obj=null;
    }

    @Test
    public void iseven() {
        assertEquals("Yes",obj.iseven(4));
    }


    @Test
    public void iseven1() {
        assertEquals("No",obj.iseven(77));
    }

    @Test
    public void iseven2() {
        assertEquals("Yes",obj.iseven(44));
    }
}