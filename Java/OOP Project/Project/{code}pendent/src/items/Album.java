package items;

import exceptions.InvalidInputException;
import tools.Input;
import java.time.LocalDate;

public class Album extends Inventory {
    private String artist;
    private final Input input = Input.getInstance();

    public Album(String title, String artist, int year, double dailyRent, boolean rentStatus, LocalDate date) throws InvalidInputException {
        super(title, dailyRent, year, rentStatus, date);
        this.artist = artist;
    }

    public Album(String title, String artist, int year, double dailyRent) throws InvalidInputException {
        super(title, dailyRent, year);
        this.artist = artist;
    }

    public Album() {
        super();
    }

    public String getID() {
        return super.getId();
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return super.getYear();
    }

    public double getRating() {
        return super.getRating();
    }

    public double getDailyRent() {
        return super.getDailyRent();
    }

    public LocalDate getRentedDate() {
        return super.getRentedDate();
    }

    public void setRentedDate(LocalDate rentedDate) {
        super.setRentedDate(rentedDate);
    }

    public String getRentStatus() {
        if (super.isRentStatus()) {
            return "\033[31mRented\033[0m";
        }
        return "Available";
    }

    public void setRentStatus(boolean rentStatus) {
        super.setRentStatus(rentStatus);
    }

    @Override
    public String toString() {
        return Input.DIVIDER + input.EOL + "ID: " + this.getID() + input.EOL + "Album: " + this.getTitle()
                + Input.EOL + "Artist: " + this.getArtist() + ". " + input.EOL + "Released year: " +
                this.getYear() + ". " + Input.EOL + "Daily Price: " + this.getDailyRent() + " SEK."
                + input.EOL + "Status: " + this.getRentStatus() + Input.EOL + "Rating: " + this.getRating();
    }

}
