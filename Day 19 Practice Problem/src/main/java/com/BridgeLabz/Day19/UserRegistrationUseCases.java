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
    // Use case 4
    public void ValidateMobileNoFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile no. : ");
        String phNum = scanner.nextLine();
        System.out.println(Pattern.matches("[0-9]{2}[\\s][0-9]{10}", phNum));
    }
    //Use case 5
    public void PasswordRuleMinimum8Character(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9].{7,}$", password));
    }
    //Use Case 6
    public  void PasswordRuleAtleastOneUpperCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z]).{8,}$", password));
    }

}
