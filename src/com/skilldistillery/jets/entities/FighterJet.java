package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Fight{

	
	public FighterJet(String model, int speedMPH, int range, long price) {
		super(model, speedMPH, range, price);
		// TODO Auto-generated constructor stub
	}

	public void fight() {
		System.out.println(this.toString() + "\n Lets get ready to rumble! PEW PEW PEW ");
	
	}
	
	public void fly() {
		System.out.printf(
				this.getClass().getSimpleName() + "\n Model: " + getModel() + " Speed: " + getSpeedMPH()  + "\n Range: "
						+ getrange() + "\n Price: " + getPrice() + "\n Flight Time %.2f hours " ,
						flightTime());
	}
}
