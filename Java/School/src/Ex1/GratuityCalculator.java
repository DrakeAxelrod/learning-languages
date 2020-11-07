package Ex1;

import java.util.Scanner;

public class GratuityCalculator {
    public static void main(String[] args) {
        // Scanner start
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Enter the subtotal: ");
        float subtotal = input.nextFloat();
        System.out.print("a gratuity rate: ");
        float gratuity = input.nextFloat( );
        float gratuityPercentage = subtotal * (gratuity / 100);
        System.out.println("The gratuity: " + "$" + gratuityPercentage);
        System.out.print("Total: " + "$" + (subtotal + gratuityPercentage));
        // Scanner close
        input.close();
}
}
