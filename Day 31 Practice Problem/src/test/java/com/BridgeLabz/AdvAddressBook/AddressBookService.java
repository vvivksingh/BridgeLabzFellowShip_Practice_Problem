package com.BridgeLabz.AdvAddressBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class AddressBookService
{
    HashMap<String,LinkedList<Contact>> addressBooks = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    //method to add contacts
    public Contact addContact()
    {
        Contact contact = new Contact();
        LinkedList<Contact> allContacts = new LinkedList<Contact>();
        System.out.println("Enter First Name");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last Name");
        contact.setLastname(scanner.next());
        System.out.println("Enter address");
        contact.setAddress(scanner.next());
        System.out.println("Enter City");
        contact.setCity(scanner.next());
        System.out.println("Enter State");
        contact.setState(scanner.next());
        System.out.println("Enter Pincode");
        contact.setZip(scanner.next());
        System.out.println("Enter Phone Number");
        contact.setPhoneNumber(scanner.nextInt());
        System.out.println("Enter Email");
        contact.setEmail(scanner.next());
        System.out.println("Enter Book name to which you have to add contact");
        String bookName  = scanner.next();

        //checking book already exist
        if (addressBooks.containsKey(bookName))
        {
            //if exist then add contact to list
            LinkedList<Contact> contactList  =  addressBooks.get(bookName);
            addContactToExsistingBook(contact, bookName, contactList);
        }
        else
        {
            //creating a new book and list
            allContacts.add(contact);
            addressBooks.put(bookName,allContacts);
            System.out.println("New book created and Contact Added Sucessfully");
        }

        return contact;
    }

    //method to delete contact
    public boolean deleteContact(int phoneNumber,String bookName)
    {
        if (addressBooks.containsKey(bookName))
        {
            LinkedList<Contact> contactList  =  addressBooks.get(bookName);
            for (Contact contact : contactList)
            {
                if (contact.getPhoneNumber() == phoneNumber)
                {
                    contactList.remove(contact);
                    return operationStatus(true);
                }
            }
        }
        return operationStatus(false);
    }

    //method to edit contact
    public boolean editContact(int phoneNumber,String bookName)
    {
        if (addressBooks.containsKey(bookName))
        {
            LinkedList<Contact> contactList  =  addressBooks.get(bookName);
            for (Contact contact : contactList)
            {
                if (contact.getPhoneNumber() == phoneNumber)
                {
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
                    contact.setFirstName(firstName);
                    contact.setLastname(lastName);
                    contact.setAddress(address);
                    contact.setCity(city);
                    contact.setState(state);
                    contact.setState(zip);
                    return operationStatus(true);
                }
            }
        }
        return operationStatus(false);
    }


    public void displayContacts(LinkedList<Contact> contactList)
    {
        for (Contact contact : contactList)
        {
            System.out.println(contact);
        }
    }

    public void displayContact()
    {
        for (String bookName : addressBooks.keySet())
        {
            System.out.println(bookName);
            LinkedList<Contact> contactList  =  addressBooks.get(bookName);
            displayContacts(contactList);
        }
    }

    //method to search multiple person in city and state
    public void searchPerson(String searchKey)
    {
        for (String bookName : addressBooks.keySet())
        {
            LinkedList<Contact> contactList  =  addressBooks.get(bookName);
            for (Contact contact : contactList)
            {
                if (contact.getCity().equals(searchKey) ||  contact.getState().equals(searchKey) )
                {
                    System.out.println(contact.getFirstName() + ""+ contact.getLastname());

                }
            }
        }
    }



    //method to get operation status
    private static boolean operationStatus(boolean status)
    {
        if(status)
        {
            System.out.println("Operation  Successfully");
        }
        else
        {
            System.out.println("Contact not found");
        }
        return status;
    }

    //check Duplicate using name
    private void addContactToExsistingBook(Contact contact, String bookName, LinkedList<Contact> contactList)
    {
        boolean isAlreadyExsist = false;
        for (Contact searchContact : contactList)
        {
            if (searchContact.getFirstName().equals(contact.getFirstName()))
            {
                isAlreadyExsist = true;
                break;
            }
        }
        if( !(isAlreadyExsist) )
        {
            contactList.add(contact);
            addressBooks.put(bookName, contactList);
            System.out.println("New Contact Added Sucessfully");
        }
        else
        {
            System.out.println("Contact already exsist");
        }
    }
}