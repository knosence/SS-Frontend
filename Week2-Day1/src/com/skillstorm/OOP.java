package com.skillstorm;

public class OOP {

	public static void main(String[] args) {
		/*
		 * Object-Oriented Programming (oop)
		 * 
		 * As opposed to procedural or functional programming
		 * 
		 * Intent is to create and include real-world objects in programming
		 * 
		 * -- allows us to create programs that more dynamic in behavior -- a little
		 * more confusing because code is not necessarily sequential -- can create
		 * digital representations of real-world objects
		 * 
		 * ----------------------- 4 pillars of OOP
		 * 
		 * Encapsulation Abstraction Inheritance Polymorphism
		 * 
		 * ------------------------ Encapsulation
		 * 
		 * Two Pieces: 1 Class-binding = wrapping properties and methods into class What
		 * features does every Object in this class have? What can every Object in this
		 * class do? 2. Access control = how/when/by whom/by what can we alter the
		 * properties or use the method
		 * 
		 * ------ Abstraction
		 * 
		 * Hiding the details of implementation from the "user" a "user" can be a
		 * real-life person OR another class or piece of code The "user" doen't care HOW
		 * the code works, only THAT it works Abstract classes and interfaces are common
		 * usages Also some more complex patterns
		 * 
		 * --------------- Inheritance
		 * 
		 * Simplifying code through modularity/reusablity
		 * 
		 * A class has properties and methods A class that inherits the first may have
		 * additional properties and methods We don't need to recode the first class's
		 * properties and methods in the second class of it INHERITS the first
		 * 
		 * Example: PoliceOfficer inherits from Person -- a PoliceOfficer IS-A Person; a
		 * person is not necessarily a PoliceOfficer -- Police Officer can inherit from
		 * Person to acquire its properties and methods
		 * 
		 * ----------- Polymorphism = "Many forms"
		 * 
		 * Methods can have multiple forms within a class or within a inheritance tree
		 * Overloading = within the same class, the same method name can take in
		 * different parameters Overriding = within an inheritance tree, a subclass can
		 * have the same method name/parameters with different functionality.
		 * 
		 */

		System.out.println(PoliceOfficer.isUpstanding);
		PoliceOfficer.graduate();

		PoliceOfficer policeOfficerOne = new PoliceOfficer();
		PoliceOfficer policeOfficerTwo = new PoliceOfficer(false);
		PoliceOfficer policeOfficerThree = new PoliceOfficer(true, "Glock", "Black", (byte) 46);

		System.out.println(policeOfficerOne.isCertified);
		System.out.println(policeOfficerTwo.isCertified);
		System.out.println(policeOfficerThree.sidearmType);
		System.out.println(policeOfficerThree.isCertified);
		System.out.println(policeOfficerThree.uniformColor);
		System.out.println(policeOfficerThree.age);

		// incorrect way to call a static variable
		System.out.println(policeOfficerOne.isUpstanding);
		System.out.println(policeOfficerTwo.isUpstanding);

		// incorrect way to change static variable
		policeOfficerOne.isUpstanding = false;

		// correct way to call a static variable = ClassName.variableName
		System.out.println(policeOfficerOne.isUpstanding);
		System.out.println(policeOfficerTwo.isUpstanding);

		PoliceOfficer.isUpstanding = true;

		policeOfficerThree.checkUpstaningness();

		// cant do this because DISTRICT is a final variable
//		PoliceOfficer.DISTRICT = "East New York"; //Wont work

		// non-properly-encapsulated way of changing property values
		System.out.println();

	}

}
