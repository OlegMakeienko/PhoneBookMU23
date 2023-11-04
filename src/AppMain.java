package src;

import src.phonebook.Contact;
import src.phonebook.PhoneBook;
import src.user.Admin;
import src.user.User;

public class AppMain {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

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
                .lastName("Ohlsson")
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

        phoneBook.addContact(userProfile1);
        phoneBook.addContact(userProfile2);
        phoneBook.addContact(userProfile3);

        phoneBook.showContactWithFirstName("Marie");
    }
}
