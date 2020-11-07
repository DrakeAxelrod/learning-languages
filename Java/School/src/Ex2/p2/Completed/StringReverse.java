package Ex2.p2.Completed;
import java.sql.SQLOutput;
import java.util.*;
public class StringReverse {
    public static void main(String[] args){
        String uInput = "ABCD";
        // open scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        uInput = input.nextLine();
        // calling object StringBuffer and
        // using method reverse, and toString
        String result = new StringBuffer(uInput).reverse().toString();
        System.out.println("The reversed sting is " + result);
        //scanner close
        input.close();
    }
}



/*
Write a program that prompts the user to enter a string
and displays the string in reverse order.
Sample run:

Enter a string: ABCD
The reversed string is DCBA
*/

