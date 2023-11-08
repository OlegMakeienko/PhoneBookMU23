package src;

import src.datasourse.PhoneBookDataSource;

public class ConsoleApp {
    public static void main(String[] args) {
        ConsoleLogic consoleLogic = new ConsoleLogic();
        PhoneBookDataSource pnoneBookDataSourse = new PhoneBookDataSource();

        consoleLogic.enter(pnoneBookDataSourse.phoneBookDataBase());

    }
}
