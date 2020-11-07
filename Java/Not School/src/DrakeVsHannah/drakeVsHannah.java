package DrakeVsHannah;

import java.util.Scanner;

public class drakeVsHannah {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Drake's level of coding experience in years? ");
        int drakeExp = input.nextInt();
        input.nextLine();
        System.out.print("Hannah’s level of coding experience in years? ");
        int hannahExp = input.nextInt();
       // this next line might not be necessary
        input.nextLine();



        if (drakeExp >= hannahExp) {

            System.out.println("Drake is ready for a battle with Hannah!");

        } else {
            System.out.println("Drake sadly not experienced enough for a battle with Hannah... :(");


        }
    }
}