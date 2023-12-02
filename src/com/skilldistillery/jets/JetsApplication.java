package com.skilldistillery.jets;

import java.util.Scanner;
import com.skilldistillery.jets.AirField;

public class JetsApplication {
	private Scanner keyboard;
	private AirField airField;
	private int answer;

	public static void main(String[] args) {
		JetsApplication shipApp = new JetsApplication();
		System.out.println("Hello, welcome to our Ships application. What would you like to do?: ");
		shipApp.run();

	}

	public void InitialAirField() {
		airField = new AirField();
		airField.addJet(new CargoPlane("CargoJet1", 500, 2000, 1000000));
		airField.addJet(new CargoPlane("CargoJet2", 600, 1800, 1200000));
		airField.addJet(new fighterJet("FighterJet1", 1200, 1000, 1500000));
		airField.addJet(new fighterJet("FighterJet2", 1100, 1200, 1400000));
		airField.addJet(new PassengerJet("PassengerJet1", 700, 2500, 800000));
	}

	public void run() {
		runMenu();
	}

	public void runMenu() {
		keyboard = new Scanner(System.in);
		displayMenu();
		answer = keyboard.nextInt();
		do
			switch (answer) {
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
		while (answer != 9);
	}

	public void displayMenu() {

		System.out.println("1. List fleet\n" + "2. Fly all ships\n" + "3. View fastest ship\n"
				+ "4. View ship with longest range\n" + "5. Load all Cargo ships\n" + "6. Dogfight!\n"
				+ "7. Add a ship to Fleet\n" + "8. Remove a ship from Fleet\n" + "9. Quit");
	}

	public void listFleet() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);
		
	}

	public void flyShips() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);
	
	

	}

	public void displayFastestShip() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);
	
	}

	public void displayShipWithLongestRange() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void loadCargoShips() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);
	
	}

	public void dogFighting() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void addShip() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void removeShip() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if(answer == 1) {runMenu();}
			else if (answer != 1){
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void quit() {

		System.exit(9);

	}

}
