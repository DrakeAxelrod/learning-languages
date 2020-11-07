package Ex2.p2.Completed;
import java.util.*;
public class AverageCheck {
    public static void main(String[] args) {
        int userNum = 1;
        int neg = 0;
        int pos = 0;
        int total = 0;
        int nums =0;
        //Scanner Open
        Scanner input = new Scanner(System.in);
        while (userNum != 0) {
            System.out.print("Enter an integer, the input ends if it is 0: ");
            userNum = input.nextInt();
            input.nextLine();
            if (userNum > 0) {
                pos++;
            } else {
                pos = pos;
            }

            if (userNum < 0) {
                neg++;
            } else {
                neg = neg;
            }

            if (userNum != 0) {
                total = total + userNum;
            } else {
                total = total;
            }

            if (userNum != 0) {
                nums++;
            } else {
                nums = nums;
            }
        }
            System.out.println("The number of positives is " + pos + "\n" +
                                "The number of negatives is " + neg + "\n" +
                                "The total is " + total + "\n" +
                                "The average is " + (total / nums));
            input.close();
    }
}
/*
get user inputs
store user inputs
check for positive integers
store result
check for negative integers
store result
calculate total
store result
calculate average
 */





/*
Write a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a real number.

Here is a sample run:
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25

*/

