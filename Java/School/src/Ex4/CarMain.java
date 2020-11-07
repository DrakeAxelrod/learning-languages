package Ex4;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 210.50);
        Car car2 = new Car("Ferrari", 550.00);

        System.out.println(car1.getName() + " costs " + car1.getDailyPrice() + " SEKs per day.");
        System.out.println(car2.getName() + " costs " + car2.getDailyPrice() + " SEKs per day.");

        int days = 5; // this indicates how many days you will rent the car.
        System.out.println(car1.getName() + " costs " + car1.calculateRent(days) + " SEKs for " + days + " days.");
    }
}
