package com.skilldistillery.jets;

public class JetsApplication {
	
	private AirField airField;
	
	public static void main(String[] args) {
		JetsApplication shipApp = new JetsApplication();
		System.out.println("Hello, welcome to our Ships application. What would you like to do?: ");
		shipApp.run();
		
		
	}
	
	public void run() {
		menu();
	}
	
	
	public void menu() {
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

}
