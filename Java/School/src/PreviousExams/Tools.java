package PreviousExams;

import java.util.Scanner;

public class Tools {

    public static final Scanner input = new Scanner(System.in);

    public static int intInput(String str){
        System.out.print(str);
        int i = input.nextInt();
        input.nextLine();
        return i;
    }
    public static String strInput(String str){
        System.out.print(str);
        String i = input.nextLine();
        return i;
    }
}
