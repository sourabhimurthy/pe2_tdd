package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Powerof4 {
    public static boolean checkPower4(int n)
    {
        int x=n&(n-1);
        int count=0;
        if(n>0 && x==0)
        {
            while(n>1)
            {
                n=n>>1;
                count++;
            }
        }
        if(count%2==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        boolean res=checkPower4(n);
        if(res)
            System.out.println("Power of 4");
        else
            System.out.println("Not a power of 4");
    }
}
