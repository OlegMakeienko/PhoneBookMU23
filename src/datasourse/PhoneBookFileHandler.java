package src.datasourse;

import src.phonebook.Contact;
import src.phonebook.PhoneBook;

import java.io.*;

public class PhoneBookFileHandler {

    private PhoneBookFileHandler() {
    }

    private static final String SERIALIZED_FILE_NAME = "src/datasourse/phonebook.ser";
    private static final String TEXT_FILE_NAME = "src/datasourse/phonebook.txt";

    public static void savePhoneBook(PhoneBook phoneBook) {
        // Save the phone book in serialized format
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME))) {
            outputStream.writeObject(phoneBook);
            System.out.println("Phone book saved successfully (serialized).");
        } catch (IOException e) {
            System.err.println("Error saving phone book (serialized): " + e.getMessage());
        }

        // Save the phone book in text format
        try (PrintWriter writer = new PrintWriter(new FileWriter(TEXT_FILE_NAME))) {
            for (Contact contact : phoneBook.getAllContacts()) {
                writer.println("First Name: " + contact.getFirstName());
                writer.println("Last Name: " + contact.getLastName());
                writer.println("Age: " + contact.getAge());
                writer.println("Phone number: " + String.join(", ", contact.getPhoneNumbers()));
                writer.println("Address: " + contact.getUserAddress().getStreet() + ", " +
                        contact.getUserAddress().getCity() + ", " +
                        contact.getUserAddress().getPostCode());
                writer.println();  // Empty line between contacts
            }
            System.out.println("Phone book saved successfully (text).");
        } catch (IOException e) {
            System.err.println("Error saving phone book (text): " + e.getMessage());
        }
    }

    public static PhoneBook loadPhoneBook() {
        PhoneBook phoneBook = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(SERIALIZED_FILE_NAME))) {
            phoneBook = (PhoneBook) inputStream.readObject();
            System.out.println("Phone book loaded successfully (serialized).");
        } catch (FileNotFoundException e) {
            System.err.println("Serialized phone book file not found. Creating a new phone book.");
            phoneBook = new PhoneBook();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading phone book (serialized): " + e.getMessage());
        }
        return phoneBook;
    }
}
