import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static final Scanner s = new Scanner(System.in);
    private String title;
    private String[] options;
    private Shape shape;
    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    ArrayList<Shape> catalogue = new ArrayList<>();

    public Controller(String title, String[] options){
        this.title = title;
        this.options = options;
    }

    public void mainMenu(){
        String[] menuOptions = {" 1) Register a shape", " 2) Calculate the area of all shapes",
                                " 3) Calculate the circumference of all shapes",
                                " 4) Shape with highest area", " 5) Shape with highest circumference"};
        Controller menu = new Controller("Main Menu", menuOptions);
        do{
            System.out.println("Choose an option: ");
            String choice = s.nextLine();
            switch(choice){
                case "1":
                    registerShape();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    break;
            }
        } while (true);

    }
    public void registerShape(){
        String[] menuOptions = {" 1) Circle", " 2) Square", " 3) Triangle", " 4) Rectangle", "Main Menu"};
        Controller menu = new Controller("Register Shape", menuOptions);
        do{
            System.out.println("Choose an option: ");
            String choice = s.nextLine();
            switch(choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    mainMenu();
                    break;
                default:
                    break;
            }
        } while (true);

    }

}
