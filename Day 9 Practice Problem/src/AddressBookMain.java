import java.util.Scanner;

public class AddressBookMain {
    static String greeting = "**Welcome to Address Book Program**";

    public static void main(String[] args) {
        System.out.println(greeting);
        PrintInterface interface1 = new Person();
        interface1.Operation();

    }
}
class Contact {
    String firstName,lastName,address,state,email;
    int zip;
    long phoneNumber;
    Contact(String firstName,String lastName,String address,String state,int zip,long phoneNumber,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    @Override
    public String toString() {
        return "Contact [firstName : " + firstName + ", lastName : " + lastName + ", address : " + address + ", state : "
                + state + ", email : " + email + ", zip : " + zip + ", phoneNumber : " + phoneNumber + "]";
    }


}

class Info {
    public void contactInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of person");
        System.out.println("Add first name");
        Person.firstName = sc.next();
        System.out.println("Add last name");
        Person.lastName= sc.next();
        System.out.println("Add address");
        Person.address = sc.next();
        System.out.println("Add state");
        Person.state= sc.next();
        System.out.println("Add zip");
        Person.zip = sc.nextInt();
        System.out.println("Add phone number");
        Person.phoneNumber = sc.nextLong();
        System.out.println("Add email");
        Person.email = sc.next();
    }
}
class Person implements PrintInterface {

    static Scanner sc = new Scanner(System.in);
    static String firstName,lastName,address,state,email;
    static int zip;
    static long phoneNumber;
    static int counterForAdd=3;
    static int counter;
    static Contact [] personDetails = new Contact[10];
    Info info = new Info();

    public  void Operation() {
        Contact person1 = new Contact("Vivek", "Singh", "159UnityApartment",
                "Delhi", 110089, 903916580, "vvivk@mail.com");
        Contact person2 = new Contact("Aryan", "Srivastava", "MauryaRoad",
                "Bihar", 841301, 1234678954, "aryan@mail.com");
        Contact person3 = new Contact("Aparna", "Singh", "GolaRoad",
                "Bihar", 841301, 657845614, "aparna@mail.com");
        personDetails[0] = person1;
        personDetails[1] = person2;
        personDetails[2] = person3;

        System.out.println("Created contact list is");
        counter = personDetails.length;
        for (int i = 0; i < counter; i++) {
            if (personDetails[i] != null) {
                System.out.println(personDetails[i]);
            } else {
                break;
            }
        }
        System.out.println();
        boolean label = true;
        while (label) {
            System.out.println("Enter your choice");
            System.out.println("1)Add contact");
            System.out.println("2)Edit contact");
            System.out.println("3)Delete contact");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int numOfPerson = 1;
                    System.out.println("Enter how many contacts do you want to add");
                    int numOfContacts = sc.nextInt();
                    while (numOfContacts > 0) {
                        System.out.println("Add Person" + numOfPerson);
                        info.contactInfo();
                        //Contact person4 = new Contact(firstName,lastName,address,state,zip,phoneNumber,email);
                        personDetails[counterForAdd++] = new Contact(firstName, lastName, address, state, zip, phoneNumber, email);
                        numOfContacts--;
                        numOfPerson++;
                    }
                    System.out.println("Newly updated contact list is");
                    for (int i = 0; i < counterForAdd; i++) {
                        System.out.println(personDetails[i]);
                    }
                    break;
                case 2:
                    int i;
                    System.out.println("Enter name of person whose details you want to edit");
                    String keyName = sc.next();
                    for (i = 0; i < counterForAdd; i++) {
                        if (keyName.equals(personDetails[i].firstName)) {
                            info.contactInfo();
                            Contact person5 = new Contact(firstName, lastName, address, state, zip, phoneNumber, email);
                            Person.personDetails[i] = person5;
                        }
                    }
                    System.out.println("Newly edited contact list is");
                    for (i = 0; i < Person.counterForAdd; i++) {
                        System.out.println(Person.personDetails[i]);
                    }

                    break;
                case 3:
                    System.out.println("Enter name of person whose details you want to delete");
                    String keyToDelete = sc.next();
                    for (i = 0; i < counterForAdd; i++) {
                        if (keyToDelete.equals(personDetails[i].firstName)) {
                            for (int k = i; k < counterForAdd - i; k++) {
                                personDetails[k] = personDetails[k + 1];
                            }
                            counterForAdd--;
                        }
                    }
                    System.out.println("Newly edited contact list is");
                    for (i = 0; i < counterForAdd; i++) {
                        System.out.println(personDetails[i]);
                    }
                    break;
                default:
                    System.err.println("Enter valid choice");
            }
            System.out.println("Do you to enter your choice again");
            System.out.println("Enter '1' if you want or '2' if you dont want");
            int responceToContinue = sc.nextInt();
            if (responceToContinue == 1) {
                label = true;
            } else {
                label = false;
            }
        }

    }
}
