public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // Getters & Setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods

    public double calculateArea(){
    return width * height;
    }
    public double calculateCircumference(){
        return (2*width)+(2*height);
    }

}
