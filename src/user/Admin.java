package src.user;

public class Admin extends User{
    public Admin() {
        super(TypAvUsers.ADMIN);
    }
    public static boolean authenticateAdmin(String username, String password) {
        return username.toLowerCase().equals("admin") && (password.toLowerCase().equals("admin"));
    }
}
