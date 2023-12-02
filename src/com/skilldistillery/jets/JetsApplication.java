package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private Scanner keyboard;
	private AirField airField;
	
	public static void main(String[] args) {
		JetsApplication shipApp = new JetsApplication();
		System.out.println("Hello, welcome to our Ships application. What would you like to do?: ");
		shipApp.run();
		
		
	}
	
	public void run() {
		runMenu();
	}
	
	public void runMenu() {
		keyboard = new Scanner(System.in);
		displayMenu();
		int answer = keyboard.nextInt();
		 
		switch(answer) {
		case 1:
			listFleet();
			break;
		case 2:
			flyShips();
			break;
		case 3:
			displayFastestShip();
			break;
		case 4:
			displayShipWithLongestRange();
			break;
		case 5:
			loadCargoShips();
			break;
		case 6:
			dogFighting();
			break;
		case 7:
			addShip();
			break;
		case 8:
			removeShip();
			break;
		case 9:
			System.out.println("May the force be with you!!");
			quit();
		break;
		}
	}
	
	public void displayMenu() {
		
		System.out.println("1. List fleet\n"
				+ "2. Fly all ships\n"
				+ "3. View fastest ship\n"
				+ "4. View ship with longest range\n"
				+ "5. Load all Cargo ships\n"
				+ "6. Dogfight!\n"
				+ "7. Add a ship to Fleet\n"
				+ "8. Remove a ship from Fleet\n"
				+ "9. Quit");
	}
	public void listFleet() {}
	public void flyShips() {}
	public void displayFastestShip() {}
	public void displayShipWithLongestRange() {}
	public void loadCargoShips() {}
	public void dogFighting() {}
	public void addShip() {}
	public void removeShip() {}
	public void quit() {
		System.exit(9);
		
	}
}
