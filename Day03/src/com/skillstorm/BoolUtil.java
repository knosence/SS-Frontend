package com.skillstorm;

import java.util.Scanner;

public class BoolUtil {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int usbPorts = 8;
			int voltsPerPort = 12;

			System.out.println("Welcome to your Dock Station Setup!!");
			System.out.print("Using only numerical values, ");
			System.out.println("How many items do you want to connect to your USB dock Station?: ");

			int items = scan.nextInt();

			if (items > usbPorts) {
				System.out.println("Too Many Items for station");
			} else if (items <= usbPorts && items > 0) {
				System.out.println("You have " + (usbPorts - items) + " Ports remaining.");
				System.out.println("How much is the voltage?: ");
				int volts = scan.nextInt();

				if (volts > voltsPerPort && volts > 0) {
					System.out.println("Too many volts to connect, you can connect if you like magic smoke");
				} else if (volts == voltsPerPort) {
					System.out.println("Perfect amount of voltage. Enjoy your Experience!");
				} else if (volts <= 0) {
					System.out.println("I think your calcations are off.");
				} else {
					System.out.println("Item Voltage are " + (voltsPerPort - volts)
							+ " volts below the Max voltage. Enjoy your Experence");
				}
			} else {
				System.out.println("How where you able to connect " + items + " items!! HOW!!");
			}
		}
	}

}
