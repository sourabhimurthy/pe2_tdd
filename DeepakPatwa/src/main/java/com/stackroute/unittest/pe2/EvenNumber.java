package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class EvenNumber {
    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        if(isEven(num))
        {
            System.out.println("Even Number");
        }
        else
            System.out.println("Not even number");
    }
}
