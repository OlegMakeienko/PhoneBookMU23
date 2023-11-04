package src.phonebook;

import src.workInterfaces.SearchingInPhonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements SearchingInPhonebook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public void showAllContacts() {
        List<Contact> contacts1 = getAllContacts();
        for (Contact contact : contacts1) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Age: " + contact.getAge());
            System.out.println("Phone number: " + contact.getPhoneNumbers());
            System.out.println("Address: " + contact.getUserAddress().getStreet() + ", " +
                    contact.getUserAddress().getCity() + ", " +
                    contact.getUserAddress().getPostCode());
            System.out.println();
        }
    }

    @Override
    public List<Contact> getContactWithFirstName(String firstName) {
        return SearchingInPhonebook.super.getContactWithFirstName(firstName);
    }

    @Override
    public void showContactWithFirstName(String firstName) {
        List<Contact> foundContacts = new ArrayList<>();
        List<Contact> contacts = getAllContacts();
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getFirstName().equals(firstName)) {
                foundContacts.add(contacts.get(i));
            }
        }
        for (Contact contact : foundContacts) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Age: " + contact.getAge());
            System.out.println("Phone number: " + contact.getPhoneNumbers());
            System.out.println("Address: " + contact.getUserAddress().getStreet() + ", " +
                    contact.getUserAddress().getCity() + ", " +
                    contact.getUserAddress().getPostCode());
            System.out.println();
        }
    }
}
