public class Customer {
    private String name;
    private Membership membership;
    private int credits;
    private int currentRentals;
    private double rentAmount;

    public Customer(){
        this.name = "Drake";
        this.credits = 0;
        this.currentRentals = 4;
        this.rentAmount = 100.45;

    }

    public String whatIsMyMembership(){
        return membership.membershipType();
    }

    public void setMembership(Membership type){
        this.membership = type;
    }

    public void applyCredits(){
        this.credits = this.membership.applyCredit(this.credits);
    }

    public int myCredits(){
       return this.credits;
    }
    public int myRentals(){
        return this.currentRentals;
    }
    public boolean canRent(){
        return this.membership.maxRentals(this.currentRentals);
    }
    public double calculateBill(){
        return this.membership.discount(this.rentAmount);
    }

    public String toString(){
        return "My Credits: " + this.credits +" My Rentals: " + this.currentRentals+" My Bill: " + this.rentAmount +" My Type: " + this.membership.membershipType();
    }

}
