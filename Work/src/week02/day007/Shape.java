package week02.day007;

public class Shape {
    // Properties
    //===========
    private String shapeName;
    private int shapeSides;
    private int sideLength;

     // Constructor
    //============

    public Shape(){
        super();
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public Shape(String shapeName, int shapeSides, int sideLength) {
        super();
        this.shapeName = shapeName;
        this.shapeSides = shapeSides;
        this.sideLength = sideLength;

    }

    public Shape(String shapeName, int sideLength) {
        super();
        this.shapeName = shapeName;
        this.sideLength = sideLength;

    }


    // Functions
    //==========

    //Overrides


    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                ", shapeSides=" + shapeSides +
                ", sideLength=" + sideLength +
                '}';
    }

    //Class Functionality
    public double calculateShapeParameter() {
        return this.shapeSides * this.sideLength;
    }





    //Getters and Setters
    public int getShapeSides(){
        return this.shapeSides;
    }

    public String setShapeSides(int numberSides){
        this.shapeSides = numberSides;
        return this.shapeName + "'s sides has been changed to " + numberSides;
    }

    public int getSideLength() {
        return this.sideLength;
    }

    public String setSideLength(int LengthOfSide) {
        this.sideLength = LengthOfSide;
        return this.shapeName + "'s length of it's sides have changed to " + LengthOfSide;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }


}
