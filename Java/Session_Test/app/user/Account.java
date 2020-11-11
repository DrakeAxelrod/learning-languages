package app.user;

import java.util.HashMap;

import app.tool.Tool;

public class Account 
{
    private HashMap<String, User> accounts;
    private Tool tool = Tool.getInstance();
    private static Account instance = null;

    private Account()
    {
        accounts = new HashMap<>();
    }

    public static Account getInstance()
    {
        if (instance == null)
        {
            return new Account();
        }
        else
        {
            return instance;
        }
    }

    public void teardown()
    {
        instance = null;
    }

    private String promptUsername()
    {
        return tool.getString("Username: ");
    }

    private String promptPassword()
    {
        return tool.getString("Password: ");
    }

    public void createAccount()
    { //add error handling
        String username = promptUsername();
        if (accounts.containsKey(username))
        {
            System.out.println("Username already exists");
        }
        else
        {
        String password = promptPassword();
        accounts.put(username, new User(username, password));
        }
    }

    private boolean authorizeUsername(String username)
    {
        if (accounts.containsKey(username))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean authorizePassword(String username, String password)
    {
        if (password.equals(accounts.get(username).getPassword()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean authorize()
    {
        boolean contains = false;
        String username = promptUsername();
        if (authorizeUsername(username))
        {
            String password = promptPassword();
            if (authorizePassword(username, password))
            {
                contains = true;
            }
            else
            {
                System.out.println("incorrect password");
            }
        }
        else
        {
            System.out.println("incorrect username");
        }
        return contains;
    }
}
