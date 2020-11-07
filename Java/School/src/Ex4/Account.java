package Ex4;

public class Account {
    private String name;
    private double balance;

    public Account(Account bankAccount){

    }


    public Account (String name, double balance){

    }
    
    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double n){
       double deposit = balance + n;
        return deposit;
    }

    public double withdraw(double n){
        double withdraw = balance - n;
        return withdraw;
    }
    public String toString(){
        return "(" + name + ", " + balance + ")";
    }
}
