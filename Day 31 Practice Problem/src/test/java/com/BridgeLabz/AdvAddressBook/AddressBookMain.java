package com.BridgeLabz.AdvAddressBook;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book");
        AddressBookService contact = new AddressBookService();
        contact.addContact();
        AddressBookService contact2 = new AddressBookService();
        contact2.addContact();
        contact.diaplayContacts();
        contact2.diaplayContacts();
    }

}
