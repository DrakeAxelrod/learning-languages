package Ex2.p1;

import java.util.*;


public class CalculateRide {
    private static String indent(String i) {
        return(i.replaceAll("(?m)^", "\t"));
    }
    public static void main(String[] args) {
        // Variables
        Double price = 0.0;
        String memberType = "1.) Platinum\n" +
                            "2.) Gold\n" +
                            "3.) Silver\n" +
                            "4.) None \n";

        // Scanner start
        Scanner input = new Scanner(System.in);
        System.out.print("Distance(KM): ");
        Double km = input.nextDouble();
        input.nextLine();
        System.out.print("Charging done? (Y/N): ");
        String charge = input.nextLine();
        System.out.print(indent(memberType) + "Membership type?: ");
        int membership = input.nextInt();
        if (0 < km && km < 5) {
           price = (km * 20);
        } else if (km >= 5 && km <= 15) {
            price = (km * 15);
        } else {
            price = (km * 8);
        }

        if ((charge.equalsIgnoreCase("Y"))) {
            price = price * 0.75;
        }

        if (membership == 1) {
            price = price * 0.65;
        } else if (membership == 2) {
            price = price * 0.8;
        } else if (membership == 3) {
            price = price * 0.9;
        } else {
            price = price;
        }
        System.out.println("Cost of your ride: " + price + " SEK");
        input.close();

    }
}
/*
Think of the Voi scooters available around you,
which provide fun rides at reasonable prices.
You have to calculate the fare of one ride given 3 parameters:
Distance travelled in kilometers, charging done or not,
and membership type. For distance, the calculation goes like this:

Distance
<5 Km – 20 Sek per Km
5 Km -15 Km – 15 Sek per Km
>15 Km – 8 Sek per Km

Charging done
False → No discount
True → Fare = Fare – 25% Fare

	Membership
None – Fare
Silver – 90% Fare
Gold –  80% Fare
Platinum – 65 % Fare
 */
