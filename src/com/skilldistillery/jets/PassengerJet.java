package com.skilldistillery.jets;

public class PassengerJet extends Jet {
	private double LIGHT_SPEED_IN_PARSECS_PER_HOUR = 60616629.0;
	public PassengerJet() {
		super();
		
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}


	private double calculateSpeedInLightYears() {
        return (float) getSpeed() / LIGHT_SPEED_IN_PARSECS_PER_HOUR;
    }
	

	@Override
	void fly() {
		double speedInLightYears = calculateSpeedInLightYears();
        double amountOfTimeFlying = (speedInLightYears / getRange()) * 1000 * 60;
        float  hoursFlying = (float)amountOfTimeFlying;
        String formattedHours = String.format("%.2f", hoursFlying);
        
		System.out.println("Flying: " + getModel() + ", " + getSpeed() + "(MPH)" + ", with a range of " + getRange() + " parsecs, " + ", cost of " + getPrice() + " credits, "  + formattedHours +" hours of flight before refueleing");
		
		
	}



}
