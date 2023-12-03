package com.skilldistillery.jets;

public class fighterJet extends Jet implements CombatReady{

	public fighterJet() {
	
	}
	
	
	public fighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	public double getSpeedInLightYears() {
		double speedInlightYears = (getSpeed() / 60616629);
		System.out.println(speedInlightYears + " light years");
		
		
		return speedInlightYears;
		
	}


	@Override
	void fly() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
