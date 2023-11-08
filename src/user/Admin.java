package src.user;

public class Admin extends User{
    public Admin() {
        super(TypAvUsers.ADMIN);
    }
    public static boolean authenticateAdmin(String username, String password) {
        return username.equalsIgnoreCase("admin") && (password.equalsIgnoreCase("admin"));
    }
}
