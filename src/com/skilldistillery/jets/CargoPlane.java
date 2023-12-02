package com.skilldistillery.jets;

public class CargoPlane extends Jet {

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		
	}
	public double getSpeedInLightYears() {
		double speedInlightYears = (getSpeed() / 670616629);
		System.out.println(speedInlightYears + " light years");
		
		
		return speedInlightYears;
		
	}
	

	@Override
	void fly() {
		
		
	}
	
}
