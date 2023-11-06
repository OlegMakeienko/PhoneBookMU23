package src.workinterfaces;

import src.phonebook.Contact;

import java.util.Scanner;

public interface ModifyingPhonebook {

    default void addContact(Contact contact) {
        System.out.println("Contact added");
    }

    default void deleteContact(Contact contact) {
        System.out.println("Contact deleted");
    }

    default void updateContact(Contact contact, String somOneInfoWeWillUpdate) {
        System.out.println("Contact updated");
    }

    default Contact createContact(Scanner scanner) {
        return null;
    }

    // default void updateContact(Contact profile) {
          /* if (isAdmin || profiles.contains(profile)) {
            // Implement profile update logic here
        } else {
            System.out.println("Permission denied. You need to be an admin or the profile owner to update.");
        }*/
    // }

    /*
    default void deleteContact(UserProfile profile) {
        if (isAdmin || profiles.contains(profile)) {
            profiles.remove(profile);
        } else {
            System.out.println("Permission denied. You need to be an admin or the profile owner to delete.");
        }
    }*/
}
