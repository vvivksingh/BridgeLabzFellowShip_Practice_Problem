package com.BridgeLabz.Day13.GenericMethod;

import java.util.*;
public class MaxOfThreeNumberInt{

    public static void main(String[] args)
    {
        MaxOfThreeNumberInt max=new MaxOfThreeNumberInt();
        System.out.println("Largest number is : " + max.compareTo());

    }
    public int compareTo(){
        int a, b, c, largest, temp;
        //object of the Scanner class
        Scanner sc = new Scanner(System.in);
        //reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        //comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
        //comparing the temp variable with c and storing the result in the variable
        largest=c>temp?c:temp;
        //prints the largest number
        return(largest);
    }
}



