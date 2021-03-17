package people.features.membership;

public class Silver implements Membership {
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
        if (rentals <= MAX_RENTALS){
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
