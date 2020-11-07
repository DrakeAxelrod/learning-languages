package Ex2.p2.Completed;

import java.util.*;

public class CheckISBN {
    public static void main(String[] args) {
        int checkSum = 0;
        int[] ISBN = new int[9];
        Scanner input = new Scanner(System.in);
        for (int i = 0;i < ISBN.length; i++) {
            System.out.print("Enter d"+ (i+1) +": ");
            ISBN[i] = input.nextInt();
            input.nextLine();
        }
        for (int j = 0; j < ISBN.length; j++){
            checkSum = checkSum + ISBN[j]*(j+1);
        }
        checkSum = checkSum % 11;
//        checkSum =((ISBN[0]*1)+(ISBN[1]*2)+(ISBN[2]*3)+(ISBN[3]*4)+(ISBN[4]*6)+(ISBN[5]*6)+(ISBN[6]*7)+(ISBN[7]*8)+(ISBN[8]*9)) %11;
        if (checkSum == 10){
            for (int k: ISBN) {
                System.out.print(k);
                System.out.print("");
            }
            System.out.print("X");
        } else {
            for (int k: ISBN) {
                System.out.print(k);
                System.out.print("");
            }
            System.out.print(checkSum);
        }
        //Scanner close
        input.close();
    }

}
/*
An ISBN-10 (International Standard Book Number) consists of 10 digits:
 d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:

(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.

Write a program that prompts the user to enter the
first 9 digits and displays the 10-digit ISBN (including leading zeros).
Your program should read the input as an integer.


Here are 2 sample runs:

Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671

Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X


 */
