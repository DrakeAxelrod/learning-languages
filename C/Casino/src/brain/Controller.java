package brain;

import front_end.*;

public class Controller 
{
    private static Controller instance = null;
    private Input input = Input.getInstance();

    private Controller(){}
    
    public static Controller getInstance() 
    {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private void teardown()
    {
        Input.close();
        instance = null;
    }

    public void run()
    {
        loginMenu();
    }

    private void exit()
    {
        teardown();
        System.exit(0);
    }

    private void loginMenu()
    {
        while (true)
        {
            Menus.loginMenu();
            int i = input.getInt("> ");
            switch(i)
            {
                case 1 -> login();
                case 2 -> register();
                case 3 -> exit();
            }
        }
    }

    private boolean auth()
    {
        return true;
    }

    private void login()
    {
        if (auth())
            loginMenu();
    }

    private boolean register()
    {
        return false;
    }
}
