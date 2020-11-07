public abstract class Shape {

    // Default constructor

    // no getters and setters needed

    public abstract double calculateArea();
    public abstract double calculateCircumference();

    // ToString
    public String toString() {
        return "Area: "+ this.calculateArea() + " - Circumference: " + this.calculateCircumference();
    }

}
