package src.user;

import src.Contact;

public interface WorkingWithPhonebook {

    default void updateContact(Contact profile) {
          /* if (isAdmin || profiles.contains(profile)) {
            // Implement profile update logic here
        } else {
            System.out.println("Permission denied. You need to be an admin or the profile owner to update.");
        }*/
    }

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
