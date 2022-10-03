// This is a comment
// can do multiple in a row
// naything after the two slashes doens't count code

/*
 * THis is a multi-lihne comment
 * can press return over and over
 * and it stays a comment
 */

//Class declaration
//access modifier, then the keyword  "class", then the name of the lass
//class name must be pascal case (upper case at the beginning of each word)
// class name must math the filename

public class HelloWorld {
	
	/*
	 * This is the main method 
	 * first thing that java runs when it runs the program
	 * 
	 * public -- anything in the program can access it
	 * static -- can be run without an "instance" of the object
	 * void -- a return type, void methods return nothing
	 * main -- the name of the method 
	 * 
	 * () -- contains the arguments the main method takes
	 * 
	 * String -- series of alphanumeric characters
	 * [] -- indicates that this is a array
	 * args -- is a variable name for the String array
	 * 
	 * example from command line -- java HelloWorld argument1 argument2
	 * 
	 * {} -- curly braces, everything within the curly braces is "in scope"
	 */
	public static void main(String[] args) {
		//this prints out anything within the parentheses to our console
		//if printing a String, put it in quotes
		System.out.println("Hello World!");
		System.out.println("... and Hello, back!");
		//sysout then CTL + spacebar
	    
	    
	}
	
	//not in the scope of our main method
	// public int number = 3
}
