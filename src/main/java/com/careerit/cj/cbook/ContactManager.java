package com.careerit.cj.cbook;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ContactManager {

    // TODO
    // Add a option to show all contacts
    // Add a option to update name and email

    public static void main(String[] args) {

        ContactService service = new ContactService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-----------------------------------");
            System.out.println("1. Add contact");
            System.out.println("2. Update mobile");
            System.out.println("3. Get contact by id");
            System.out.println("4. Delete contact");
            System.out.println("5. Search contact");
            System.out.println("6. Show all contacts");
            System.out.println("7. Exit");
            System.out.println("Total contacts: "+service.getCount());
            System.out.println("-----------------------------------");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter email:");
                    String email = sc.nextLine();
                    System.out.println("Enter mobile:");
                    String mobile = sc.nextLine();
                    System.out.println("Enter city:");
                    String city = sc.nextLine();
                    String id = service.addContact(name, email, mobile, city);
                    System.out.println("Contact added with id: "+id);
                    break;
                case 2:
                    System.out.println("Enter id:");
                    String upId = sc.nextLine();
                    System.out.println("Enter new mobile:");
                    String upMobile = sc.nextLine();
                    String message = service.updateMobile(upId, upMobile);
                    System.out.println(message);
                    break;
                case 3:
                    System.out.println("Enter id:");
                    String getId = sc.nextLine();
                    Optional<Contact> optContact = service.getContact(getId);
                    if(optContact.isPresent()) {
                        Contact contact = optContact.get();
                        showContactDetails(contact);
                    }else{
                        System.out.println("Contact with id "+getId+" not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter id:");
                    String delId = sc.nextLine();
                    boolean isDeleted = service.deleteContact(delId);
                    if(isDeleted){
                        System.out.println("Contact deleted successfully");
                    }else{
                        System.out.println("Contact with id "+delId+" not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter search string:");
                    String str = sc.nextLine();
                    System.out.println("Search results:");
                    List<Contact> searchContacts = service.search(str);
                    if(searchContacts.isEmpty()) {
                        System.out.println("No contacts found with search string: " + str);
                    }else{
                        for(Contact contact: searchContacts){
                            showContactDetails(contact);
                        }
                    }
                    break;
                case 6:
                    List<Contact> contacts = service.getContacts();
                    if(contacts.isEmpty()){
                        System.out.println("No contacts found");
                    }else{
                        for(Contact contact: contacts){
                            showContactDetails(contact);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Thanks for using contact manager");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please enter valid choice");
            }
        }

    }

    private static void showContactDetails(Contact contact) {
        System.out.println("Id     : "+contact.getId());
        System.out.println("Name   : "+contact.getName());
        System.out.println("Email  : "+contact.getEmail());
        System.out.println("Mobile : "+contact.getMobile());
        System.out.println("City   : "+contact.getCity());
    }
}
