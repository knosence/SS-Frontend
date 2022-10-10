package com.skillstorm;

import java.util.LinkedList;

public class WrapperClasses {

	public static void main(String[] args) {
		// Wrapper classes are Object we use to contain primitive data types
		
		// normal variable declaration/initialization
		int age = 23;
		
		Integer ageInt = new Integer(23);
		
		//Prints out the valuse and not the memory address
		System.out.println(ageInt);
		
		Byte myByte = new Byte ((byte) 3);
		
		System.out.println(myByte);
		
		Short myShort = new Short ((short)334);
		System.out.println(myShort);
		
		Long myLong = new Long(12345);
		System.out.println(myLong);
		
		Float myFloat = new Float(12.34f);
		System.out.println(myFloat);
		
		Double myDouble = new Double(14.3);
		System.out.println(myDouble);
		
		Boolean myBoolean = new Boolean(false);
		System.out.println(myBoolean);
		
		Character myChar = new Character('z');
		System.out.println(myChar);
		
		int[] myIntArray = {1, 2, 3,  4, 5};
		
		for (int myInt: myIntArray) {
			
			System.out.println(myInt);
		}
	
		//... but a LinkedList CANNOT -- must hold Objects
		// so we use the Integer wrapper class
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(new Integer(6));
		myLinkedList.add(new Integer(7));
		myLinkedList.add(new Integer(8));
		myLinkedList.add(new Integer(9));
		myLinkedList.add(new Integer(10));
		
		for (Integer nums : myLinkedList) {
			System.out.println(nums);
		}
		
		
		
		
	}

}
