package com.skillstorm;

// the "Final" keyword makes it so you CANNOT extend (inherit from) a class
// public final class Animal{}
public class Animal {

	// Properties that ALL animals have
	public boolean hasLegs;
	public String color;
	public String diet;
	
	// Constructor
	public Animal() {
		super();
	}
	
	public Animal(boolean hasLegs, String color, String diet) {
		this.hasLegs = hasLegs;
		this.color = color;
		this.diet = diet;
	}
	
	// Methods that ALL animals have
	public void move() {
		System.out.println("I am an Animal, and I just went forward");
	}
	
	public void speak() {
		System.out.println("Generic Animal Noise");
	}
	
	public void eat() {
		System.out.println("I am an Animal, and now I am full.");
	}
	
	public static void drink() {
		System.out.println("Glub glub.. Animal like drink!");
	}
}
