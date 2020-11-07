import java.util.HashMap;

public class Account {
    private HashMap<String, String> accounts;
    private Tool tool = Tool.getInstance();

    public Account() {
        this.accounts = new HashMap<>();
    }

    public void registerAccount() {
        String username = retrieveUsername();
        String password = retrievePassword();
        accounts.put(username, password);
    }

    public void deleteAccount(){
        String username = retrieveUsername();
        if (authorize()){

        }
    }

    public boolean findAccount(String username) {
        boolean find = false;
        for (String key : accounts.keySet()) {
            if (username.equals(key)) {
                find = true;
            }
        }
        return find;
    }

    private String retrieveUsername(){
        return tool.input("Username: ");
    }

    private String retrievePassword(){
        return tool.input("Password: ");
    }

    private boolean authorizeUsername(){
        boolean check = false;
        String username = retrieveUsername();
        if (findAccount(username)){
            check = true;
        }
        return check;
    }

    private boolean authorizePassword(){
        boolean check = false;
        String username = retrieveUsername();
        String password = retrievePassword();
        if (password.equals(accounts.get(username))){
            check = true;
        }
        return check;
    }

    public boolean authorize(){
        boolean check = false;
        if (authorizeUsername()){
                if (authorizePassword()){
                    check = true;
            }
        }
        return check;
    }
}
