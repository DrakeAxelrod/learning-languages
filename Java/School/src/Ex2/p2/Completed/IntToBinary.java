package Ex2.p2.Completed;
import java.util.*;
public class IntToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = -1;
        while (userNum < 0) {
            System.out.print("enter a positive integer: ");
            userNum = input.nextInt();
            input.nextLine();
        }
        System.out.print("the binary representation of is ");
        while (userNum > 0){
            int remain = userNum % 2;  //gives you remainder
            userNum = userNum / 2;    // divides your number by 2
            String binary = remain + "";
            System.out.print(binary);
        }
    }
}
/*
Write a program that asks for a positive integer
until the uses enters one, and calculates the
binary representation of that integer. Hint:
Use the modulo operator %

Sample:
Enter a positive integer: -3
Enter a positive integer: -88
Enter a positive integer: 8
The binary representation of 8 is 1000
 */