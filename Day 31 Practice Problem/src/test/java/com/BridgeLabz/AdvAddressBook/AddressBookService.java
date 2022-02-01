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
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter Email");
        String email = scanner.next();
        Contact contact = new Contact( firstName, lastName, address, city, state, zip, phoneNumber, email);
        allContacts[index++]= contact;
        System.out.println("New Contact Added Sucessfully");
        return contact;
    }


    public boolean editContact(int phoneNumber)
    {
        for (int i = 0; i < allContacts.length; i++)
        {
            if(allContacts[i] != null && allContacts[i].getPhoneNumber() == phoneNumber )
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
                allContacts[i].setFirstName(firstName);
                allContacts[i].setLastname(lastName);
                allContacts[i].setAddress(address);
                allContacts[i].setCity(city);
                allContacts[i].setState(state);
                allContacts[i].setState(zip);
                return true;
            }
        }
        return false;
    }


    public void diaplayContacts()
    {
        for (int i = 0; i < allContacts.length; i++)
        {
            if(allContacts[i] != null)
            {
                System.out.println(allContacts[i]);
            }
        }
    }


}