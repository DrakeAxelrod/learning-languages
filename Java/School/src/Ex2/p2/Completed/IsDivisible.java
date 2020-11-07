package Ex2.p2.Completed;

import java.util.*;

public class IsDivisible {

    /*
    lets say n is the first number u got
x and y is the number u r going to check if its dividable with n
then you need to check if n can dividable with x
later  if n can dividable with y
so if we think about this in java syntax
if(n % x == 0){//diviable} else {not dividable}
% operator give the the left over at the division
if the leftover is 0. you can divide those numbers

     */
    public static boolean isDivisible(int nDiv, int xDiv, int yDiv) {
        if (nDiv % xDiv == 0 && nDiv % yDiv == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int position(int nDiv, int xDiv, int yDiv) {
        if (nDiv % xDiv == 0 && nDiv % yDiv == 0) {
            return 0;
        } else if (nDiv % xDiv == 0 && yDiv != 0) {
            return 1;
        } else if (nDiv % xDiv != 0 && yDiv == 0) {
            return 2;
        } else {
            return 3;
        }
    }
    public static void main(String[] args) {
        // Scanner start
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("What Number do you want to test?: ");
        int nVar = input.nextInt();
        System.out.print("First number to divide with?: ");
        int xVar = input.nextInt();
        System.out.print("Second number to divide with?: ");
        int yVar = input.nextInt();
        input.nextLine();
        Integer[] uInp = {nVar, xVar, yVar};
        String uChoices = ("The Numbers (" + uInp[0] + "," + uInp[1] + "," + uInp[2] + ")");

        switch (position(nVar,xVar,yVar)){
            case 0:
                System.out.println(uChoices + " → " + "true because " + nVar + " is divisible by " + xVar + " and " + yVar);
                break;
            case 1:
                System.out.println(uChoices + " → " + "false because " + nVar + " is not divisible by " + yVar);
                break;
            case 2:
                System.out.println(uChoices + " → " + "false because " + nVar + " is not divisible by " + xVar);
                break;
            case 3:
                System.out.println(uChoices + " → " + "false because " + nVar + " is not divisible by " + xVar + " nor " + yVar);
        }
        // Scanner close
        input.close();
    }
}