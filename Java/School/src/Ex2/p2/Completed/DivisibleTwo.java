package Ex2.p2.Completed;

import java.util.*;

public class DivisibleTwo {
    public static void main(String[] args){
        //Start scanner
        Scanner input = new Scanner(System.in);
        System.out.print("num: ");
        int userNum = input.nextInt();
        String result;
        input.close();
        if ((userNum % 5 == 1 && userNum % 6 == 1) || userNum < 5) {
            System.out.println("Is " +userNum + " divisible by 5 and 6? false");
            System.out.println("Is "+userNum+" divisible by 5 or 6? false");
            System.out.println("Is "+userNum+" divisible by 5 or 6, but not both? false");
        } else if (userNum % 5 == 0 && userNum % 6 == 0) {
            System.out.println("Is " +userNum + " divisible by 5 and 6? true");
            System.out.println("Is "+userNum+" divisible by 5 or 6? true");
            System.out.println("Is "+userNum+" divisible by 5 or 6, but not both? false");
        } else if (userNum % 5 == 0 ^ userNum % 6 == 0) {
            System.out.println("Is " +userNum + " divisible by 5 and 6? false");
            System.out.println("Is "+userNum+" divisible by 5 or 6? true");
            System.out.println("Is "+userNum+" divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + userNum + " divisible by 5 and 6? false");
            System.out.println("Is "+userNum+" divisible by 5 or 6? true");
            System.out.println("Is "+userNum+" divisible by 5 or 6, but not both? true");
        }
        //scanner stop
        input.close();
    }
}
/*
Write a program that prompts the user to
enter an integer and determines whether
it is divisible by 5 and 6, whether it is
divisible by 5 or 6, and whether it is
divisible by 5 or 6, but not both.

example:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
 */