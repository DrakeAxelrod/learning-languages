package Tools;

public class Controller {
    // private Input tools = Input.getInstance();
    private Encryption encoder = Encryption.getInstance();
    private Account accounts = Account.getInstance();

    public void run(){
        loginMenu();
    }
    public void exit(){
        System.exit(0);
    }

    private void loginMenu(){
        String[] options = { "Create account", "Login", "Exit" };
        Menu menu = new Menu("Login", options);
        do {
            String choice = menu.printMenu(menu);
            switch(choice){
                case "1" -> createUser();
                case "2" -> login();
                case "3" -> exit();
            }
        } while (true);
    }

    private void createUser(){
        accounts.registerUser();
    }

    private void login(){
        if (accounts.authenticate()){
            mainMenu();
        }
    }

    private void mainMenu(){
        String[] options = { "Encode Menu", "Decode Menu", "Exit" };
        Menu menu = new Menu("Main Menu", options);
        do {
            String choice = menu.printMenu(menu);
            switch(choice){
                case "1" -> encodeMenu();
                case "2" -> decodeMenu();
                case "3" -> exit();
            }
        } while (true);
    }
    private void encodeMenu(){
        String[] options = { "rot13", "Main Menu", "Exit" };
        Menu menu = new Menu("Encode Menu", options);
        do {
            String choice = menu.printMenu(menu);
            switch(choice){
                case "1" -> System.out.println(encoder.rot13("Super secret message to encode: "));
                case "2" -> mainMenu();
                case "3" -> exit();
            }
        } while (true);
    }

    private void decodeMenu(){
        String[] options = { "Decode rot13", "Main Menu", "Exit" };
        Menu menu = new Menu("Decode Menu", options);
        do {
            String choice = menu.printMenu(menu);
            switch(choice){
                case "1" -> System.out.println(encoder.rot13("Super secret message to decode: "));
                case "2" -> mainMenu();
                case "3" -> exit();
            }
        } while (true);
    }
}
