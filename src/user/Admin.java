package src.user;

import src.phonebook.Contact;
import src.workInterfaces.SearchingInPhonebook;

import java.util.List;

public class Admin extends User{
    public Admin() {
        super(TypAvUsers.ADMIN);
    }


    // вход по паролю
    // Förmåga att lägga till kontaktinformation om en profil med egenskaperna som beskrivs under kontaktinformation.
    //- Förmåga att ta bort kontaktinformation för någon tillagd profil.
    //- Förmåga att uppdatera kontaktinformation för någon tillagd profil.
    //- Samma övriga rättigheter som en gästanvändare.
}
