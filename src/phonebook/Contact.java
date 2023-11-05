package src.phonebook;

import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> phoneNumbers;
    private Address userAddress;

    protected Contact(String firstName, String lastName, int age, Address userAddress, List<String> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userAddress = userAddress;
        this.phoneNumbers = phoneNumbers;
    }

    protected Contact() { }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "\n UserProfile: " +
                "\n    firstName='" + firstName + '\'' +
                ", \n    lastName='" + lastName + '\'' +
                ", \n    age=" + age +
                ", \n    address='" + userAddress.toString() + '\'' +
                ", \n    phoneNumbers=" + phoneNumbers + "\n";
    }
}