package com.skillstorm;

public class Car {
    // class properties; don't need a Car Object created to use them
    public static boolean isDrivable = true;
    // Properties
    // "declared" here but not "initialized"
    public String color;
    public String fuelType;


    // constructors
    public Car() {
        super();
    }

    public Car(String fuelType){
        super();
        this.color = "black";
        this.fuelType = fuelType;
    }

    public Car(String color, String fuelType){
        // "initialized" here -> given actual useful values
        this.color = color;
        this.fuelType = fuelType;
        // this would be assignment, not initialization, because it already has a value from two lines up
        //this.color = "Taupe";
    }
    // methods
    public void drive() {
        System.out.println("Off I go!");
    }
}
