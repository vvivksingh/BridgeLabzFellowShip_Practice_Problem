package com.BridgeLabz.AdvAddressBook;

import java.util.Scanner;

public class AddressBookService{

    Contact[] allContacts = new Contact[20];
    private int index = 0 ;

    public Contact addContact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        System.out.println("Enter last Name");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter City");
        String city = scanner.next();
        System.out.println("Enter State");
        String state = scanner.next();
        System.out.println("Enter zip");
        String zip = scanner.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.next();
        System.out.println("Enter Email");
        String email = scanner.next();
        Contact contact = new Contact( firstName, lastName, address, city, state, zip, phoneNumber, email);
        allContacts[index++]= contact;
        System.out.println("New Contact Added Sucessfully");
        return contact;
    }


    public void diaplayContacts() {
        for (int i = 0; i < allContacts.length; i++) {
            if(allContacts[i] != null)
            {
                System.out.println(allContacts[i]);
            }
        }
    }

}
