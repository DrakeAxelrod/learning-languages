package Tools;

import java.util.HashMap;

public class Account {
    private HashMap<String, String> accounts;
    private Input tools = Input.getInstance();
    private Encryption encryption = Encryption.getInstance();

    private Account() {
        this.accounts = new HashMap<>();
    }

    private static Account instance = null;

    public static Account getInstance() {
        if (instance == null) {
            return instance = new Account();
        } else {
            return instance;
        }
    }

    public String username() {
        return encryption.rot13("Username: ");
    }

    public String password() {
        return encryption.rot13("Password: ");
    }

    public void registerUser() {
        accounts.put(username(), password());
    }

    public void authenticate(){
        String username = username();
        String password = password();
    }

    public boolean authenticateUsername(String username) {
        boolean check = false;
        username = encryption.rot13(username);
        if (accounts.get(username)!= null) {
            check = true;
        }
        return check;
    }
    public boolean authenticatePassword(String password) {
        boolean check = false;
        password = encryption.rot13(password);
        for (String key : accounts.keySet()) {
            if (password.equals(key)) {
                check = true;
            }
        }
        return check;
    }
}

