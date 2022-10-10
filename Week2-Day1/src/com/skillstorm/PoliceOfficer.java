package com.skillstorm;

public class PoliceOfficer {

	// PROPERTIES
	// class variables
	// All Objects of this class share this variable
	// static keyword makes a variable a class variable and NOT an instance variable
	public static boolean isUpstanding = true;

	// final keyword
	final public static String DISTRICT = "West New York";

	// instance variables
	// each Object of this class will have its own copy of these variables
	// assigned values will be defaults unless overwritten in a constructor
	// if declared but not initialized (e.g public int height;), a default Value
	// will be assigned (generally some version of zero/nothing)
	public boolean isCertified = true;
	public String sidearmType = "Smith & Wesson";
	public String uniformColor = "Blue";
	public byte age = 35;

	// Constructors
	// each class has a default constructor
	// exists whether we type it out of not
	public PoliceOfficer() {
		super();
	}

	// custom constructor
	public PoliceOfficer(boolean isCertified) {
		this.isCertified = isCertified;
	}

	// Second Custom Constructor
	public PoliceOfficer(boolean isCertified, String sidearmType, String uniformColor, byte age) {
		this.isCertified = isCertified;
		this.sidearmType = sidearmType;
		this.uniformColor = uniformColor;
		this.age = age;
	}

	// METHODS
	// Static methods
	public static void graduate() {
		System.out.println("Whoopee!! I got my badge!");
	}

	// Static methods can ONLY call static variable or other stic methods
	// This does not work because I'm trying to use a non-static variable
//	public static void checkCertification() {
//			System.out.println("I'm certified!");
//		}
//	}
//	
	// instance methods
	public void shoot() {
		System.out.println("Bang!");
	}

	public void rescueCat() {
		System.out.println("Come outta that tree, Cuties.");
	}

	public void checkUpstaningness() {
		if (isUpstanding) {
			System.out.println("Is Upstanding");
		} else {
			System.out.println("Bad Cop!, Bad Cop!");
		}
	}

}
