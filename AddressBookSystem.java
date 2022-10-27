package com.adddresscontactbooksystem;

import com.addressbooksystem.PersonalInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//UC2 Ability to add a new Contact to Address Book
public class AddressBookSystem {
    List<com.addressbooksystem.PersonalInfo> contactBook;

    public static com.addressbooksystem.PersonalInfo addPerson() {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the User first name : ");
        String fname = scanobj.next();
        System.out.println("Enter the User last name : ");
        String lname = scanobj.next();
        System.out.println("Enter the User phone number : ");
        long phoneNumber = scanobj.nextInt();
        System.out.println("Enter the User email : ");
        String email = scanobj.next();
        System.out.println("Enter the city name : ");
        String city = scanobj.next();
        System.out.println("Enter the state name : ");
        String state = scanobj.next();
        System.out.println("Enter the zip code : ");
        int zipCode = scanobj.nextInt();
        com.addressbooksystem.PersonalInfo p = new com.addressbooksystem.PersonalInfo(fname, lname, phoneNumber, email, city, state, zipCode);
        return p;
    }

    public static void main(String[] args) {

        com.addressbooksystem.AddressBookSystem addressBookSystem = new com.addressbooksystem.AddressBookSystem();
        List<com.addressbooksystem.PersonalInfo> contactBook = new ArrayList<com.addressbooksystem.PersonalInfo>();

        contactBook.add(new com.addressbooksystem.PersonalInfo("Rahul", "Roy", 9812345675l, "rahulroy20@xyz.com", "Bangalore", "Karnataka", 563322));
        contactBook.add(new com.addressbooksystem.PersonalInfo("Lavanya", "Dhariyal", 970047875l, "lavanya2@abc.com", "Pune", "Maharashtra", 441222));
        contactBook.add(new com.addressbooksystem.PersonalInfo("Sachin", "Bhatt", 9812345875l, "sachinbhatt1@xyz.com", "Mangalore", "Karnataka", 563322));
        contactBook.add(new com.addressbooksystem.PersonalInfo("Aditya", "Agarwal", 9812347875l, "agarwal_aditya@abc.com", "Mathura", "UttarPradesh", 441222));

        Iterator<com.addressbooksystem.PersonalInfo> personalInfoIterator = contactBook.iterator();

        while (personalInfoIterator.hasNext()) {
            System.out.println(personalInfoIterator.next());
        }

        //add new contact in contactbook
        contactBook.add(addPerson());
        Iterator<PersonalInfo> personalInfoIteratorAfterAdd = contactBook.iterator();

        while (personalInfoIteratorAfterAdd.hasNext()) {
            System.out.println(personalInfoIteratorAfterAdd.next());
        }
    }
}