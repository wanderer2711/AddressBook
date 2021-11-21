package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private int phoneNumber;
    private String email;

    public AddressBook (String name, String address, String city, String state, String zip, int phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
    private ArrayList<AddressBook> addressBook = new ArrayList<AddressBook>();

    private void addRecord (AddressBook address) {
//        addressBook.add(address);
//        addressBook.add()
    }
    private void removeRecord (AddressBookRecords address) {
        addressBook.remove(address);
    }

    public AddressBook() {
        Scanner input = new Scanner(System.in);
        String menuOption;
        do {
            System.out.println("1. Add Record");
            System.out.println("2. Edit Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Exit");
            menuOption = input.nextLine();
        } while (menuOption.equals("4") == false);

        if (menuOption.equals("1")) {

        }
    }
    public static void main (String[] args) {
        new AddressBook();
        System.out.println("Welcome to address book program");
    }
}
