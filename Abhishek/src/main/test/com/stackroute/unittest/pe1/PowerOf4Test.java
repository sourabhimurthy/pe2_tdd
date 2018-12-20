package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PowerOfFourTest {

    @Test
    public void ZeroCheck() {
        PowerofFour p1 = new PowerofFour();

        String result = p1.PowerofFourGuess(0);

        assertArrayEquals("yes",result);
    }

    @Test
    public void PositiveCheck() {
        PowerofFour p1 = new PowerofFour();

        String result = p1.PowerofFourGuess(16);

        assertArrayEquals("yes",result);
    }

    @Test
    public void NegativeCheck() {
        PowerofFour p1 = new PowerofFour();

        String result = p1.PowerofFourGuess(-16);

        assertArrayEquals("no",result);
    }

    @Test
    public void PositiveCheckNo() {
        PowerofFour p1 = new PowerofFour();

        String result = p1.PowerofFourGuess(27);

        assertArrayEquals("no",result);
    }

}
