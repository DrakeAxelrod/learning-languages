package people.features.membership;

public class Gold implements Membership{
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
        if (rentals <= MAX_RENTALS){
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
