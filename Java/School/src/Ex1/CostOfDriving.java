package Ex1;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        // Scanner start
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Enter the driving distance: ");
        float drivingDistance = input.nextFloat();
        System.out.print("Enter miles per gallon: ");
        float milesPerGallon = input.nextFloat();
        System.out.print("Enter price per gallon: ");
        float pricePerGallon = input.nextFloat();
        // Scanner close
        input.close();
        // Output
        System.out.print("The cost of driving is $" + (drivingDistance/milesPerGallon)*pricePerGallon);

    }
}