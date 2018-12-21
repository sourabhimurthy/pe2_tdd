package main.java.com.stackroute.unittest.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentAverageTest {
    StudentAverage obj;

    @Before
    public void setUp() throws Exception {
        StudentAverage obj=new StudentAverage();
    }

    @After
    public void tearDown() throws Exception {
        StudentAverage obj=null;
    }

    @Test
    public void maxValue() {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        assertEquals(4,obj.maxValue(arr));
    }

    @Test
    public void minValue() {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        assertEquals(1,obj.minValue(arr));
    }

    @Test
    public void avg() {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        assertEquals(2.5,obj.avg(arr));
    }

    @Test
    public void maxValue1() {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 4;
        assertEquals(30,obj.maxValue(arr));
    }

    @Test
    public void minValue1() {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 4;
        assertEquals(4,obj.minValue(arr));
    }

    @Test
    public void avg1() {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 4;
        assertEquals(16,obj.avg(arr));
    }
}