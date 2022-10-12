package com.shapes;



public class Main {
    public static void main(String[] args) {

        /*


        -- Create a class, Circle, that describes and performs the capabilities of a real-life circle.
        -- These circles should store pertinent data and be able to perform operations such as calculating the diameter, circumference, and area

        ** Requirements **
        ==================
        - Contains useful methods calculating a circle's diameter, circumference, and area (DONE)
        - be able to create a Circle object by either providing a radius, or, if none is provided, creates a circle with some default radius instead
        - have the ability to create multiple Circle objects and have their data be independent of one another

        ** Bonus Challenge = create a method that compares one Circle object with another and determine whether they're equal or not

         */

        // Circle Construction
        CircleStruct circle = new CircleStruct();
        System.out.println(circle.toString());
        System.out.println("The Area of a Circle with a radius of " + ((int) circle.getRadius()) + " is " + circle.circleArea());
        System.out.println("The Diameter of a Circle with a radius of " + ((int) circle.getRadius()) + " is " + circle.circleDiameter());
        System.out.println("The Circumference of a Circle with a radius of " + ((int) circle.getRadius()) + " is " + circle.circleCircumference());


        System.out.println();

        CircleStruct circle2 = new CircleStruct();
        System.out.println(circle2.toString());
        System.out.println("The Area of a Circle with a radius of " + ((int) circle2.getRadius()) + " is " + circle2.circleArea());
        System.out.println("The Diameter of a Circle with a radius of " + ((int) circle2.getRadius()) + " is " + circle2.circleDiameter());
        System.out.println("The Circumference of a Circle with a radius of " + ((int) circle2.getRadius()) + " is " + circle2.circleCircumference());

        System.out.println();
        System.out.println(checkIfCirclesAreEqualDetector(circle, circle2));

        System.out.println();

        circle2.setRadius(9);
        System.out.println(circle2.toString());
        System.out.println("The Area of a Circle with a radius of " + ((int) circle2.getRadius()) + " is " + circle2.circleArea());
        System.out.println("The Diameter of a Circle with a radius of " + ((int) circle2.getRadius()) + " is " + circle2.circleDiameter());
        System.out.println("The Circumference of a Circle with a radius of " + ((int) circle2.getRadius()) + " is " + circle2.circleCircumference());

        System.out.println();
        System.out.println(checkIfCirclesAreEqualDetector(circle, circle2));




    }

    public static String checkIfCirclesAreEqualDetector(CircleStruct circle1, CircleStruct circle2){
        if (circle1.equals(circle2)){
            return "The Equal Circle Detector has determined these two Circle Objects ARE.................. equal";
        } else {
            return "The Equal Circle Detector ahs determined these two Circle Objects ARE..................... NOT equal";
        }
    }
}