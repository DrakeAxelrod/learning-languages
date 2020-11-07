package Ex1;

import java.util.Scanner;

public class TemperatureConverterTwo {

    // Scanner start
    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        System.out.print("Please denote with a K, F, or C which temperature you would like to be converted: ");
        String userTemp = input.nextLine();
        userTemp = userTemp.toUpperCase();

        final String[] tempScale = { "F", "K", "C" };
    System.out.println(tempScale[0]);





    // Scanner close
    input.close();
    }








    /* 
    if (userTemp.equals("K") ){
  
    }
    else if (userTemp.equals("F")) {
    
    }
    else if (userTemp.equals("C")) {
    
    }
    else {

    } 
    */
}