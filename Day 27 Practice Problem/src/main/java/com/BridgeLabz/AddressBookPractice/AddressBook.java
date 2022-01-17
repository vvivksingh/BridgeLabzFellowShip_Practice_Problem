package com.BridgeLabz.AddressBookPractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AddressBook implements AddressBookInterface {

    Scanner scannerObject = new Scanner(System.in);
    public Map<String, ContactInfo> contactList = new HashMap<String, ContactInfo>();
    public static HashMap<String, ArrayList<ContactInfo>> personByCity  = new HashMap<String, ArrayList<ContactInfo>>();
    public static HashMap<String, ArrayList<ContactInfo>> personByState = new HashMap<String, ArrayList<ContactInfo>>();
    public String addressBookName;
    public boolean isPresent = false;

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    public ArrayList<ContactInfo> getContact() {
        return new ArrayList<ContactInfo>(contactList.values());
    }


    @Override
    public void operation() {

        boolean moreChanges = true;
        do {

            System.out.println("\nChoose the operation you want to perform");
            System.out.println(
                    "1.Add To Address Book\n2.Edit Existing Entry\n3.Delete Contact\n4.Display Address book\n5.Display Sorted Address Book By Custom Criteria\n6.Write To File\n7.Read From File\n8.Exit Address book System");

            switch (scannerObject.nextInt()) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editPerson();
                    break;
                case 3:
                    deletePerson();
                    break;
                case 4:
                    displayContents();
                    break;
                case 5:
                    System.out.println("What Criteria Do You Want Address Book To Be Sorted In ?");
                    System.out.println("1.FirstName\n2.City\n3.State\n4.Zip Code");
                    int sortingChoice = scannerObject.nextInt();
                    sortAddressBook(sortingChoice);
                    break;
                case 6:
                    writeToAddressBookFile();
                    System.out.println("Written To file");
                    break;
                case 7: readDataFromFile();
                    break;
                case 8:
                    moreChanges = false;
                    System.out.println("Exiting Address Book: "+this.getAddressBookName()+" !");

            }

        } while (moreChanges);
    }

    @Override
    public void addContact() {

        ContactInfo person = new ContactInfo();
        Address address = new Address();

        System.out.println("Enter First Name: ");
        String firstName = scannerObject.next();

        contactList.entrySet().stream().forEach(entry -> {
            if(entry.getKey().equals(firstName.toLowerCase())) {
                System.out.println("Contact Already Exists");
                isPresent = true;
                return;
            }
        });

        if(isPresent == false) {

            System.out.println("Enter Last Name: ");
            String lastName = scannerObject.next();

            System.out.println("Enter Phone Number: ");
            long phoneNumber = scannerObject.nextLong();

            System.out.println("Enter Email: ");
            String email = scannerObject.next();

            System.out.println("Enter City: ");
            String city = scannerObject.next();

            System.out.println("Enter State: ");
            String state = scannerObject.next();

            System.out.println("Enter Zip Code: ");
            long zipCode = scannerObject.nextLong();

            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setPhoneNumber(phoneNumber);
            person.setEmail(email);
            address.setCity(city);
            address.setState(state);
            address.setZip(zipCode);
            person.setAddress(address);
            addPersonToCity(person);
            addPersonToState(person);
            contactList.put(firstName.toLowerCase(), person);
        }

    }

    public void addPersonToCity(ContactInfo contact) {
        if (personByCity.containsKey(contact.getAddress().getCity())) {
            personByCity.get(contact.getAddress().getCity()).add(contact);
        }
        else {
            ArrayList<ContactInfo> cityList = new ArrayList<ContactInfo>();
            cityList.add(contact);
            personByCity.put(contact.getAddress().getCity(), cityList);
        }
    }

    public void addPersonToState(ContactInfo contact) {
        if (personByState.containsKey(contact.getAddress().getState())) {
            personByState.get(contact.getAddress().getState()).add(contact);
        }
        else {
            ArrayList<ContactInfo> stateList = new ArrayList<ContactInfo>();
            stateList.add(contact);
            personByState.put(contact.getAddress().getState(), stateList);
        }
    }

    public void editPerson() {

        ContactInfo person = new ContactInfo();

        System.out.println("Enter the first name:");
        String firstName = scannerObject.next();

        if(contactList.containsKey(firstName)) {
            person = contactList.get(firstName);

            Address address = person.getAddress();
            System.out.println("\nChoose the attribute you want to change:");
            System.out.println("1.Last Name\n2.Phone Number\n3.Email\n4.City\n5.State\n6.ZipCode");
            int choice = scannerObject.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the correct Last Name :");
                    String lastName = scannerObject.next();
                    person.setLastName(lastName);
                    break;
                case 2:
                    System.out.println("Enter the correct Phone Number :");
                    long phoneNumber = scannerObject.nextLong();
                    person.setPhoneNumber(phoneNumber);
                    break;
                case 3:
                    System.out.println("Enter the correct Email Address :");
                    String email = scannerObject.next();
                    person.setEmail(email);
                    break;
                case 4:
                    System.out.println("Enter the correct City :");
                    String city = scannerObject.next();
                    address.setCity(city);
                    break;
                case 5:
                    System.out.println("Enter the correct State :");
                    String state = scannerObject.next();
                    address.setState(state);
                    break;
                case 6:
                    System.out.println("Enter the correct ZipCode :");
                    long zip = scannerObject.nextLong();
                    address.setZip(zip);
                    break;
            }
        }
        else {
            System.out.println("Book Does Not Exist");
        }


    }

    @Override
    public void deletePerson() {

        System.out.println("Enter the first name of the person to be deleted");
        String firstName = scannerObject.next();
        if(contactList.containsKey(firstName)) {
            contactList.remove(firstName);
            System.out.println("Successfully Deleted");
        }
        else {
            System.out.println("Contact Not Found!");
        }

    }

    @Override
    public void displayContents() {

        System.out.println("----- Contents of the Address Book "+this.getAddressBookName()+" -----");
        for (String eachContact : contactList.keySet()) {
            ContactInfo person = contactList.get(eachContact);
            System.out.println(person);
        }
        System.out.println("-----------------------------------------");

    }

    public void printSortedList(List<ContactInfo> sortedContactList) {
        System.out.println("------ Sorted Address Book "+this.getAddressBookName()+" ------");
        Iterator iterator = sortedContactList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }

    public void sortAddressBook(int sortingChoice) {
        List<ContactInfo> sortedContactList;

        switch(sortingChoice) {

            case 1: sortedContactList = contactList.values().stream()
                    .sorted((firstperson, secondperson) -> firstperson.getFirstName().compareTo(secondperson.getFirstName()))
                    .collect(Collectors.toList());
                printSortedList(sortedContactList);
                break;

            case 2: sortedContactList = contactList.values().stream()
                    .sorted((firstperson, secondperson) -> firstperson.getAddress().getCity().compareTo(secondperson.getAddress().getCity()))
                    .collect(Collectors.toList());
                printSortedList(sortedContactList);
                break;

            case 3: sortedContactList = contactList.values().stream()
                    .sorted((firstperson, secondperson) -> firstperson.getAddress().getState().compareTo(secondperson.getAddress().getState()))
                    .collect(Collectors.toList());
                printSortedList(sortedContactList);
                break;

            case 4: sortedContactList = contactList.values().stream()
                    .sorted((firstperson, secondperson) -> Long.valueOf(firstperson.getAddress().getZip()).compareTo(Long.valueOf(secondperson.getAddress().getZip())))
                    .collect(Collectors.toList());
                printSortedList(sortedContactList);
                break;
        }

    }

    public void writeToAddressBookFile() {

        String bookName = this.getAddressBookName();
        String fileName = bookName+".txt";

        StringBuffer addressBookBuffer = new StringBuffer();
        contactList.values().stream().forEach(contact -> {
            String personDataString = contact.toString().concat("\n");
            addressBookBuffer.append(personDataString);
        });

        try {
            Files.write(Paths.get(fileName), addressBookBuffer.toString().getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<String> readDataFromFile() {

        List<String> addressBookList = new ArrayList<String>();
        String bookName = this.getAddressBookName();
        String fileName = bookName+".txt";
        System.out.println("Reading from : "+fileName+"\n");
        try {
            Files.lines(new File(fileName).toPath())
                    .map(line -> line.trim())
                    .forEach(employeeDetails -> {
                        System.out.println(employeeDetails);
                        addressBookList.add(employeeDetails);
                    });

        }
        catch(IOException e){
            e.printStackTrace();
        }
        return addressBookList;
    }

}
