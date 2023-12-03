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
		this.setRange(range);
		this.price = price;
	}
	
	abstract void fly();
	

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

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


	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	@Override
	public String toString() {
		return "This jet is a(n) " + model + ", with a speed of " + speed + "(MPH), and a range of " + getRange() + " parsecs, the price is " + price + " credits." ;
	}

	
	
}
