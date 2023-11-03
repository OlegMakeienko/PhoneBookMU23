package src;

import java.util.ArrayList;
import java.util.List;

public class ContactBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> phoneNumbers;
    private Address userAddress;

    public ContactBuilder() {
        this.age = -1;
        this.phoneNumbers = new ArrayList<>();
    }

    public ContactBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder age(int age) {
        this.age = age;
        return this;
    }

    public ContactBuilder userAddress(String address) {
        String[] addressParts = address.split(",");

        if (addressParts.length != 3) {
            throw new IllegalArgumentException("Invalid address format. Expected 3 fields separated by commas.");
        }

        String street = addressParts[0].trim();
        String city = addressParts[1].trim();
        String postCode = addressParts[2].trim();

        this.userAddress = new Address(street, city, postCode);
        return this;
    }

    public ContactBuilder addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
        return this;
    }

    public Contact build() {
        return new Contact(firstName, lastName, age, userAddress, phoneNumbers);
    }
}