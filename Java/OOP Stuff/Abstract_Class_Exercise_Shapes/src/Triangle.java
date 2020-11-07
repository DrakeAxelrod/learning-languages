public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB){
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public double calculateArea(){
        double area = (base * height) / 2;
        return area;
    }
    public double calculateCircumference(){
        double circumference = base + sideA + sideB;
        return circumference;
    }
}
