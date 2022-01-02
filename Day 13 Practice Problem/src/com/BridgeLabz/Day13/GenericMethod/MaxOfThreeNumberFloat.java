package com.BridgeLabz.Day13.GenericMethod;
import java.util.Scanner;

public class MaxOfThreeNumberFloat {
    public static void main(String args[])
    {
        MaxOfThreeNumberInt obj=new MaxOfThreeNumberInt();
        System.out.println("Maximum of 3 floating number is : "+ obj.compareTo());
    }
    public float compareTo(){
        Scanner sc=new Scanner(System.in);
        //reading the numbers
        System.out.println("Enter three numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float temp;
        float largest;
        //comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
        //comparing the temp variable with c and storing the result in the variable
        largest=c>temp?c:temp;
        //prints the largest number
        return(largest);
    }
}
