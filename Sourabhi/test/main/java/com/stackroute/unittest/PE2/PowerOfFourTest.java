package main.java.com.stackroute.unittest.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour obj;

    @Before
    public void setUp() throws Exception {
        PowerOfFour p1=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        PowerOfFour obj=null;
    }

    @Test
    public void powerofFour() {
        assertEquals("Y",obj.powerofFour(64));
    }

    @Test
    public void powerofFour1() {
        assertEquals("N",obj.powerofFour(28));
    }

    @Test
    public void powerofFour2() {
        assertEquals("N",obj.powerofFour(32));
    }
}