package src;

import src.ConsoleLogic;
import src.datasourse.PhoneBookFileHandler;
import src.phonebook.PhoneBook;

public class ConsoleAppIO {
    public static void main(String[] args) {
        ConsoleLogic consoleLogic = new ConsoleLogic();

        // Load the existing PhoneBook from a file if available
        PhoneBook phoneBook = PhoneBookFileHandler.loadPhoneBook();

        consoleLogic.enter(phoneBook);

        // Save the PhoneBook to a file after admin actions
        PhoneBookFileHandler.savePhoneBook(phoneBook);
    }
}
