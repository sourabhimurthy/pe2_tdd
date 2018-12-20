package com.stackroute.unittest.pe2;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class FactorialsTest {
    Factorial_FindTest obj;
    @Before
    public void setUp() throws Exception {
        Factorials obj = new Factorial_FindTest();
    }

    @After
    public void tearDown() throws Exception {
        Factorial_FindTest obj;
    }

    @Test
    public void intFactorial() {
        assertEquals(1,obj.intFactorial(1));
        assertEquals(2,obj.intFactorial(2));
        assertEquals(6,obj.intFactorial(3));

    }

    @Test
    public void longFactorial() {
        assertEquals(120,obj.longFactorial(5));
        assertEquals(362880,obj.longFactorial(9));
    }
}