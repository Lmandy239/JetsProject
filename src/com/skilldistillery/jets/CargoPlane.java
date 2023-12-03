package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	
	public double getSpeedInLightYears() {
		double speedInlightYears = (getSpeed() / 60616629);
		System.out.println(speedInlightYears + " light years");
		
		
		return speedInlightYears;
		
	}
	

	@Override
	void fly() {
		
		
	}

	@Override
	public void loadCargo() {
		
	}
	

	
}
