package Ex3.Finished;

import java.util.Scanner;

public class arrayCalculate {
    public static void main(String[] args) {
        int high = 0;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("array size? ");
        int n = s.nextInt();
        s.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter #" + (i + 1) + ": ");
            array[i] = s.nextInt();
            s.nextLine();
        }
        for (int j = 0; j < array.length; j++) {
            if (high < array[j]) {
                high = array[j];
            } else {
                high = high;
            }
        }
        for (int k = 0; k < array.length; k++) {
            int add = array[k];
            sum = sum + add;
        }
        int mean = sum / array.length;
        System.out.println("RESULTS"+"\nhigh #"+high+"\nsum is "+sum+"\nmean is "+mean);
    }
}


/*
 Write a program that asks the users the size of the array.
 After that, ask the user to type each number in the array.
 Your program should then (i) find the highest number in an array,
 (ii) calculate the sum of the elements in an array,
 and(iii) calculate the mean of the elements in an array.

 1. ask for input to denote size of array
 2. have the user enter elements to store in array
 3. find the highest number in the an array (method)
 4. calculate the sum of the elements in an array (method)
 5. calculate the mean of the elements in an array (method)
 */