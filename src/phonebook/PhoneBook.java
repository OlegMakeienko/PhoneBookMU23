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
    public List<Contact> getContactsWithAddress(String street) {
        List<Contact> foundContacts = new ArrayList<>();
        contacts = getAllContacts();
        for (Contact value : contacts) {
            String foundStreet = value.getUserAddress().getStreet();
            String[] arr = foundStreet.split(" ", 2);
            if (arr[0].equals(street)) {
                foundContacts.add(value);
            }
        }
        return foundContacts;
    }

    @Override
    public void showContactsWithAddress(String street) {
        List<Contact> foundContacts = new ArrayList<>();
        contacts = getAllContacts();
        for (Contact value : contacts) {
            String foundStreet = value.getUserAddress().getStreet();
            String[] arr = foundStreet.split(" ", 2);
            if (arr[0].equals(street)) {
                foundContacts.add(value);
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

    @Override
    public Contact getContactWithLastName(String lastName) {
        Contact contact = new Contact();
        contacts = getAllContacts();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(lastName)) {
                contact =  contacts.get(i);
            }
        }
        return contact;
    }

    @Override
    public void showContactWithLastName(String lastName) {
        contacts = getAllContacts();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(lastName)) {
                System.out.println(contacts.get(i));
            }
        }
    }

    @Override
    public List<Contact> getContactsWithFirstName(String firstName) {
        List<Contact> foundContacts = new ArrayList<>();
        contacts = getAllContacts();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    @Override
    public void showContactsWithFirstName(String firstName) {
        List<Contact> foundContacts = new ArrayList<>();
        contacts = getAllContacts();
        for (Contact value : contacts) {
            if (value.getFirstName().equals(firstName)) {
                foundContacts.add(value);
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
