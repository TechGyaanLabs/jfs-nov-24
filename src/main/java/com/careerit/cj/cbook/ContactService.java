package com.careerit.cj.cbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactService {

    private List<Contact> contacts;

    public ContactService() {
        this.contacts = new ArrayList<>();
    }

    public String addContact(String name, String email, String mobile, String city) {
        Contact contact = new Contact(name, email, mobile, city);
        contacts.add(contact);
        return contact.getId();
    }

    public Optional<Contact> getContact(String id){
        for(Contact contact: contacts){
            if(contact.getId().equals(id)){
                return Optional.of(contact);
            }
        }
        return Optional.empty();
    }

    public String updateMobile(String id, String mobile){
        Optional<Contact> optContact = getContact(id);
        if(optContact.isPresent()){
            Contact contact = optContact.get();
            contact.setMobile(mobile);
            return "Mobile number updated successfully";
        }
        return "Contact with id "+id+" not found";
    }

    public boolean deleteContact(String id){
        Optional<Contact> optContact = getContact(id);
        if(optContact.isPresent()){
            Contact contact = optContact.get();
            contacts.remove(contact);
            return true;
        }
        return false;
    }

    public List<Contact> search(String str){
        List<Contact> searchContacts = new ArrayList<>();

        for(Contact contact: contacts){
            if(contact.getName().contains(str) || contact.getMobile().contains(str) ){
                searchContacts.add(contact);
            }
        }
        return searchContacts;
    }


    public long getCount() {
        return contacts.size();
    }
}
