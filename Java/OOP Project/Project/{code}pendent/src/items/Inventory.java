package items;

import exceptions.InvalidInputException;
import items.properties.Rating;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public abstract class Inventory {
    private String id;
    private String title;
    private int year;
    private double dailyRent;
    private LocalDate rentedDate;
    private boolean rentStatus;
    private int rentalFrequency;
    private ArrayList<Rating> ratings;


    public Inventory(String title, double dailyRent, int year, boolean rentStatus, LocalDate date) throws InvalidInputException {
        this.id = UUID.randomUUID().toString();
        if (title.isBlank() || title.isEmpty()) {
            throw new InvalidInputException("Title cannot be empty.");
        } else {
            this.title = title;
        }
        this.dailyRent = dailyRent;
        if ( year < 1940 || year > LocalDate.now().getYear()) {
            throw new InvalidInputException("The year is invalid.");
        } else this.year = year;
        this.rentStatus = rentStatus;
        this.rentedDate = date;
        this.rentalFrequency = 0;
        this.ratings = new ArrayList<>();
    }

    public Inventory(String title, double dailyRent, int year) throws InvalidInputException{
        this.id = UUID.randomUUID().toString();
        if (title.isBlank() || title.isEmpty()) {
            throw new InvalidInputException("Title cannot be empty.");
        } else {
            this.title = title;
        }
        this.dailyRent = dailyRent;
        if (year < 1940 || year > LocalDate.now().getYear()) {
            throw new InvalidInputException("The year is invalid.");
        } else this.year = year;
        this.dailyRent = dailyRent;
        this.rentStatus = false;
        this.rentedDate = null;
        this.rentalFrequency = 0;
        this.ratings = new ArrayList<>();
    }


    public Inventory(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(LocalDate rentedDate) {
        this.rentedDate = rentedDate;
    }

    public boolean isRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(boolean rentStatus) {
        this.rentStatus = rentStatus;
    }

    public ArrayList<Rating> getRatingSet() {
        return ratings;
    }

    public int getRentalFrequency() {
        return rentalFrequency;
    }

    public double getRating() {
        if (ratings.size() != 0) {
            double sum = 0;
            for (Rating rating : ratings) {
                sum = sum + rating.getRating();
            }
            return Math.round((sum / ratings.size()) * 100) / 100;
        }
        return 0;
    }
}
