package src;

import src.phonebook.Contact;
import src.phonebook.ContactBuilder;
import src.phonebook.PhoneBook;

import java.util.List;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        Contact userProfile1 = Contact.builder()
                .firstName("Oleg")
                .lastName("Makeienko")
                .age(40)
                .userAddress("Risselåsvägen 80 B, Strömsund, 83335")
                .addPhoneNumber("+46-072-129-2213")
                .addPhoneNumber("+46-070-888-7564")
                .build();

        Contact userProfile2 = Contact.builder()
                .firstName("Marie")
                .lastName("Risselsson")
                .age(27)
                .userAddress("Gatavägen 813, California, 12345")
                .addPhoneNumber("+00-000-123-4567")
                .build();

        Contact userProfile3 = Contact.builder()
                .firstName("Marie")
                .lastName("Bond")
                .age(33)
                .userAddress("GaStreet 813, Kyiv, 99009")
                .addPhoneNumber("+38-050-123-4321")
                .build();

        Contact userProfile4 = Contact.builder()
                .firstName("Ulf")
                .lastName("Makeienko")
                .age(63)
                .userAddress("Åsvägen 666, Risse-Fe, 76645")
                .addPhoneNumber("+66-666-123-6666")
                .build();

        phoneBook.addContact(userProfile1);
        phoneBook.addContact(userProfile2);
        phoneBook.addContact(userProfile3);
        phoneBook.addContact(userProfile4);

        while (true) {
            System.out.println("You are welcome, write: (1 = Guest, 2 = Admin, q = Exit):");
            String userType = scanner.nextLine();

            if (userType.equals("1")) {
                // Guest
                System.out.println("Search contact (write contacts first name):");
                String searchTerm = scanner.nextLine();
                List<Contact> searchResults = phoneBook.getContactsWithAnySuitableInfo(searchTerm);
                displayContacts(searchResults);
            } else if (userType.equals("2")) {
                // Admin
                System.out.println("You have 3 choice:  (1 = Add contact, 2 = Delete contact, 3 = Update contact):");
                String adminAction = scanner.nextLine();

                if (adminAction.equals("1")) {
                    // Add contact
                    Contact contact = createContact(scanner);
                    phoneBook.addContact(contact);
                } else if (adminAction.equals("2")) {
                    // Delete contact
                    System.out.println("Write contacts last name for remove contact:");
                    String lastNameToRemove = scanner.nextLine();
                    Contact contactToRemove = phoneBook.getContactWithLastName(lastNameToRemove);
                    if (contactToRemove != null) {
                        phoneBook.deleteContact(contactToRemove);
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact did not has find.");
                    }
                } else if (adminAction.equals("3")) {
                    // Update contact
                    System.out.println("Write contacts last name for update contact:");
                    String lastNameToUpdate = scanner.nextLine();
                    Contact contactToUpdate = phoneBook.getContactWithLastName(lastNameToUpdate);
                    System.out.println(contactToUpdate);

                    if (contactToUpdate != null) {
                        System.out.println("Write new first name to this contact: ");
                        String newName = scanner.nextLine();
                        phoneBook.updateContact(contactToUpdate, newName);

                        //Contact updatedContact = createContact(scanner);
                        //phoneBook.updateContact(contactToUpdate, updatedContact.getFirstName());

                        System.out.println("Contact has update. \n  Contact with new data is: ");
                        System.out.println(contactToUpdate);
                    } else {
                        System.out.println("Contact did not has find.");
                    }
                }
            } else if (userType.equalsIgnoreCase("q")) {
                System.out.println("Good bye!");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
    }

    private static Contact createContact(Scanner scanner) {
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

        ContactBuilder builder = Contact.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .userAddress(address)
                .addPhoneNumber(phoneNumbers);

        return builder.build();
    }

    private static void displayContacts(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
