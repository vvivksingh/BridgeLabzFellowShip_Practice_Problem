package com.BridgeLabz.Day10.AddressBook;
import java.util.ArrayList;

public class AddressBookMain {
        // Create an arraylist to store contact details of all the persons
        public static final ArrayList<ArrayList<String>>addressBook = new ArrayList<>();

        // Use Case 1: Create contacts in address book
        public void createContacts(ArrayList<String> contact) {

            // Add contact details of person to address book
            AddressBookMain.addressBook.add(contact);

            // Print contact details of persons in address book
            for (ArrayList<String> i : AddressBookMain.addressBook) {
                for (String j : i) {
                    System.out.println(j);
                }
            }
        }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
    }
}
