package com.skillstorm;

public class MethodChaining {
    public static void main(String[] args) {

        /*
        Method Chaining

        What if I want to do several things in a row to an Object?

        I could call each of the Object's methods one after another in separate lines of code

        OR, I could set up my methods, so we could do them all at once
Method chaining, also known as named parameter idiom, is a common syntax for invoking multiple method calls in object-oriented programming languages. Each method returns an object, allowing the calls to be chained together in a single statement without requiring variables to store the intermediate results.
        syntax:
        object.methodOne(param);
        object.methodTwo(param);
        object.methodThree(param);

        Syntax with chaining: object.methodOne(param).methodTwo(param).methodThree(param)
         */

        Horse horse = new Horse(5);
        System.out.println(horse.toString());

        horse.addHair(10);
        System.out.println(horse.toString());

        horse.addLotsOfHair(10);
        System.out.println(horse.toString());

        horse.addAnInsaneAmountHair(6);
        System.out.println(horse.toString());

        //horse.addHair(10).addLotsOfHair(10).addAnInsaneAmountOfHair(6);
        Horse greaterHorse = new Horse(1);
        greaterHorse.addAnInsaneAmountHair(34).addHair(2).addHair(79).addLotsOfHair(809);

        System.out.println(greaterHorse.toString());

    }
}
