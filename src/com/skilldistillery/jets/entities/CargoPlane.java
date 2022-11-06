package com.skilldistillery.jets.entities;

public class CargoPlane  extends Jet implements LoadCargo {

	
	public CargoPlane(String model, int speedMPH, int range, long price) {
		super(model, speedMPH, range, price);
		// TODO Auto-generated constructor stub
	}

	public void loadCargo() {
		
		System.out.println(this.toString() + "\n Please wait, cargo load in progress! ");
	}

	public void fly() {
		System.out.printf(
				this.getClass().getSimpleName() + "\n Model: " + getModel() + " Speed: " + getSpeedMPH()  + "\n Range: "
						+ getrange() + "\n Price: " + getPrice() + "\n Flight Time %.2f hours" ,
						flightTime());

}
}
