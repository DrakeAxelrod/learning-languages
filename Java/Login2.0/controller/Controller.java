package app.controller;

import app.tool.*;
import app.user.*;

public class Controller {
    private Tool tool = Tool.getInstance();
    private Account account = Account.getInstance();
    private Menu menu;

    public Controller(){}

    public void run()
    {
        loginMenu();
    }
    private void exit()
    {
        tool.teardown();
        account.teardown();
        System.exit(0);
    }

    private void login()
    {
        if (account.authorize())
        {
            mainMenu();
        }
        else
        {
            loginMenu();
        }
    }

    private void logout()
    {
        System.out.println("you have been logged out");
        loginMenu();
    }

    private void loginMenu() 
    {
        String[] options = {"Create Account", "Login", "Exit"};
        menu = new Menu("Login Menu", options);
        do 
        {
        String choice = menu.printMenu(menu);
        switch (choice)
        {
            case "1" -> account.createAccount();
            case "2" -> login();
            case "3" -> exit();
        }
        } while (true);
    }

    private void mainMenu() 
    {
        String[] options = {"option", "Delete account", "logout", "Exit"};
        menu = new Menu("Main Menu", options);
        do 
        {
        String choice = menu.printMenu(menu);
        switch (choice)
        {
            case "1" -> exit();
            case "2" -> accounts.
            case "3" -> logout();
            case "4" -> exit();
        }
        } while (true);
    }
}
