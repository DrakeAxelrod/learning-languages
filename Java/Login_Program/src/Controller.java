public class Controller {
    private Menu menu;
    private Accounts accounts;

    public Controller(){
        this.accounts = Accounts.getInstance();
    }

    public void run(){
        loginMenu();
    }

    private void exit(){
        System.exit(0);
    }

    private void login(){
        if (accounts.authorization()){
            mainMenu();
        }
    }

    public void loginMenu(){
        String[] options = {"Create Account", "Login", "Exit"};
        menu = new Menu("Login", options);
        do {
            switch (menu.printMenu(menu)) {
                case "1" -> accounts.createUser();
                case "2" -> login();
                case "3" -> exit();
                default -> System.out.println("invalid input");
            }
        } while (true);
    }

    public void mainMenu(){
        String[] options = {"Option", "Option", "Option"};
        menu = new Menu("Main", options);
        do {
            switch (menu.printMenu(menu)) {
                case "1" -> exit();
                case "2" -> exit();
                case "3" -> exit();
                default -> System.out.println("invalid input");
            }
        } while (true);
    }
}
