package Ex1;

import java.util.Scanner;

public class TemperatureConverter {

    // Scanner start
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Please denote with a K, F, or C which temperature you would like to be converted: ");
    String userTemp = input.nextLine();
    userTemp = userTemp.toUpperCase();


    if (userTemp.equals("K") ){
  
    }
    else if (userTemp.equals("F")) {
    
    }
    else if (userTemp.equals("C")) {
    
    }
    else {

    }
        

    //scanner close
        input.close();
    }
}

/* 
                Level 3 - An advanced challenge
1. For a Challenge, modify your program to allow users to convert 
between any temperature by: 1. Providing a temperature scale (F, K or C); 
2. Providing a temperature value; and 3. Provide the target scale.
*/