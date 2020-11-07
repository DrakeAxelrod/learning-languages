package Ex1;

import java.util.Scanner;

public class CelsiusToFahrenheit {


    public static void main(String[] args) {
        //starts scanner
        Scanner input = new Scanner(System.in);

        //creating inputs

        System.out.print("Enter a degree in Celsius: ");
        float userCelsius = input.nextFloat();

        // scanner close
        input.close();

        System.out.print(userCelsius + " Celsius is " + ((9.0 / 5) * userCelsius + 32) + " Fahrenheit");


    }

}