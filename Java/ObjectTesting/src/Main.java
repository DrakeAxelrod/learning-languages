import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String addEmployee = "N";
        while (addEmployee.equals("Y")) {
            System.out.print("add employee[Y/N] ");
            addEmployee = input.nextLine();
            addEmployee = addEmployee.toUpperCase();
            System.out.print("employee name: ");
            String name = input.nextLine();
            System.out.print("birth year: ");
            int birthYear = input.nextInt();
            input.nextLine();
            System.out.print("salary: ");
            int salary = input.nextInt();
            input.nextLine();

            Employee[] obj = new Employee[2];
            obj[0] = new Employee(name, salary, birthYear);

            obj[0].showEmployee();
            obj[1].showEmployee();
        }
    }
}
