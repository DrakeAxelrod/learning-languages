package people;

import exceptions.InvalidInputException;
import people.features.membership.Membership;
import people.features.Message;
import people.features.membership.Regular;
import tools.Input;
import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends Person {

    private Membership membership;
    private double spentMoney;
    private ArrayList<Message> inbox;
    private final Input input = Input.getInstance();
    private int credits;
    private int currentRentals;
    private String type;

    public Customer() {
    }

    public Customer(String id, String name) throws InvalidInputException {
        super(id, name);
        this.membership = new Regular();
        this.credits = 0;
        this.currentRentals = 0;
        this.spentMoney = 0;
        this.inbox = new ArrayList<>(Arrays.asList(
                new Message("Welcome!", "Welcome to your inbox to send a message or view your messages simply use the menu!" + Input.EOL, "Management", "DART")));
    }

    public void setMembership(Membership type) {
        this.membership = type;
    }

    public boolean canRent() {
        return this.membership.maxRentals(this.currentRentals);
    }

    public void applyCredits(){
        setCredit(this.membership.applyCredit(this.credits));
    }

    public double memberDiscount(double userBill){
        return this.membership.discount(userBill);
    }

    public String getMembershipType() {
        return this.membership.membershipType();
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredit(int newCredits){
        this.credits = newCredits;
    }

    public int getCurrentRentals() {
        return this.currentRentals;
    }

    public String getId() {
        return super.getId();
    }

    public String getName() {
        return super.getName();
    }

    public ArrayList<Message> getInbox() {
        return inbox;
    }

    public double getSpentMoney() {
        return Math.round(spentMoney*100.0)/100.0;
    }

    public void setSpentMoney(double transactionCost) {
        this.spentMoney =+ transactionCost;
    }

    public Membership getMembership() {
        return this.membership;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void checkMessages(Customer customer) {
        for (Message message : customer.getInbox()) {
            if (!message.getReadStatus()) {
                message.setReadStatus(true);
                System.out.print(Input.ANSI_RED + "Unread" + Input.ANSI_RESET);
            } else {
                System.out.print(Input.ANSI_CYAN + "Read" + Input.ANSI_RESET);
            }
            System.out.println(message.toString());
        }
    }

    public void incrementRentals(){
            currentRentals++;
        }

    public String toString () {
        String currentMembership;
        if (this.membership == null){
            currentMembership = "No Membership";
        }else{
            currentMembership = this.membership.membershipType();
        }
        return input.EOL + "Customer ID: " + super.getId() + input.EOL + "Name: " + this.getName() + input.EOL + currentMembership + input.EOL + "Credits: " + this.credits + input.EOL + "-----";
    }
}











