package src;

import src.phonebook.Contact;
import src.phonebook.PhoneBook;

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
                .lastName("Risselsson")
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

        Contact userProfile4 = Contact.builder()
                .firstName("Ulf")
                .lastName("Makeienko")
                .age(63)
                .userAddress("Åsvägen 666, Risse-Fe, 76645")
                .addPhoneNumber("+66-666-123-6666")
                .build();

        phoneBook.addContact(userProfile1);
        phoneBook.addContact(userProfile2);
        phoneBook.addContact(userProfile3);
        phoneBook.addContact(userProfile4);


        //phoneBook.showContactsWithFirstName("Marie");
        //System.out.println(phoneBook.getContactWithLastName("Makeienko"));
        //phoneBook.showContactsWithAddress("Gatavägen");
        //System.out.println(phoneBook.getContactsWithAddress("Risselåsvägen"));
        //phoneBook.showContactsWithAnySuitableInfo("Ri");
        //phoneBook.deleteContact(userProfile2);
        //phoneBook.updateContact(userProfile1, "Mark");
        phoneBook.showAllContacts();
    }
}
