package people.features.membership;

public class Platinum implements Membership {
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
