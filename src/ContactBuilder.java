package src;

import java.util.ArrayList;
import java.util.List;

public class ContactBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private List<String> phoneNumbers;

    public ContactBuilder() {
        this.age = -1;
        this.phoneNumbers = new ArrayList<>();
    }

    public ContactBuilder firstName (String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder lastName (String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder age(int age) {
        this.age = age;
        return this;
    }

    public ContactBuilder address(String address) {
        this.address = address;
        return this;
    }
    public ContactBuilder addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
        return this;
    }

    public Contact build() {
        return new Contact(firstName, lastName, age, address, phoneNumbers);
    }
}