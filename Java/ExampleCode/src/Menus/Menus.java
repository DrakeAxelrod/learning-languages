package Menus;
import java.util.Scanner;

public class Menus {
    public static final Scanner input = new Scanner(System.in);
    private String title;
    private String[] options;
    private String prompt;


    public Menus(String title, String[] options, String prompt){
        this.title = title;
        this.options = options;
        this.prompt = prompt;
    }

    private static void exit(){
        System.out.println("-----------------\n    Good Bye!\n-----------------");
        System.exit(0);
    }
    public static void mainMenu(){
        String[] options = {" 1) Manager Menu", " 2) Employee Menu", " 3) Customer Menu", " 4) Exit System"};
        Menus menu = new Menus("Welcome to DART, your good old game rental system. \nThe competition has no steam to keep up!\n\n----Main-Menu----",
                options, "-----------------\nChoose your option: ");
        System.out.println(menu.title);
        for (int i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
        System.out.print(menu.prompt);
        do {
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    managerMenu();
                    break;
                case "2":
                    employeeMenu();
                    break;
                case "3":
                    customerMenu();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("-----------------\n- Invalid input -");
                    System.out.print(menu.prompt);
                    break;
            }
        } while (true);
    }
    public static void managerMenu(){
        String[] options = {" 1) Register Employee", " 2) Remove Employee", " 3) View Employees", " 4) Return to Main Menu"};
        Menus menu = new Menus("--Manager-Menu--", options, "------------------\nChoose your option: ");
        System.out.println(menu.title);
        for (int i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
        System.out.print(menu.prompt);
        do {
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    mainMenu();
                    break;
                default:
                    System.out.println("-----------------\n- Invalid input -");
                    System.out.print(menu.prompt);
                    break;
            }
        } while (true);
    }
    public static void employeeMenu(){
        String[] options = {" 1) Register Game", " 2) Remove Game", " 3) View Games", " 4) Register Album",
                " 5) Remove Albums", " 6) View Albums", " 7) Register Customer", " 8) Remove Customer",
                " 9) View Customers", " 10) Total Rent Profit", " 11) Return to Main Menu"};
        Menus menu = new Menus("---Employee-Menu---", options, "------------------\nChoose your option: ");
        System.out.println(menu.title);
        for (int i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
        System.out.print(menu.prompt);
        do {
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;
                case "11":
                    mainMenu();
                    break;
                default:
                    System.out.println("-----------------\n- Invalid input -");
                    System.out.print(menu.prompt);
                    break;
            }
        } while (true);
    }
    public static void customerMenu(){
        String[] options = {" 1) Rent a Game", " 2) Return a Game", " 3) Rent Album", " 4) Return Album"," 5) Messages", " 6) Return to Main Menu"};
        Menus menu = new Menus("--Customer-Menu--", options, "-----------------\nChoose your option: ");
        System.out.println(menu.title);
        for (int i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
        System.out.print(menu.prompt);
        do {
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    mainMenu();
                    break;
                default:
                    System.out.println("-----------------\n- Invalid input -");
                    System.out.print(menu.prompt);
                    break;
            }
        } while (true);
    }
}
