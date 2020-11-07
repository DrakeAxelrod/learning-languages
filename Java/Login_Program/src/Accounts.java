import java.util.ArrayList;
import java.util.HashMap;

public class Accounts {
    private HashMap<String, String> accounts;
    private ArrayList<User> users;
    private static Accounts instance = null;
    private static Input tools = Input.getInstance();

    private Accounts(){
        this.accounts = new HashMap<>();
        this.users = new ArrayList<>();
    }

    public static Accounts getInstance(){
        if(instance == null){
            return instance = new Accounts();
        } else {
            return instance;
        }
    }

    private String getUsername(){
        return tools.getInput("Username: ");
    }
    private String getPassword(){
        return tools.getInput("Password: ");
    }
    public void createUser(){
        accounts.put(getUsername(), getPassword());
    }

    private boolean authUsername(String username) {
        boolean validation = false;
        for (String key : accounts.keySet()) {
            if (key.equals(username)) {
                validation = true;
            }
        }
        return validation;
    }
    private boolean authPassword(String username, String password){
        boolean validation = false;
        if (accounts.containsKey(username)){
            if (accounts.get(username).equals(password)){
                validation = true;
            }
        }
        return validation;
    }

    public boolean authorization(){
        boolean validation = false;
        String username = getUsername();
        if (authUsername(username)){
            String password = getPassword();
            if (authPassword(username, password)){
                System.out.println("Welcome " + username);
                validation = true;
            } else {
                System.out.println("** Wrong Password **");
            }
        } else {
            System.out.println("Username does not exist");
        }
        return validation;
    }
}
