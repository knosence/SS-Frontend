package com.skillstorm;

public class MaxVal {

	public static void main(String[] args) {

		int[] intArray = { 10, 14, 8, 100, 5000, 6, 202938, 83, 0 };

		System.out.println(maxNumber(intArray));
		System.out.println(minNumber(intArray));

	}

	public static int minNumber(int[] ints) {
		int lesserNum = 0;

		for (int i = 0; i < ints.length - 1; i++) {
			if (i == 0)
				continue;

			if (ints[i] < lesserNum) {
				lesserNum = ints[i];
			}
		}

		return lesserNum;
	}
	
	public static int maxNumber(int[] ints) {
		int greaterNum = 0;

		for (int i = 0; i < ints.length - 1; i++) {
			if (i == 0)
				continue;

			if (ints[i] > greaterNum) {
				greaterNum = ints[i];
			}
		}

		return greaterNum;
	}

}
