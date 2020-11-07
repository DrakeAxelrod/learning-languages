package Ex2.p1;
import javax.swing.*;
import java.util.Scanner;

public class TriangleLengthCalculate {

    public static void main(String[] args) {

        // Scanner start
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the known first angle of your triangle: ");
        int firstAngle = input.nextInt();
        System.out.print("Enter the known second angle of your triangle: ");
        int secondAngle = input.nextInt();
        // Requesting user inputs and evaluating whether they fall within 180 degrees
        if ((firstAngle + secondAngle) >= 180) {
            System.out.println("Wrong try again!");

        }
        else {
            int thirdAngle = (180 - (firstAngle + secondAngle));

            System.out.println("the third angle is: " + thirdAngle + " Yay!");

        }
        //scanner close
        input.close();
    }
}
