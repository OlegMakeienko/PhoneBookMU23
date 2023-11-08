package src;

import src.datasourse.PhoneBookDataSource;
import src.phonebook.PhoneBook;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        ConsoleLogic consoleLogic = new ConsoleLogic();
        PhoneBookDataSource pnoneBookDataSourse = new PhoneBookDataSource();

        consoleLogic.ConsoleLogic(pnoneBookDataSourse.phoneBookDataBase());

    }
}
