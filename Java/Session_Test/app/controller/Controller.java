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
        String[] options = {"option", "option", "Exit"};
        menu = new Menu("Main Menu", options);
        do 
        {
        String choice = menu.printMenu(menu);
        switch (choice)
        {
            case "1" -> exit();
            case "2" -> exit();
            case "3" -> exit();
        }
        } while (true);
    }
}
