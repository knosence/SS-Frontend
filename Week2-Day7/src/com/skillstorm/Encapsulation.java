package com.skillstorm;

import com.skillstorm.fun.Shoe;

public class Encapsulation extends Shoe{
    public static void main(String[] args) {

        /*
        * ENCAPSULATION
        *
        * Two pieces:
        *
        * -- wrapping properties and methods into a class
        * -- wh is it like? wh cn it do?
        *
        * Wve bn doing this already, when creating classes, giving them instance variables and methods!
        * -----------------------
        * Access Modifiers
        * =====
        * DOES NOT APPLY to local variables (variables within methods)
        *
        * public
        * -- any class, anywhere can access this property or method
        * -- public int age = 12;
        * -- Person doug = new Person();
        *       I can change doug's age by saying doug.age = 80; from anywhere
        *
        * protected
        * -- any class within the same package AND any subclass, even if it's in a different package
        * -- protected int age = 12;
        * -- Car myCar = new Car();
        *       I can change myCar's color from Mustang, even if it were in a different package
        *       bcus Mustang is a subclass of Car
        *
        * default (nothing)
        * -- any class within the same package cn assess this property or method
        * -- int age = 12;
        * -- Person doug = new Person();
        *       I can change doug's age by saying doug.exe = 80; from any class inside doug's package
        *
        * private
        * -- Only the class itself cn access this property or method
        * -- private int age = 12;
        */

        Shoe myShoe = new Shoe();
        System.out.println(myShoe);

        System.out.println(myShoe.brand);

        System.out.println();

        // default Computer constructor
        Computer myComputer = new Computer();
        System.out.println(myComputer.toString());

        System.out.println();

        Computer myComputer2 = new Computer((byte)16, "4TB", false, "Windows", "Tesla");
        System.out.println(myComputer2.toString());

        System.out.println("Values from getters");
        System.out.println(myComputer2.getRamAmount());
        System.out.println(myComputer2.getStorageAmount());
        System.out.println(myComputer2.isLaptop());
        System.out.println(myComputer2.getOs());
        System.out.println(myComputer2.getGpuBrand());

        System.out.println();

        System.out.println("Setting a value, then getting it:");
        myComputer2.setRamAmount((byte)32);
        System.out.println(myComputer2.getRamAmount());
    }
}
