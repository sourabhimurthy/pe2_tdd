package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;
public class FactorialTest {

    @Test

    public void ZeroCheck() {
        Factorial f = new Factorial();

        String result = f.factoriallist(13);

        assertArrayEquals("the factorial of 1 is 1,the factorial of 2 is 2,the factorial of 3 is 6,the factorial of 4 is 24,the factorial of 5 is 120,the factorial of 6 is 720,the factorial of 7 is 5040,the factorial of 8 is 40320,the factorial of 9 is 362880,the factorial of 10 is 3628800,the factorial of 11 is 39916800,the factorial of 12 is 479001600,the factorial of 13 is out of range",result);
    }

    @Test

    public void LongFacotiralCheck() {
        Factorial f = new Factorial();

        String result = f.longFactorial(21);

        assertArrayEquals("the factorial of 1 is 1,the factorial of 2 is 2,the factorial of 3 is 6,the factorial of 4 is 24,the factorial of 5 is 120,the factorial of 6 is 720,the factorial of 7 is 5040,the factorial of 8 is 40320,the factorial of 9 is 362880,the factorial of 10 is 3628800,the factorial of 11 is 39916800,the factorial of 12 is 479001600,the factorial of 13 is 6227020800,the factorial of 14 is 87178291200,the factorial of 15 is 1307674368000,the factorial of 16 is 20922789888000,the factorial of 17 is 355687428096000,the factorial of 18 is 6402373705728000,the factorial of 19 is 121645100408832000,the factorial of 20 is 2432902008176640000,the factorial of 21 is out of range,"result);
    }

    @Test

    public void NegativeCheckLong() {
        Factorial f = new Factorial();

        String result = f.longFactorial(-2);

        assertArrayEquals("givepositivenumber",result);
    }

    @Test

    public void NegativeCheck() {
        Factorial f = new Factorial();

        String result = f.factoriallist(-2);

        assertArrayEquals("givepositivenumber",result);
    }
}
