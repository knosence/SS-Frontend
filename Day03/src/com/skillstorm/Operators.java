package com.skillstorm;

public class Operators {

	public static void main(String[] args) {

		/*
		 * Operators An operator is something that does an operation
		 * 
		 * Mathematical Operators + -- Addition (2+2==4) - -- subtraction (2-2==0) * --
		 * Multiplication (2*2==4) / -- Division (2/2==1) % -- Modulo (returns the
		 * remainder of a division operation) (2%2==0, 3%2==1, 2%7==0)
		 * 
		 * = -- assignment operator (assigns the value on the right to the variable or
		 * whatever on the left) myNumber = 3 assigns the value 3 to the variable
		 * myNumber This operator returns a value -- if (myBoolean = true) (return
		 * myBoolean = true;) += -- adds the value to the right to the variable on the
		 * left, then assigns the new value to the variable myInt=5; myInt += 5; now
		 * myInt == 10 -= -- *= /= %=
		 * 
		 * ++ -- increases the value of the variable by 1 -- -- decreases the value of a
		 * variable by 1 myInt++; and ++myInt; have the same result
		 * 
		 * Boolean Operators Asks a true/false question, returns the answer as a boolean
		 * 
		 * Single boolean question ======================= == -- logical equals, is the
		 * value on the left equals to the value on the right? < -- less than, is the
		 * value on the left less than the value on the right? > -- greater than <= --
		 * less than or equal >= -- greater than or equal
		 * 
		 * 
		 * ! -- not, reverses the truth of whatever follows it (true == !false, false =
		 * !true, !=, !<, etc.)
		 * 
		 * Comparing two boolean statements ================================ | --
		 * bitwise OR, process both to see if they're true, regardless of whether the
		 * first one already gives you your overall answer & -- bitwise AND
		 * 
		 * || -- logical OR, is either the value on the left true or the value on the
		 * right true doesn't bother with the lone on the with if the left one is true
		 * (true || false -> true) && -- logical AND, are both the values on the left
		 * and right true? (true && false -> false)
		 * 
		 * !|| -- NOR, returns true if NEITHER value is true !&& -- NAND, returns true
		 * if at least one value is false
		 * 
		 * ^ -- XOR, exclusive OR, returns true only if ONE is true but not BOTH !^ --
		 * XNOR, exclusive NOR,
		 * 
		 */

		// if/else statements allow to execute code only if certain conditions are met
		// I might want one thing to happen if something is true and another to happen
		// if it's not

		boolean myBoolean = true;

		// if your if/else block only contains one line of code, you don't need the
		// curly braces
		if (myBoolean == true) {
			System.out.println("It's true!");
		} else {
			System.out.println("It's false!");
		}

		System.out.println(); // spacing
		// if (myBoolean = true) assigns true and is not generally used
		// if ((myInt = 5) ==5) will evaluate as well but same as above
		// if (myInt = 5) will not run because it doesn't result as a boolean
		int myInt = 4;

		if (myInt == 4) {
			System.out.println("Spot on!");
		} else if (myInt == 5) {
			System.out.println("Just a little too big...");
		} else if (myInt == 3) {
			System.out.println("Just a little too small...");
		} else if (myInt > 4) {
			System.out.println("Too big...");
		} else {
			System.out.println("Too small...");
		}

		System.out.println();

		int myAge = 19;

		// Checking conditions one by one
		if (myAge >= 18) {
			System.out.println("Alright, I'm at lease 18. What can I do?");
			if (myAge >= 21) {
				System.out.println("To the bar!");
			} else if (myAge == 20) {
				System.out.println("Please, Mr. Bouncer??");
			} else {
				System.out.println("At lease I can vote...");
			}
		} else {
			System.out.println("Enjoy your youth while you can.");
		}

		System.out.println(); // spacing

		// checking conditions all at once

		// a String is an array of chars
		String myName = "Larry";
		String myLastName = "Larryson";
		String myHatSize = "XL";

		if (myName == "Larry" && myAge == 20 || myLastName == "Larryson" && myHatSize.indexOf('X') == 0) {
			System.out.println("Everything check ");
		} else if (myName == "Larry") {
			System.out.println("Hey, Larry .. no such luck this time.");
		} else {
			System.out.println("Sorry, fella.");
		}

		// having no else block is okay, depending on the functionality you desire
		String time = "11:10am";

		if (time == "11:10am") {
			System.out.println("It's 11:10am... huzzah!");
		}

		System.out.println(); // spacing
		// Post Office example
		// if size/weight is .. do something
		// if destination is national/international, do something
		// if shape is .. do something
		// if delivery time is ... do something

		// object Declaration
		Object myPackage = new Object();
		int weight = 30;
		int length = 25;
		String destination = "Florida";
		boolean isInternational = false;
		String shape = "square";
		int deliveryTime = 300;

		// Checks if there is a package
		// checks conditions one at a time
		if (myPackage != null) {
			if (weight >= 50) {
				System.out.println("Package is too heavy; freight shipping required.");
			} else {
				System.out.println("Weight okay.");
				// checks if length is good
				if (length > 25) {
					System.out.println("Package is too long; cut it up.");
				} else {
					System.out.println("Length okay.");
					// checks if it is international
					if (!isInternational)
						System.out.println(destination);

					// checks if shape is square
					if (shape != "square") {
						System.out.println("Package too oblong, repack.");
					} else {
						System.out.println("Estimated time for delivery: " + deliveryTime + " days.");
					}
				}

			}
		} else {
			System.out.println("No package");
		}

		// checking every condition at once
		if (myPackage != null && weight <= 49 && length <= 25 && !isInternational && shape == "square") {

			System.out.println("Weight okay.");
			System.out.println("Length okay.");
			System.out.println(destination);
			System.out.println("Estimated time for delivery: " + deliveryTime + " days.");
		} else {
			System.out.println();
		}

	}
}
