package items.properties;

public class Rating {
    private double rating;
    private String feedback;

    public Rating(double rating) {
        this.rating = rating;
    }

    public Rating(double rating, String feedback) {
        this.rating = rating;
        this.feedback = feedback;
    }

    public double getRating() {
        return this.rating;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public String toString() {
        if (getRating() > 0 && getFeedback() != null) {
            return "Rating: " + getRating() + "\nFeedback: " + getFeedback();
        } else if (getRating() > 0 && getFeedback() == null) {
            return "Rating: " + getRating();
        }
        return null;
    }
}
