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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last Name : ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
    }
    //Use Case 3
    public void ValidateEmail(){
        Scanner scanner = new Scanner(System.in);
        String email = "abc.xyz@bl.co.in";
        System.out.println("Email : " + email);
        System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
    }

}
