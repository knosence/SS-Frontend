package com.skillstrom;

public class Strings {

	public static void main(String[] args) {
		
		// Write a program that pares csv string and converts it into usable data
		// Comma Separated Values
		/*
		 * Wet - Write everything Twice
		 * Dry - Don't repeat yourself
		 * 
		 * Strings are technically char array with a few extra features
		 * 
		 * Features:
		 * 
		 * - Utility functions such as toLowerCase and substring()
		 * - Java has given us the ability to use the + operator to add or concatenate two strings
		 *    EX. "Apple " + "Banana" -> "Apple Banana"
		 *    -Strings are technically immutable (immutable means unable to be changed)
		 */

		int[] numbers = new int[5];
		numbers[3] = 5; //This cannot be done with a String
		
		// Strings are just char arrays "under the hood"
		// We can iterate over a String just like an array
		
		String firstName = "Margaret";
		
		// remember that Strings' lengths are gotten by .length();
		for (int i = 0; i < firstName.length(); i++){
			char c = firstName.charAt(i);
			System.out.println("Char at index " + i + " is: " + c);
		}
		
		// Alternative way to loop through a String
		for (char c: firstName.toCharArray()) {
			System.out.println(c);
		}
		
		// Useful functions on the Strings
		
		// toLowerCase() takes a String and returns a new String that has the A-Z characters lower cased
		
		String lowerCasedFirstName = firstName.toLowerCase(); // This does not change firstName
		System.out.println(lowerCasedFirstName); // new value
		System.out.println(firstName); //still has old value
		
		// toUpperCase is just like the toLowerCase but the opposite
		System.out.println(lowerCasedFirstName.toUpperCase());
		
		String message = "a";

		System.out.println(message.isEmpty());
		
		//replace() replaces all instances of the old char with the new char
		
		String boringSentence = "I woke up today. After that, I went to the store.";
		String evenMoreExcitingSentence = boringSentence.replaceAll(".", "!");
		System.out.println(evenMoreExcitingSentence);
		
		// to fix it we will need a escape character
		String backToExcitingSentence = boringSentence.replaceAll("\\.", "!");
		System.out.println(backToExcitingSentence);
		
		String excitingSentence = boringSentence.replace(('.'), '!');
		
		
		String secondPersonSentence = boringSentence.replace("I", "You");
		System.out.println(secondPersonSentence);
		
		System.out.println(excitingSentence); //This does not change boringSentence
		System.out.println(boringSentence);
		
		// substring() is it creates a new String that is a section of our old String
		
		String rainbow = "Rainbow";
		String rain = rainbow.substring(1);
		System.out.println(rain);
		rain = rainbow.substring(0);
		System.out.println(rain);
		rain = rainbow.substring(0, 1);
		System.out.println(rain);
		rain = rainbow.substring(0, 4);
		System.out.println(rain);
		
		String bow = rainbow.substring(4, rainbow.length());
		bow = rainbow.substring(4);
		
		System.out.println(bow);
		
	}

}
