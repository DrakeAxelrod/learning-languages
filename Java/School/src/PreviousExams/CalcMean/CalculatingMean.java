package PreviousExams.CalcMean;

public class CalculatingMean {

    public static double calcMean(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double mean = sum / arr.length;
      return mean;
    }

}

/*
Task 1: Calculating the Mean
Your task is to write a program that calculates the Arithmetic Mean
(average of all numbers) of a given array of a fixed size
(Hint: You might have to cast the answer to a double):

Example:
Your input to the function: [12,5,8,10,19]
Output: The Mean is 10.8

Note: Here, you do not need to read from user input.
Create the Array as a variable in your code (hardcoded).
For a VG, implement this task but considering the user typing the array.
Hint: Assume the user will type all integer numbers separated by comma (,).
Then you can use the String split(separator) and Integer.parserInt(String).


 */
