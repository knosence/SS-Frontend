package week02.day007;

public class ShapeInheritance {
    /*

    Create a class that represents a real-life shape and have it inherit from a Shape class you create. The shape you choose should be able to perform all of its standard capabilities as well as overriding any inherited properties that don't fit your shape. These shapes should store pertinent data and be able to perform operations related to it such as calculating area, perimeters, etc.

    Requirements:
    - Create a Shape class
    - Create a class that inherits from Shape
    - Override any methods that contradict with the intended behavior of your selected shape
    - Have the ability to create multiple objects of your shape and have their data be independent of one another


     */

    public static void main(String[] args) {

        Square square = new Square("Square", 6 );

        System.out.println(square.getShapeSides());
        System.out.println(square.getSideLength());
        System.out.println(square.calculateShapeParameter());

    }
}
