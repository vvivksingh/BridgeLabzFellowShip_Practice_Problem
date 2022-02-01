package com.BridgeLabz.AdvAddressBook;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book");
        AddressBookService contact = new AddressBookService();
        contact.addContact();
        contact.diaplayContacts();

    }

}

