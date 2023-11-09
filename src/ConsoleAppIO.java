package src;

import src.datasourse.PhoneBookFileHandler;
import src.phonebook.PhoneBook;

public class ConsoleAppIO {
    public static void main(String[] args) {
        ConsoleLogic consoleLogic = new ConsoleLogic();

        PhoneBook phoneBook = PhoneBookFileHandler.loadPhoneBook();

        consoleLogic.enter(phoneBook);

        PhoneBookFileHandler.savePhoneBook(phoneBook);
    }
}
