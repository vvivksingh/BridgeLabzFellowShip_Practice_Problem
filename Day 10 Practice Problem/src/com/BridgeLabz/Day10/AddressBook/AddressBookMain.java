package com.BridgeLabz.Day10.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    // Create an arraylist to store contact details of all the persons
    public static final ArrayList<ArrayList<String>> addressBook = new ArrayList<>();

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

    //Use case 2: Add  new contact to address book

    public void addContact() {
        ArrayList<String> contact = enterContactDetails();
        createContacts(contact);
    }

    public ArrayList enterContactDetails() {
        ArrayList<String> contact = new ArrayList<String>();

        System.out.println("Enter the first name: ");
        Scanner sc1 = new Scanner(System.in);
        String first_name = sc1.next();
        contact.add(first_name);

        System.out.println("Enter the last name: ");
        Scanner sc2 = new Scanner(System.in);
        String last_name = sc2.next();
        contact.add(last_name);

        System.out.println("Enter the address: ");
        Scanner sc3 = new Scanner(System.in);
        String address = sc3.next();
        contact.add(address);

        System.out.println("Enter the city name: ");
        Scanner sc4 = new Scanner(System.in);
        String city = sc4.next();
        contact.add(city);

        System.out.println("Enter the state's name: ");
        Scanner sc5 = new Scanner(System.in);
        String state = sc5.next();
        contact.add(state);

        System.out.println("Enter the zip: ");
        Scanner sc6 = new Scanner(System.in);
        String zip = sc6.next();
        contact.add(zip);

        System.out.println("Enter the phone number: ");
        Scanner sc7 = new Scanner(System.in);
        String phone_num = sc7.next();
        contact.add(phone_num);

        System.out.println("Enter the email ID: ");
        Scanner sc8 = new Scanner(System.in);
        String email = sc8.next();
        contact.add(email);

        return contact;
    }
    //Use case 3: Edit existing details
    // Returns the index of contact details of a person in address book
    public int searchExistingContact() {
        int index = -1;
        int tempIndex = -1;
        for (ArrayList<String> i : AddressBookMain.addressBook) {
            // find index of arraylist in which the given name is there
            tempIndex++;
            for (String j : i) {
                // if name is found
                String searchPerson = new String();
                if (j.equals(searchPerson)) {
                    index = tempIndex;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain contactDetails = new AddressBookMain();
        contactDetails.addContact();
        contactDetails.searchExistingContact();
    }
}
