package week02.day007;

public class Circle extends Shape{
    // Properties
    //===========
    private double radius;
    private static final int SHAPESIDES = 0;

    // Constructor
    //============

    public Circle() {
        super();
    }

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;

    }

    // Functions
    //==========


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double calculateCircleArea(){
        return Math.PI * radius * radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
