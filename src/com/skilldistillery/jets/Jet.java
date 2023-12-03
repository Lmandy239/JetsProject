package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed; 
	private int range;
	private long price;
	
	public Jet() {
		super();
	}

	public  Jet(String model, double speed, int range, long price) {
		super();
		this.setModel(model);
		this.setSpeed(speed);
		this.range = range;
		this.price = price;
	}
	
	abstract void fly();

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "The jet is a " + model + ", with a speed of " + speed + ", and a range of " + range + ", the price is " + price ;
	}
	

	
	
}
