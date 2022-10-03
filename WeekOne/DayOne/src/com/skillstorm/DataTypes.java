// package delaration
package com.skillstorm;
// class dec
public class DataTypes {

	//main method
	public static void main(String[] args) {

		/*
		 *  javascript, for example, is loosely-typed
		 *  -- you don't have to tell it what kind of variable it is when declaring it
		 *  -- it figures it out on its own
		 *  
		 *  advantages = flexibility, ease of setup
		 *  disavantages = compiler doesn't know there's an issue until it's too late
		 *  
		 *  java, by compariso, is strongy-typed
		 *  -- you must declare what kind of data is assigned to a variable when you declare the variable
		 *  
		 *  advantages/disadvantages = the opposit of the above
		 *  
		 *  Primitive Data Types in Java
		 *  -- not objects (one exception)
		 *  
		 *  = Whole number Data Types=
		 *  int (integer) -- -2^31 through 2^31-1 (32 bits)
		 *  byte -- -2^7 through 2^7-1 (8 bits)
		 *  short -- -2^15 through 2^15-1 (16bits)
		 *  long -- -2^63 through 2^63-1 (64bits)
		 *  
		 *  = Decimal/fractional Data Types = 
		 *  floats -- also 32 bits, but can include decimals
		 *  double -- 64 bits, and includes decimals
		 *  
		 *  = True/False Data Types =
		 *  boolean -- only true or false
		 *  
		 *  = Alphanumeric Data Types =
		 *  char -- single alphanumeric character
		 *  String (not a primitive, actually an object) -- series of alphanumeric characters
		 *
		 */
		
		// int = reference type -- what kind of data is in this variable?
		// myNumber = variable name -- camel-case, no capital letter at the top, capital letter at each new word
		// 34 -- value we're assigning to the variable
		int myNumber = 34;
		System.out.println(myNumber);
		//34
		
		byte myByte = 23;
		System.out.println(myByte);
		//23
		
		short myShort = 4985;
		System.out.println(myShort);
		//4985
		
		long myLong = 234982374;
		System.out.println(myLong);
		//234982374
		
		double  myDouble = 345.34;
		System.out.println(myDouble);
		//345.34
		
		float myFloat = 45.22f;
		System.out.println(myFloat);
		//45.22
		
		int myOtherInt = 3;
		System.out.println(myOtherInt);
		//3
		
		myOtherInt = myOtherInt/2;
		System.out.println(myOtherInt);
		//1
		
		boolean myBoolean = false;
		System.out.println(myBoolean);
		//false
		
		//variables outside of methods will have a default value
		//variables inside will not
		
		char myChar = 'A';
		System.out.println(myChar);
		//A
		// char can be incremented to sequentially move through the letters/characters
		++myChar; 
		//B
		
		String myString = "Hey! It's-a me, my string";
		System.out.println(myString);
		//Hey! It's-a me, my string
		
		String myOtherString = "...no kidding.";
		System.out.println(myString + " " + myOtherString);
		
	}

}










