public class Controller {
    private Menu menu;
    private Tool tool = Tool.getInstance();
    private User user;
    private Account account;

    public Controller(){
    }

    private void exit(){
        System.exit(0);
    }

    public void run(){
        loginMenu();
    }

    private void mainMenu(){
        String[] options = {"Option", "Option", "Option", "Option"};
        menu = new Menu("Main Menu", options);
        String choice = menu.printMenu(menu);
        switch (choice){
//            case "1" ->
//            case "2" ->
//            case "3" ->
            case "4" -> exit();

        }
    }

    private void loginMenu(){
        String[] options = {"Create Account", "Login", "Exit"};
        menu = new Menu("Login", options);
        String choice = menu.printMenu(menu);
        do {
            switch (choice) {
                case "1" -> registerAccount();
                case "2" -> login();
                case "3" -> exit();

            }
        } while (true);
    }

    public void registerAccount(){
        account.registerAccount();
    }

    private void login(){
        account.authorize();
    }
}
