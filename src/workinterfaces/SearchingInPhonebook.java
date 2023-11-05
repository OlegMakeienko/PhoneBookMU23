package src.workinterfaces;

import src.phonebook.Contact;
import src.phonebook.PhoneBook;

import java.util.Collections;
import java.util.List;

public interface SearchingInPhonebook {

    default List<Contact> getContactsWithAnySuitableInfo(String something) {
        return Collections.emptyList();
    }

    default void showContactsWithAnySuitableInfo(String something) {
        System.out.println("Frisökning - ger alla profiler med någon relaterbar kontaktinformation");
    }

    default List<Contact> getContactsWithAddress(String street) {
        return Collections.emptyList();
    }

    default void showContactsWithAddress(String street) {
        System.out.println("Sökning på adress - ger alla profiler på samma gatunamn.");
    }
    default Contact getContactWithLastName(String lastName) {
        return null;
    }

    default void showContactWithLastName(String lastName) {
        System.out.println("Sökning på efternamn - ger profilen som först matchar med sökningen.");
    }
    default List<Contact> getContactsWithFirstName(String firstName) {
        return Collections.emptyList();
    }

    default void showContactsWithFirstName(String firstName) {
        System.out.println("Sökning på förnamn - ger alla profiler med det sökta förnamnet.");
    }
}
