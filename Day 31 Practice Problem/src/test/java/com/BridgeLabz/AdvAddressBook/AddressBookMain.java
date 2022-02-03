package com.BridgeLabz.AdvAddressBook;
import java.util.Scanner;

public class AddressBookMain
{
    static Scanner scanner = new  Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book");
        AddressBookService addressBook = new AddressBookService();
        while (true) {
            System.out.println("Enter what you have to do");
            System.out.println(" 1 Add Contact \n 2 Edit Contact \n 3 Delete Contact \n 4 Display Contact \n 5 Quit ");
            int userChoice = scanner.nextInt();
            switch (userChoice)
            {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    System.out.println("Enter the Phone Number");
                    int phoneNumber = scanner.nextInt();
                    addressBook.editContact(phoneNumber);

                    break;
                case 3:
                    System.out.println("Enter the Phone Number");
                    int phoneNumberToDelete = scanner.nextInt();
                    addressBook.deleteContact(phoneNumberToDelete);
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                case 5:
                    System.out.println("Thanks For Using Us");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Proper Option");
            }
        }
    }

}