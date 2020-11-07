package Ex2.p1;

import java.util.Scanner;

public class MakeNegative {
    public static void main(String[] args){
        // Scanner start
        Scanner input = new Scanner(System.in);
        // User Input
        System.out.print("Hey give me a number! I'll make it a negative: ");
        int userInputInt = input.nextInt();
        String testInput = input.nextLine();
        // if statement to define if the users input is positive or negative
        if (userInputInt >0) {
            System.out.println("The negative of your number is: " + userInputInt * -1);
        }
        else
        System.out.println("Hey!!! that's a negative your number is the same!: " + userInputInt);
        // scanner close
        input.close();

    }

}
