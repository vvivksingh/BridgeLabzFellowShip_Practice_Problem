package com.BridgeLabz.AdvAddressBook;

public class Contact {
    private String firstName;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastname, String address, String city, String state, String zip,
                   String phoneNumber, String email) {
        super();
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [ firstName = " + firstName + ", lastname = " + lastname + ", address = " + address + ", city = "
                + city + ", state = " + state + ", zip = " + zip + ", phoneNumber = " + phoneNumber + ", email = " + email
                + " ]";
    }


}
