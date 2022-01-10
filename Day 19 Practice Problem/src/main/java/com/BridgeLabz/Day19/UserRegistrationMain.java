package com.BridgeLabz.Day19;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistrationUseCases obj = new UserRegistrationUseCases();
        obj.ValidateFirstName();
        obj.ValidateLastName();
        obj.ValidateEmail();
    }
}
