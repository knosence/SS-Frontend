package com.skillstorm;

// "extends" makes this class inherit from Car
public class Mustang extends Car{

    // properties
    public String enginType;
    public boolean isAwesome;

    // constructors
    public Mustang() {
       super();
    }

    public Mustang(String color, String fuelType, String enginType, boolean isAwesome){
        super(color, fuelType);
        // could also do this to define super variables, but would be redundant code -- we already wrote it in out Car custom constructor
//        super.color = color;
//        super.fuelType = fuelType;

        // this also works but is both redundant and confusing, since this Object doesn't have these properties
        // a Mustang IS A Car, though, so this complies
        // this.color = color;
        // this.fuelType = fuelType;

        this.enginType = enginType;
        this.isAwesome = isAwesome;
    }

    // methods
    public void drive(){
        System.out.println("Mustang beats fiat... see ya, sucka!");
    }
}
