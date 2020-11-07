package Ex1;

import java.util.Scanner;

public class FinancialAppPayroll {
    public static void main(String[] args) {
        // Scanner start
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Number of hours worked in a week: ");
        int hoursWorked = input.nextInt();
        System.out.print("Hourly pay rate: ");
        Float hourlyPayRate = input.nextFloat();
        System.out.print("Federal tax withholding rate: ");
        float federalWithholdingRate = input.nextFloat();
        System.out.print("State tax withholding rate: ");
        float stateWithholdingRate = input.nextFloat();
        float federalWithholding = federalWithholdingRate;
        float grossPay = (hoursWorked * hourlyPayRate);
        float stateWithholding = stateWithholdingRate;
        float totalDeduction = (grossPay * stateWithholding) + (grossPay * federalWithholding);
        float netPlay = (grossPay - totalDeduction);
        // Output
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: " + "$" + hourlyPayRate);
        System.out.println("Gross Pay: " + "$" + grossPay);
        System.out.println("Deductions:");
        System.out.println("Federal Withholding" + "(" + (federalWithholding * 100) + "%): $" + (grossPay * federalWithholdingRate));
        System.out.println("State Withholding" + "(" + (stateWithholding * 100) + "%): $" + (grossPay * stateWithholdingRate));
        System.out.println("Total Deduction: " + "$" + totalDeduction);
        System.out.println("Net Pay: $" + (netPlay));


    }
}
