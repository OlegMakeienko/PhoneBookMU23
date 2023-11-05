package src.phonebook;

import src.workinterfaces.ModifyingPhonebook;
import src.workinterfaces.SearchingInPhonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements SearchingInPhonebook, ModifyingPhonebook {
    private List<Contact> contacts;

    private List<Contact> getAllContacts() {
        return contacts;
    }

    public PhoneBook() {
        contacts = new ArrayList<>();
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
    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public List<Contact> getContactsWithAnySuitableInfo(String something) {
        List<Contact> foundContacts = new ArrayList<>();
        contacts = getAllContacts();
        String searchLower = something.toLowerCase();

        for (Contact value : contacts) {
            if (value.getFirstName().toLowerCase().contains(searchLower) ||
                    value.getLastName().toLowerCase().contains(searchLower) ||
                    value.getUserAddress().getStreet().toLowerCase().contains(searchLower) ||
                    value.getUserAddress().getCity().toLowerCase().contains(searchLower) ||
                    value.getUserAddress().getPostCode().toLowerCase().contains(searchLower)) {
                foundContacts.add(value);
            }
        }
        return foundContacts;
    }

    @Override
    public void showContactsWithAnySuitableInfo(String something) {
        List<Contact> foundContacts = new ArrayList<>();
        String searchLower = something.toLowerCase();

        for (Contact value : contacts) {
            if (value.getFirstName().toLowerCase().contains(searchLower) ||
                value.getLastName().toLowerCase().contains(searchLower) ||
                value.getUserAddress().getStreet().toLowerCase().contains(searchLower) ||
                value.getUserAddress().getCity().toLowerCase().contains(searchLower) ||
                value.getUserAddress().getPostCode().toLowerCase().contains(searchLower)) {
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
