package src;

import src.phonebook.Contact;
import src.phonebook.PhoneBook;

import java.util.List;
import java.util.Scanner;

import static src.user.Admin.authenticateAdmin;

public class ConsoleLogic {

    private Scanner scanner;

    public ConsoleLogic() {
        this.scanner = new Scanner(System.in);
    }

    public void enter(PhoneBook phoneBook) {
        if (phoneBook == null) {
            phoneBook = new PhoneBook();
        }

        while (true) {
            System.out.println("You are welcome, write: (1 = Guest, 2 = Admin, q = Exit):");
            String userType = scanner.nextLine();

            if (userType.equals("1")) {
                // Guest
                String choice;
                System.out.println("You can choose: 1 = Show all contacts, 2 = Search contact");
                choice = scanner.nextLine();
                if(choice.equals("1")) {
                    phoneBook.showAllContacts();
                } else if(choice.equals("2")) {
                    System.out.println("Search contact (write something):");
                    String searchTerm = scanner.nextLine();
                    List<Contact> searchResults = phoneBook.getContactsWithAnySuitableInfo(searchTerm);
                    phoneBook.displayContacts(searchResults);
                }

            } else if (userType.equals("2")) {
                // Admin
                System.out.println("Enter the admin username:");
                String adminUsername = scanner.nextLine();
                System.out.println("Enter the admin password:");
                String adminPassword = scanner.nextLine();

                // Here, you can add authentication and verify the admin's username and password
                if (!authenticateAdmin(adminUsername, adminPassword)) {
                    System.out.println("Invalid username or password. Please try again.");
                } else {
                    System.out.println("Welcome as an administrator!");

                    System.out.println("You have 3 choice:  (1 = Add contact, 2 = Delete contact, 3 = Update contact):");

                    String adminAction = scanner.nextLine();

                    if (adminAction.equals("1")) {
                        // Add contact
                        Contact contact = phoneBook.createContact(scanner);
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

                            //Contact updatedContact = phoneBook.createContact(scanner);
                            //phoneBook.updateContact(contactToUpdate, updatedContact.getFirstName());

                            System.out.println("Contact has update. \n  Contact with new data is: ");
                            System.out.println(contactToUpdate);
                        } else {
                            System.out.println("Contact did not has find.");
                        }
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
}
