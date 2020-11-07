package Ex2.p2.InProgress;
import java.util.*;
public class AllFactors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Integer: ");
        int uInput = input.nextInt();
        input.nextLine();
        int n=1;
        int factor = 0;
        while (factor<uInput){
            factor = uInput / 2;
            System.out.println(factor);
        }

    }
}
/*
Write a program that reads an integer
and displays all its smallest factors
in increasing order. For example, if
the input integer is 120, the output
should be as follows: 2, 2, 2, 3, 5.
 */