package src.workInterfaces;

import src.phonebook.Contact;
import src.phonebook.ContactBuilder;
import src.phonebook.PhoneBook;

import java.util.Collections;
import java.util.List;

public interface SearchingInPhonebook {

    PhoneBook phoneBook = new PhoneBook();

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



    // default void updateContact(Contact profile) {
          /* if (isAdmin || profiles.contains(profile)) {
            // Implement profile update logic here
        } else {
            System.out.println("Permission denied. You need to be an admin or the profile owner to update.");
        }*/
   // }

    /*
    public void deleteContact(UserProfile profile) {
        if (isAdmin || profiles.contains(profile)) {
            profiles.remove(profile);
        } else {
            System.out.println("Permission denied. You need to be an admin or the profile owner to delete.");
        }
    }

     */
}
