package com.BridgeLabz.Day19;

import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistrationUseCases {

    //Use Case 1
    public void ValidateFirstName(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    }
    //Use Case 2
    public void ValidateLastName(){

    }
}
