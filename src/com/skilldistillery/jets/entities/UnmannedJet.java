package com.skilldistillery.jets.entities;

public class UnmannedJet extends Jet {

	public UnmannedJet(String model, int speedMPH, int range, long price) {
		super(model, speedMPH, range, price);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.printf(
				this.getClass().getSimpleName() + "\n Model: " + getModel() + " Speed: " + getSpeedMPH()  + "\n Range: "
						+ getrange() + "\n Price: " + getPrice() + "\n Flight Time %.2f hours ",
						flightTime());

}


}
