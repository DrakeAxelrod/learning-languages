package PreviousExams.CalcMean;

import PreviousExams.Tools;

public class Main {
    CalculatingMean Calc = new CalculatingMean();
    public static void main(String[] args) {
        int arrSize = Tools.intInput("array size? ");
        double[] arr = new double[arrSize];

        for (int i = 0; i < arr.length; i++){
            double eleInput = Tools.intInput("enter element "+ i +": ");
            arr[i] = eleInput;
        }
        System.out.println(CalculatingMean.calcMean(arr));
    }
}
