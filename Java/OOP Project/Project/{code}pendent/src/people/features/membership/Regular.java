package people.features.membership;

public class Regular implements Membership {
    private final int MAX_RENTALS = 1;
    private final int CREDIT = 0;

    public String membershipType() {
        return "Regular";
    }

    public double discount(double userBill) {
        return userBill;
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
