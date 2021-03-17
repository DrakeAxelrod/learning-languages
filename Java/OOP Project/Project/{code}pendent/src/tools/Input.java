package tools;

import java.time.Year;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Input {
    public static final String EOL = System.lineSeparator();
    public static final String DIVIDER =  "\u001B[35m-----\u001B[0m";
    public static final int CURRENT_YEAR = Year.now().getValue();
    public static Scanner input = new Scanner(System.in);

    // already knew how to use the color swaps but we copied the constants from https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    private static Input instance = null; // Static so it can be access everywhere

    private Input() {
    } // private so you cant explicitly instantiate a new Input instance

    public static Input getInstance() {
        if (instance == null) { // check if null
            instance = new Input(); // Yes, make new instance
        }
        return instance; // No, return current instance
    }

    // Cleanup, save memory, etc
    public void tearDown() {
        instance = null;
        input.close();
    }

    public String getInput(String message) {
        String userInput = "";
        boolean complianceCheck = false;
        while (!complianceCheck) {
            try {
                System.out.print(message);
                userInput = input.nextLine();
                complianceCheck = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not really convention for this type of a question is it?");
                input.nextLine();
            }
        }
        return userInput;
    }

    public int getInt(String message){

        int userInput = 0;
        boolean complianceCheck = false;
        while (!complianceCheck) {
            try {
                System.out.print(message);
                userInput = input.nextInt();
                input.nextLine();
                complianceCheck = true;
            } catch (InputMismatchException e){
                System.out.println("That's not really in compliance with the type of values generally accepted here eh?");
                input.nextLine();
            }
        }
            return userInput;
    }

    public double getDouble(String message) {
        double userInput = 0.0;
        boolean complianceCheck = false;
        while (!complianceCheck) {
            try {
                System.out.print(message);
                userInput = input.nextDouble();
                input.nextLine();
                complianceCheck = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not really in compliance with the type of values generally accepted here eh?");
                input.nextLine();
            }
        }
        return userInput;
    }

    public void slowPrint(String message) {
        // Get message, convert to char array.
        char[] chars = message.toCharArray();

        // Print a char from the array, then sleep for milliseconds.
        for (int i = 0; i < chars.length; i++) {
               try {
                   TimeUnit.MILLISECONDS.sleep(10);
                   System.out.print(chars[i]);
                   TimeUnit.MILLISECONDS.sleep(10);
               } catch (InterruptedException e) {
                   // shouldn't happen but if it does you'll know it happened.
                   e.printStackTrace(); //shows you a similar error to compiler errors
               }
        }
    }

    public void userCheck() {
        String check = ">> Press \u001B[31m'Enter'\u001B[0m to continue: " + EOL;
        System.out.print(check);
        input.nextLine();
        input.reset();
    }
}

