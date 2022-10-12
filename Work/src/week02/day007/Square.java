package week02.day007;

public class Square extends Shape{

    // Properties
    //===========
    private int shapeSides;

    // Constructor
    //============


    public Square() {
    }

    public Square(String shapeName) {
        super(shapeName);
        this.shapeSides = 4;
    }

    public Square(String shapeName, int sideLength) {
        super(shapeName, sideLength);
        this.shapeSides = 4;

    }


    // Functions
    //==========


    @Override
    public int getShapeSides() {
        return shapeSides;
    }

}
