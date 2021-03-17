package people;

import exceptions.InvalidInputException;
import tools.Input;

import java.time.LocalDate;

public class Employee extends Person {

    private int birthYear;
    private String address;
    private double grossSalary;

    public static final int MONTHS = 12;
    private final double MIN_SALARY = 100000.00;
    private final double BONUS_LOW = 4000.00;
    private final double BONUS_MEDIUM = 6000.00;
    private final double BONUS_HIGH = 7500.00;
    private final int FIRST_AGE_FOR_BONUS = 22;
    private final int SECOND_AGE_FOR_BONUS = 30;
    private final double TAX_DEDUCTION = .7;
    private Input input = Input.getInstance();

    public Employee() {
    }

    public Employee(String id, String name, int birthYear, String address, double salary) throws InvalidInputException {
        super(id, name);
        if (birthYear < 1920 || birthYear > LocalDate.now().getYear()){
            throw new InvalidInputException("Birth year must be between 1920 - "+ LocalDate.now().getYear());
        }
        if (salary < 0 || salary > 1000000){
            throw new InvalidInputException("Salary cannot be a negative number or greater then 100,000kr");
        }
        this.birthYear = birthYear;
        this.grossSalary = salary;
        this.address = address;
    }

    public double calculateSalary() {
        int age = Input.CURRENT_YEAR - birthYear;
        double netSalary = 0;
        if (grossSalary < MIN_SALARY) {
            netSalary = grossSalary;

        } else {
            if (grossSalary >= MIN_SALARY) {
                netSalary = grossSalary * TAX_DEDUCTION;
            }
        }
        double bonus;
        if (age < FIRST_AGE_FOR_BONUS) {
            bonus = BONUS_LOW;
            netSalary = netSalary + bonus;
        } else if (age == FIRST_AGE_FOR_BONUS && age < SECOND_AGE_FOR_BONUS) {
            bonus = BONUS_MEDIUM;
            netSalary = netSalary + bonus;
        } else if (age > SECOND_AGE_FOR_BONUS) {
            bonus = BONUS_HIGH;
            netSalary = netSalary + bonus;
        }

        netSalary = netSalary / MONTHS;
        netSalary = (double) Math.round(netSalary*100)/100;
        return netSalary;
    }

    public double getSalary() {
        return calculateSalary();
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "ID: " + this.getId() + input.EOL + "Name: " + this.getName() + input.EOL + "Birth year: " + this.getBirthYear()
                + input.EOL + "Address: " + this.getAddress() + input.EOL + "Salary: " + this.calculateSalary()+ input.EOL+input.DIVIDER;
    }
}


