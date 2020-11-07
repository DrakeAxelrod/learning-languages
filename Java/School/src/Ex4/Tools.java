package Ex4;
import java.util.Scanner;
public class Tools{
    // Universal Scanner
    public static final Scanner scanner = new Scanner(System.in);

    // Constructor
    public Tools(){
    }

    // End User string input
    public static String strInput(String str){
        System.out.print(str);
        String userInput = scanner.nextLine();
        return userInput;
    }
    // End User int input
    public static double intInput(String str){
        System.out.print(str);
        double userInput = scanner.nextDouble();
        scanner.nextLine();
        return userInput;
    }
    
}
