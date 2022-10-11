package com.skillstorm;

import java.util.LinkedList;

public class Inheritance {

	public static void main(String[] args) {
		// inheritance Examples
		Animal.drink();
		HoneyBadger.drink();
		System.out.println();
		
		Animal animalOne = new Animal(true, "Black", "Omnivore");
		
		System.out.println(animalOne.hasLegs + " " + animalOne.color + " " + animalOne.diet);
		
		animalOne.move();
		animalOne.speak();
		animalOne.eat();
		
		System.out.println();
		
		// uses default constructor for both dog and Animal
		Dog dogOne = new Dog();
		
		dogOne.eat();
		System.out.println(dogOne.hasLegs);
		System.out.println(dogOne.color);
		System.out.println(dogOne.diet);
		System.out.println(dogOne.ownerName);
		System.out.println(dogOne.isVaccinated);
		System.out.println(dogOne.numberOfLegs);
		
		
		// does not work, because an Animal is NOT a dog, even though a Dog IS AN Animal
//		System.out.println(animalOne.numberOfLegs);
		System.out.println();
		// this uses our custom Dog constructor but uses the default Animal constructor
		Dog dogTwo = new Dog("Jacob", true, (byte)4);
		System.out.println(dogTwo.hasLegs);
		System.out.println(dogTwo.color);
		System.out.println(dogTwo.diet);
		System.out.println(dogTwo.ownerName);
		System.out.println(dogTwo.isVaccinated);
		System.out.println(dogTwo.numberOfLegs);
		
		System.out.println();
		//this uses our 6-parameter custom Dog constructor AND our custom Animal constructor
		Dog dogThree = new Dog(true, "White", "Omnivore", "Jet", true, (byte)3);
		System.out.println(dogThree.hasLegs);
		System.out.println(dogThree.color);
		System.out.println(dogThree.diet);
		System.out.println(dogThree.ownerName);
		System.out.println(dogThree.isVaccinated);
		System.out.println(dogThree.numberOfLegs);
		
		//without method overriding, the Dog just uses the Animal method
		//
		dogThree.move();
		dogThree.speak();
		dogThree.eat();
		
		dogThree.speak(5);
		
		System.out.println();
		
		//COVARIANCE
		//when something can be two things at once
		// enables us to group Objects together that are inherited from the same source
		// all Objects we create are technically 
		
		// reference type = HoneyBadger
		HoneyBadger hbOne = new HoneyBadger();
		
		hbOne.speak();
		
		// Reference type = Animal
		// CAN do this, because a HoneyBadger IS AN Animal
		Animal hbTwo = new HoneyBadger();
		
		// CANNOT do this, because Animal IS NOT a HoneyBadger
//		HoneyBadger hbThree = new Animal();
		
		hbTwo.speak(); //still returns razzle frazzle
		
		Inheritance inheritance = new Inheritance();
		
		LinkedList<HoneyBadger> hbll = new LinkedList<HoneyBadger>();
		
		// cannot add different Object types to a Collection
//		hbll.add(hbOne);
//		hbll.add(inheritance);
		
		LinkedList<Animal> animalList = new LinkedList<Animal>();
		
		// CAN do this, because ALL Animals, Dogs and HoneyBadgers are Animals, regardless of reference type
		animalList.add(hbOne);
		animalList.add(animalOne);
		animalList.add(dogOne);
		
		Animal hbThree = new HoneyBadger();
		
		hbThree.drink();
		
		
	}
}
