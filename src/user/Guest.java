package src.user;

import src.workInterfaces.SearchingInPhonebook;

public class Guest extends User{

    public Guest() {
        super(TypAvUsers.GUEST);
    }

    // вход по умолчанию как Гость
    // методы : Förmåga att söka efter profiler givet beskrivningen av sökbarhet.
    //- Förmåga att avsluta programmet genom att skriva “quit” i konsolen.
}
