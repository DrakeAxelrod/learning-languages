package Ex1;

import java.util.Scanner;

public class SumOfIntegerDigits {
    public static void main(String[] args) {
        // Scanner start
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        // User input
        int usersNumber = input.nextInt();
        // Calculations of inputs
        int thirdNumber = (usersNumber % 10);
        int secondNumber = ((usersNumber / 10) % 10);
        int firstNumber = ((usersNumber / 100) % 10);
        // Sum of digits
        System.out.print("The sum of the digits is " + (firstNumber + secondNumber + thirdNumber));
        // Scanner Close
        input.close();
    }
}