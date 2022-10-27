package com.adddresscontactbooksystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBookSystem {
    List<PersonalInfo> contactBook;

    public static void main(String[] args) {
//To create a Contacts in Address Book with first and last names, address,city, state, zip, phone number and email...
        System.out.println("Address Book Program uc1 ");
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        List<PersonalInfo> contactBook = new ArrayList<PersonalInfo>();

        contactBook.add(new PersonalInfo("Rahul", "Roy", 9812345675l, "rahulroy20@xyz.com", "Bangalore", "Karnataka", 563322));
        contactBook.add(new PersonalInfo("Lavanya", "Dhariyal", 970047875l, "lavanya2@abc.com", "Pune", "Maharashtra", 441222));
        Iterator<PersonalInfo> personalInfoIterator = contactBook.iterator();

        while (personalInfoIterator.hasNext()) {
            System.out.println(personalInfoIterator.next());
        }
    }
}
