package com.skillstorm;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		/*
		 * What is a loop?
		 * 
		 * Loops are just blocks of code that will continuously execute so long as their
		 * condition is met
		 * 
		 * Similar to an if statement with the conditions
		 * 
		 * Loop Process
		 * 
		 * So long as the boolean condition is true, the following block of code will be
		 * executed. Once that block finishes execution, the boolean condition is
		 * rechecked. If it is true, run the block again and so on if it is false, the
		 * code doesn't not run the block of code and continues with the program
		 * normally
		 * 
		 * ==Different types of loops==
		 * 
		 * while for for-each do-while
		 * 
		 * 
		 */

		// while loop is similarly created as if
		if (true) {
			// runs this code
		}
		System.out.println("Hello"); // This always happens

		// vs while
		int count = 0;
		while (count < 5) {
			System.out.println("The value of count is: " + count);
			count++; // ++ just increments by 1
			// Recheck the boolean condition with the new value of count
			System.out.println(count);

		}
		System.out.println("Finished Loop!");
		System.out.println("THe final value of count is: " + count);

		String[] fruits = { "Apple", "Pear", "Orange", "Plum", "Lemon", "Mango" };

		// Use a while loop to iterate over my array

		int index = 0;
		while (index < fruits.length) {
			System.out.println("THe fruit at index " + index + " is: " + fruits[index]);
			index++;
		}

		// The above can be done the same as above
		System.out.println();
		System.out.println("THe fruit at index " + 0 + " is: " + fruits[0]);
		System.out.println("THe fruit at index " + 1 + " is: " + fruits[1]);
		System.out.println("THe fruit at index " + 2 + " is: " + fruits[2]);
		System.out.println("THe fruit at index " + 3 + " is: " + fruits[3]);
		System.out.println("THe fruit at index " + 4 + " is: " + fruits[4]);
		System.out.println("THe fruit at index " + 5 + " is: " + fruits[5]);
		// System.out.println("THe fruit at index " + 6 + " is: " + fruits[6]);

		int[] numbers = new int[10];

		// For Loops
		// Benefit of for loops is for iterating over something for a given amount

		// Syntax of a for loop
		// for (counter initialization; Condition; code to be execute at the end of
		// while book) {}
		// i is short for index
		for (int i = 0; i < fruits.length; i++) {
			// Hit the bottom, do i++
		}

		// same version of our while loop
		for (int counter = 0; counter < 5; counter += 1) {
			System.out.println("The value of counter is: " + counter);
		}

		// can also write as
		int counter;
		for (counter = 0; counter < 5; counter += 1) {
			System.out.println("The value of counter is: " + counter);
		}

		boolean isAlive = true;
		while (isAlive) {
			// DO your life

			isAlive = false;
		}

		// Show fruits in reverse order
		for (int i = fruits.length - 1; i >= 0; i--) {
			System.out.println("Fruits at index " + i + " is " + fruits[i]);
		}

		// Foreach loop
		// foreach loops do not come with an index
		// can be read as for each fruit in the fruits array
		for (String fruit : fruits) {
			System.out.println(fruit);
			fruit = "Apple"; // doesn't actually change the value in the array
		}

		/*
		 * while - something is true (a positive ban balance, something is not
		 * empty/full) for - use for reading and writing to a list of data foreach -
		 * reading through a list of data and doing something with the data (don't use
		 * edit)
		 * 
		 */

		// do - while

		// similar to a while loop

		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("What is your age?");
			int age = scan.nextInt();
			System.out.println("You are " + age + " years old!");
			scan.nextLine();

			System.out.println("Do you want to continue? Y/N");
			answer = scan.nextLine();
		} while (answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("yes"));

		System.out.println("Thanks for playing!");

		scan.close();
	}

}
