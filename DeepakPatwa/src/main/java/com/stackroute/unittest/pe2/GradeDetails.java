package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class GradeDetails {

    public static int getMin(int num1, int num2)
    {
        if(num1>num2)
            return num2;
        else
            return num1;
    }
    public static int getMax(int num1, int num2)
    {
        if(num1>num2)
            return num1;
        else
            return num2;
    }
    public static float getAvg(int sum, int n)
    {
        return (float)sum/n;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        int min=100;
        int max=-100;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the grade for student" + i + ": ");
            arr[i]=in.nextInt();
            min=getMin(arr[i],min);
            max=getMax(arr[i],max);
            sum+=arr[i];
        }
        float avg=getAvg(sum,n);
        System.out.println("The average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
    }
}
