package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;
public class EvenNumberTest {

    @Test
    public void PositiveNumber() {

        EvenNumber e1 = new EvenNumber();

        boolean result = e1.isEven(2);

        assertArrayEquals(true,result);
    }

    @Test
    public void NegativeNumber() {

        EvenNumber e1 = new EvenNumber();

        boolean result = e1.isEven(-2);

        assertArrayEquals(true,result);
    }

    @Test
    public void PositiveOddNumber() {

        EvenNumber e1 = new EvenNumber();

        boolean result = e1.isEven(3);

        assertArrayEquals(false,result);
    }

    @Test
    public void NegativeOddNumber() {

        EvenNumber e1 = new EvenNumber();

        boolean result = e1.isEven(-3);

        assertArrayEquals(false,result);
    }

    @Test
    public void ZeroNumber() {

        EvenNumber e1 = new EvenNumber();

        boolean result = e1.isEven(0);

        assertArrayEquals(false,result);
    }
}
