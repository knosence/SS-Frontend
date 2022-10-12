package com.skillstorm;

public class Review {
    public static void main(String[] args) {
        // can get to this static property BEFORE you actually create a Car Object
        System.out.println(Car.isDrivable);

        System.out.println();

        Car myCar = new Car();
        System.out.println("Default constructor car properties:");
        System.out.println(myCar.color + " " + myCar.fuelType);

        System.out.println();

        Car myCar2 = new Car("Black", "Plus Gasoline");
        System.out.println("Custom constructor car properties:");
        System.out.println(myCar2.color + " " + myCar2.fuelType);

        System.out.println();

        Car myCar3 = new Car("Electricity");
        System.out.println("Custom constructor car properties:");
        System.out.println(myCar3.color + " " + myCar3.fuelType);

        System.out.println();

        Mustang myMustang = new Mustang();
        System.out.println("Default constructor Mustang properties");
        System.out.println(myMustang.color + " " + myMustang.fuelType + " " + myMustang.enginType + " " + myMustang.isAwesome);

        Mustang myMustang2 = new Mustang("yellow", "Premium Gasoline", "v12", true);
        System.out.println("Custom constructor Mustang properties (uses Car custom constructor also):");
        System.out.println(myMustang2.color + " " + myMustang2.fuelType + " " + myMustang2.enginType + " " + myMustang2.isAwesome);
    }
}