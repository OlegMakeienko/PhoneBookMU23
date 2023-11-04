package src.workInterfaces;

import src.phonebook.Contact;
import src.phonebook.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public interface SearchingInPhonebook {

    PhoneBook phoneBook = new PhoneBook();
    default List<Contact> getContactWithFirstName(String firstName) { // Sökning på förnamn - ger alla profiler med det sökta förnamnet.
        List<Contact> foundContacts = new ArrayList<>();
        phoneBook.showAllContacts();
        List<Contact> contacts = phoneBook.getAllContacts();
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getFirstName().equals(firstName)) {
                foundContacts.add(contacts.get(i));
            }
        }
        return foundContacts;
    }

    default void showContactWithFirstName(String firstName) { // Sökning på förnamn - ger alla profiler med det sökta förnamnet.
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
