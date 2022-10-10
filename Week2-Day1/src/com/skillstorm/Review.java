package com.skillstorm;

public class Review {

	public static void main(String[] args) {
		int one = 1;
		int two = 2;
		
		String[] names = {"Joe", "Mary", "Zulmak"};
		
		//loops review
		/*
		 * While 
		 * for 
		 * for each (enhanced for)
		 * do/While
		 * 
		 */
		
		/* 
		 * while (conditions {
		 *  code
		 *}
		 */
	
		//checks the condition before running the first time
		while (one == two){
			System.out.println("Foreeeeever...");
		}
		
		/*
		 * do {
		 * some cod
		 * } while (condition)
		 */
		
		do {
			System.out.println("Code to do.... ");
		} while (one == two);
		
		/*
		 * for (data type variable name: collection name) {
		 *  some code
		 * }
		 */
		
		for (String name : names) {
			System.out.println(name);
		}
		
		/* 
		 * for (variable value; what to do after each loop) {
		 *  some code
		 * }
		 */
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//backwards
		for (int i = 2; i >= 0; i--) {
			System.out.println(names[i]);
		}
		
		
		
		
		
		
		
		
	}
}



















