package Ex1;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        // Scanner start
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        String firstLetter = userString.substring(0,1);
        // Print first character
        System.out.println("The first letter of your string is: " + firstLetter);
        // counts the letters in string
        int totalLength = userString.length();
        System.out.println("The number of characters in your string is: " + totalLength);
        // Scanner close
        input.close();
    }
}