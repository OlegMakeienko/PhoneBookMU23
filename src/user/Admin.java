package src.user;

public abstract class Admin{

    private Admin() {
    }

    public static boolean authenticateAdmin(String username, String password) {
        return username.equalsIgnoreCase("admin") && (password.equalsIgnoreCase("admin"));
    }
}
