import java.sql.SQLOutput;

public class Employee {

String name;
double salary;
int age;
int birthYear;

public Employee(String name, double salary, int birthYear){
    this.name = name;
    this.salary = salary;
    this.birthYear = birthYear;

}
public void showEmployee(){
    System.out.print("(" + name + " ");
    System.out.print(salary + " ");
    System.out.print(birthYear +")");
}

public int getAge(){
    int currentYear = 2020;
    age = currentYear - birthYear;
    return age;
}

}
