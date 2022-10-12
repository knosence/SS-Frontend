package com.skillstorm;

public class Horse {

    public int amountOfHair = 0;

    public Horse() {
        super();
    }

    public Horse(int amountOfHair){
        this.amountOfHair = amountOfHair;
    }

    //overrides Object
    @Override
    public String toString() {
        return "Horse{" +
                "amountOfHair=" + amountOfHair +
                '}';
    }

    public Horse addHair(int newHair){
        amountOfHair = amountOfHair + newHair;
        return this;
    }

    public Horse addLotsOfHair(int newHair){
        amountOfHair = amountOfHair + (newHair * 10);
        return this;
    }

    public Horse addAnInsaneAmountHair(int newHair){
        amountOfHair = amountOfHair + (newHair * 1000);
        return this;
    }
}
