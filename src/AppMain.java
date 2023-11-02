package src;

public class AppMain {
    public static void main(String[] args) {
        Contact userProfile = Contact.builder()
                .firstName("Oleg")
                .lastName("Makeienko")
                .age(22)
                .address("Risselåsvägen 80 B, Strömsund 83335")
                .addPhoneNumber("+46-072-129-2213")
                .addPhoneNumber("+46-070-888-7564")
                .build();

        System.out.println(userProfile.toString());
    }
}
