package com.shapes;

import java.util.Objects;

public class CircleStruct {
    /*


    -- Create a class, Circle, that describes and performs the capabilities of a real-life circle.
    -- These circles should store pertinent data and be able to perform operations such as calculating the diameter, circumference, and area

    ** Requirements **
    ==================
    - Contains useful methods calculating a circle's diameter, circumference, and area
    - be able to create a Circle object by either providing a radius, or, if none is provided, creates a circle with some default radius instead
    - have the ability to create multiple Circle objects and have their data be independent of one another

    ** Bonus Challenge = create a method that compares one Circle object with another and determine whether they're equal or not

     */


    //Props
    //======
    private float radius = 5f;

    //Struct
    //=======

    public CircleStruct(){
        this.radius = radius;
    }

    public CircleStruct(float radius) {
        this.radius = radius;
    }

    //Functions
    //=========

    // Override
    @Override
    public boolean equals(Object obj){
        // check if two objects are pointing to same object
        if (this == obj) return true;

        // check if 1 - object is pointing to null and 2 if object belong to same class or not
        if (obj == null || this.getClass() != obj.getClass()) return false;

        // check if two objects share all same values
        return Objects.equals(this.radius, ((CircleStruct) obj).radius);
    }

    @Override
    public String toString() {
        return "CircleStruct{" +
                "radius=" + radius +
                '}';
    }

    // diameter
    public float circleDiameter(){
        return radius * 2;
    }
    // circumference
    public float circleCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    // area
    public float circleArea() {
        return (float) (Math.PI * (radius * radius));
    }

    // getters and setters

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
