package Ex2.p2.Completed;

import java.lang.invoke.SwitchPoint;
import java.util.*;


public class RandomMonth {
    public static void main(String[] args){
        Random rn = new Random();
        int rNumber = rn.nextInt((13-1)+1);

        switch (rNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("November");
                break;
            case 10:
                System.out.print("September");
                break;
            case 11:
                System.out.print("October");
                break;
            case 12:
                System.out.print("December");
                break;

        }
    }
}
