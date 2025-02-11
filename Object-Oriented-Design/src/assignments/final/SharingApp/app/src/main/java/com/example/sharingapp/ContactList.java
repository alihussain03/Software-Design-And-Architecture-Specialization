package com.Entity.sharingapp;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ContactList {
    private ArrayList<Contact> contacts;
    private String FILENAME;

    public ContactList() {
        contacts = new ArrayList<Contact>();
    }

    public void setContacts(ArrayList<Contact> contacts_list) {
        this.contacts = contacts_list;
    }

    public ArrayList<String> getAllUsernames() {
        ArrayList<String> usernames = new ArrayList<>();
        this.contacts.forEach(contact -> usernames.add(contact.getUsername()));
        return usernames;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public Contact getContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            return contacts.get(index);
        }
        return null;
    }

    public int getSize() {
        return contacts.size();
    }

    public int getIndex(Contact contact) {
        return contacts.indexOf(contact);
    }

    public int hasContact(Contact contact) {
        return contacts.contains(contact);
    }

    public int getContactByUsername(String name) {
        return contacts.stream().filter(contact -> contact.getUsername().equals(name))
                .collect(Collectors.toList());
    }

    public int loadContacts(Context context) {
    }

    public int saveContacts(Context context) {
    }

    public boolen isUsernameAvaialable(String username) {
    }
}
