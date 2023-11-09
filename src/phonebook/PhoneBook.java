package src.phonebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Contact> contacts;

    public List<Contact> getAllContacts() {
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

    public void displayContacts(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact createContact(Scanner scanner) {
        System.out.println("Write first name:");
        String firstName = scanner.nextLine();
        System.out.println("Write last name:");
        String lastName = scanner.nextLine();
        System.out.println("Write age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Write address (Street, city, postcode):");
        String address = scanner.nextLine();
        System.out.println("Write phone number (comma if many):");
        String phoneNumbers = scanner.nextLine();

        Contact createdContact = Contact.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .userAddress(address)
                .addPhoneNumber(phoneNumbers)
                .build();

        return createdContact;
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(Contact contact, String newFirstName) {
        contact.setFirstName(newFirstName);
    }

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

    public void showContactWithLastName(String lastName) {
        contacts = getAllContacts();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(lastName)) {
                System.out.println(contacts.get(i));
            }
        }
    }

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
