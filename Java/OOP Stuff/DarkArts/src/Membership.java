// Dark Arts :D
public interface Membership {
    String membershipType();
    double discount(double userBill);
    boolean maxRentals(int rentals);
    int applyCredit(int credits);
}

class Silver implements Membership{
    private final double MEMBER_DISCOUNT = .10;
    private final int MAX_RENTALS = 3;
    private final int CREDIT = 1;

    public String membershipType() {
        return "Silver";
    }

    public double discount(double userBill) {
        return userBill - (userBill * MEMBER_DISCOUNT);
    }

    public boolean maxRentals(int rentals) {
        boolean canRent = false;
        if (rentals < MAX_RENTALS){
            canRent = true;
        }
        return canRent;
    }

    public int applyCredit(int credits) {
        int updateCredits = credits + CREDIT;
        if (updateCredits >= 5) {
            updateCredits = 5;
        }
        return updateCredits;
    }
}

class Gold implements Membership{
    private double memberDiscount = .15;
    private final int MAX_RENTALS = 5;
    private final int CREDIT = 2;

    public String membershipType() {
        return "Gold";
    }

    public double discount(double userBill) {
        return userBill - (userBill * memberDiscount);
    }

    public boolean maxRentals(int rentals) {
        boolean canRent = false;
        if (rentals < MAX_RENTALS){
            canRent = true;
        }
        return canRent;
    }

    public int applyCredit(int credits) {
        int updateCredits = credits + CREDIT;
        if (updateCredits >= 5){
            updateCredits = 5;
        }
        return updateCredits;
    }
}


class Platinum implements Membership{
    private final String TYPE = "Platinum";
    private final double MEMBER_DISCOUNT = .25;
    private final int MAX_RENTALS = 7;
    private final int CREDIT = 3;

    public String membershipType() {
        return "Platinum";
    }

    public double discount(double userBill) {
        return userBill - (userBill * MEMBER_DISCOUNT);
    }

    public boolean maxRentals(int rentals) {
        boolean canRent;
        if (rentals <= MAX_RENTALS){
            canRent = true;
        } else {
            canRent = false;
        }
        return canRent;
    }

    public int applyCredit(int credits) {
        int updateCredits = credits + CREDIT;
        if (updateCredits >= 5) {
            updateCredits = 5;
        }
        return updateCredits;
    }
}