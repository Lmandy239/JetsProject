package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class JetsApplication {
	private Scanner keyboard;
	private AirField airField = new AirField();
	private int answer;

	public static void main(String[] args) {
		JetsApplication shipApp = new JetsApplication();
		shipApp.initialAirField();
		shipApp.run();
	}

	public void run() {
		System.out.println("Hello, welcome to our Jets application. What would you like to do?: ");
		runMenu();
	}

	public void initialAirField() {
	     
	     airField.addJet(new PassengerJet("Coruscant shuttle", 70_000_000, 20000, 1_000_000_000));
	     airField.addJet(new CargoPlane("YTA-30", 65_000_000, 1800, 50_000_000 ));
	     airField.addJet(new fighterJet("X-Wing", 90_000_000, 1200, 250_000_000 ));
	     airField.addJet(new fighterJet("Y-Wing", 80_000_000, 1100, 150_000_000));
	     airField.addJet(new CargoPlane("Cargo ship", 60_000_000, 1600, 30_000_000));
	}

	public void runMenu() {
		keyboard = new Scanner(System.in);
		displayMenu();
		answer = keyboard.nextInt();
		do
			switch (answer) {
			case 1:
				listFleet(airField.getJets());
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

	public void listFleet(ArrayList<Jet> jets) {
		   if (jets.isEmpty()) {
		        System.out.println("No jets in the fleet.");
		    } else {
		        for (int i = 0; i < jets.size(); i++) {
		            Jet jet = jets.get(i);
		            System.out.println("Jet " + (i + 1) + ": " + jet.toString());
		        }
	    }

		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void flyShips() {
		for (Jet jet : airField.getJets()) {
			jet.fly();
		}
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void displayFastestShip() {

		Jet fastestJet = airField.getJets().stream().max(Comparator.comparing(Jet::getSpeed)).orElse(null);

		if (fastestJet != null) {
			System.out.println("Fastest Jet: " + fastestJet.toString());
		} else {
			System.out.println("No jets in the fleet.");
		}
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void displayShipWithLongestRange() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void loadCargoShips() {
		for (Jet jet : airField.getJets()) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void dogFighting() {
		do {
	        for (Jet jet : airField.getJets()) {
	            if (jet instanceof CombatReady) {
	                ((CombatReady) jet).fight();
	            }
	        }

			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void addShip() {
		  System.out.println("\nAdd a new jet to the fleet:");

		    int jetTypeChoice;
		    do {
		        System.out.println("Select the type of jet:");
		        System.out.println("1. Passenger Jet");
		        System.out.println("2. Cargo Jet");
		        System.out.println("3. Fighter Jet");

		        System.out.print("Enter your choice: ");
		        jetTypeChoice = keyboard.nextInt();
		    } while (jetTypeChoice < 1 || jetTypeChoice > 3);

		    Jet newJet = createJet(jetTypeChoice);

		    airField.addJet(newJet);
		    System.out.println("Jet added to the fleet: " + newJet.toString());
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public Jet createJet(int jetTypeChoice) {
		System.out.println("Enter the model: ");
	    String model = keyboard.next();

	    System.out.println("Enter the speed (in MPH): ");
	    int speed = keyboard.nextInt();

	    System.out.println("Enter the range: ");
	    int range = keyboard.nextInt();

	    System.out.println("Enter the price: ");
	    long price = (long) keyboard.nextDouble();

	    switch (jetTypeChoice) {
	        case 1:
	            return new PassengerJet(model, speed, range, price);
	        case 2:
	            return new CargoPlane(model, speed, range, price);
	        case 3:
	            return new fighterJet(model, speed, range, price);
	        default:
	            throw new IllegalArgumentException("Invalid jet type choice.");}
	}

	public void removeShip() {
		do {
			System.out.println("Would you like to go back to the Main menu? (Press 1)");
			answer = keyboard.nextInt();
			if (answer == 1) {
				runMenu();
			} else if (answer != 1) {
				System.out.println("Invalid answer!");
			}
		} while (answer != 1);

	}

	public void quit() {

		System.exit(9);

	}

}
