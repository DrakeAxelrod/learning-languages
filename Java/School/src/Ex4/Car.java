package Ex4;

public class Car {

    private String name;
    private double dailyPrice;

    // Constructor
    public Car(String str, double n){
        this.name = str;
        this.dailyPrice = n;
    }
    
    // Getters
    public String getName(){
        return name; 
    }
    
    public double getDailyPrice(){
        return dailyPrice;
    }

    public double calculateRent (int days){
        return dailyPrice * days;
    }
    
}
