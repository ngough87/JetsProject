package com.skilldistillery.jets.entities;

public abstract class Jet {

	private String model;
	private int speedMPH ;
	private int range;
	private long price;
	public Jet(String model, int speedMPH, int range, long price) {
		super();
		this.model = model;
		this.speedMPH = speedMPH;
		this.range = range;
		this.price = (long) price;
	}
	
	public void fly() {
		
	}
		
	public void fight() {
	
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeedMPH() {
		return speedMPH;
	}
	public void setSpeedMPH(int speedMPH) {
		this.speedMPH = speedMPH;
	}
	public int getrange() {
		return range;
	}
	public void setrange(int range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public double flightTime() {
		return (this.getrange() / this.getSpeedMPH());
	}
	@Override
	public String toString() {
		return "\n Model: " + model + "\n SpeedMPH: " + speedMPH + "\n Range: " + range + "\n Price: 1" + price;
		
	}
	
	

		
	}
	
	

