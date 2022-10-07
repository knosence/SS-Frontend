package com.skillstorm;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int myNumber = 5; //points to the memory location of G7
		
		/*
		 * Arrays in java are primarily store multiple values in a single variable
		 * 
		 * Key this to note:
		 * - Fixed size, Size must be defined up front and cannot be changed 
		 * - You need to know how big you'd like your array from the start
		 * - Arrays are typed and must be homogeneous in terms of type
		 * - Arrays are stored in memory contiguously
		 * - Arrays are 0-indexed. It means they start at 0. First element is an index 0
		 * - The last element is array.lenth - 1
		 */
		
		// How to create an array
		// DataType[]
		int[] numbers;
		
		// Creates space in memory to store our int array
		numbers = new int[5];
		
		System.out.println(numbers); //Memory address
		
		// In the numbers array, give me the value at index 0
		System.out.println(numbers[0]);
		
	    // to change, we will need to update the elements individually
		numbers[0] = 1; // Updating the first spot of the array to hold the value of 1
		numbers[4] = 200;
		numbers[2] = -535;
		System.out.println(numbers[0]); // prints first position element
		System.out.println(numbers[2]); // prints 3 position element
		
		// the size of an array is immutable and can't be changes after being initialized.
		
		//new is a keyword in Java.
		// It is a way to tell java to go and create a space in memory for my data
		
		int[] moreNumbers = new int[10];
		moreNumbers[5] = 200;
		
		System.out.println(moreNumbers[5]);
		
		String word = "word";
		
		// we can easily get the size of an array like this
		// use .length whenever you need the size of the array
		System.out.println("The length of moreNumbers is: " + moreNumbers.length);
		
		//Getting the final element of an array
		System.out.println("The final element of the array is: " + moreNumbers[moreNumbers.length - 1]);
		
		// We can also get the final element of an array
		int finalIndex = moreNumbers.length - 1;
		moreNumbers[finalIndex] = 100;
		
		char[] singleItemArray = new char[1];
		
		singleItemArray[0] = 'A';
		System.out.println("First element in the char array: " + singleItemArray[0]);
		System.out.println("Last element in the char array: " + singleItemArray[singleItemArray.length -1]);
		
		/*
		 * Remember:
		 * 0 is for getting the first element of array
		 * arrayName.length - 1 for getting the last element of array
		 * 
		 * 
		 */
		//Shorthand
		// String[] fruits = new String[7];
		// fruits[0] = "Apple";
		// fruits[1] = "Pear";
	//						0		1		2			3		4		5
		String[] fruits = {"Apple", "Pear", "Orange", "Plum", "Lemon", "Mango"};
		fruits[0] = "Pumpkin";
		System.out.println(fruits[0]);
		
		String[] fruitBasket = new String[100];
		fruitBasket[0] = "Apple";
		fruitBasket[1] = "Blackberry";
		fruitBasket[2] = "Apple";
		fruitBasket[0] = "Pear";
		
		System.out.println(fruitBasket[2]);
		System.out.println(fruitBasket[0]);
		
		
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		int index = 0;
		
		String[] bestFriends = new String[3];
		
		System.out.println("Please enter your 3 favorite friends");
		System.out.println("Enter friend number 1 here: ");
		bestFriends[0] = scan.nextLine();		
		
		System.out.println("Enter friend number 1 here: ");
		bestFriends[1] = scan.nextLine();		
		
		System.out.println("Enter friend number 1 here: ");
		bestFriends[2] = scan.nextLine();		
		
		System.out.println("Your friends are: ");
		System.out.println(bestFriends[0]);
		System.out.println(bestFriends[1]);
		System.out.println(bestFriends[2]);
		
		scan.close();
		
		
		
		
	}
}
