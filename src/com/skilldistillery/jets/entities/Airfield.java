package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Jet> fleet = new ArrayList<>();
	private static final String FIGHTER_JET = "FighterJet";
	private static final String SPY_JET = "SpyJet";
	private static final String CARGO_PLANE = "CargoPlane";
	private static final String UNMANNED_JET = "UnmannedJet";
	private static final String PASSENGER_JET = "PassengerJet";

	// User Story #2
	public Airfield() {

		this.fleet = createFleet();

	}

	// User Story #3

	public ArrayList<Jet> createFleet() {
		ArrayList<Jet> returnList = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetFeatures = line.split(",");

				// String type = jetFeatures[0];
				String model = jetFeatures[0];

				String jetName = jetFeatures[0];
				int speedMPH = Integer.parseInt(jetFeatures[1]);
				int range = Integer.parseInt(jetFeatures[2]);
				long price = Long.parseLong(jetFeatures[3]);
				Jet jet = new FighterJet(jetName, speedMPH, range, price);
				String type = null;

				switch (model) {

				case FIGHTER_JET:
					returnList.add(new FighterJet(model, speedMPH, range, price));
					break;

				case SPY_JET:
					returnList.add(new SpyJet(model, speedMPH, range, price));
					break;

				case CARGO_PLANE :
					returnList.add(new CargoPlane(model, speedMPH, range, price));
					break;
				case UNMANNED_JET :
					returnList.add(new UnmannedJet(model, speedMPH, range, price));
					break;
				case PASSENGER_JET:
					returnList.add(new PassengerJet(model, speedMPH, range, price));
					break;

				}

			}
		}

		catch (IOException e) {
			System.err.println(e);
		}
//			System.out.println(line);

		return returnList;
	}

	// User Story #5
	public String listAllFleet() {
		String returnList = "";
		for (Jet j : fleet) {
			returnList += j.toString() + "/n";
		}
		return returnList;
	}

	// User Story #6
	public void fly() {
		for (Jet j : fleet) {
			
			j.fly();

		}
	}

	// User Story #7
	public void showFastestJet() {
		Jet fastestJet = fleet.get(0);
		for (Jet j : fleet) {
			if (fastestJet.getSpeedMPH() < j.getSpeedMPH()) {
				fastestJet = j;
			}

		}
		System.out.println("The fastest jet in the fleet is: ");
		System.out.println(fastestJet);
		System.out.println();

	}

	public void longestRange() {
		Jet longestRange = fleet.get(0);
		for (Jet j : fleet) {
			if (longestRange.getrange() < j.getrange())
				;
			longestRange = j;
		}

		System.out.println("The jet with the longest range is: ");
		System.out.println(longestRange);
		System.out.println();
	}

	public void loadCargo() {
		int counter = 0;
		for (Jet j : fleet) {
			if (j instanceof CargoPlane) {
				System.out.println(j);
				((CargoPlane) j).loadCargo();
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Sorry, currently no cargo planes available.");
		}
	}

	public void fight() {
		int counter =0;
		for (Jet j : fleet) {
			if (j instanceof Fight) {
				((Fight)j).fight();
				counter++;
			}
			if (counter == 0) {
				System.out.println("Sorry, currently no fighters available.");
			}
		}
	}

	// User Story #9

	public void addJet() {

		CargoPlane newJet = new CargoPlane("jets.txt", 0, 0, 0);

		System.out.println("Please enter model:");
		String model = sc.next();
		newJet.setModel(model);
		sc.nextLine();

		System.out.println("Please enter speed:");
		int speed = sc.nextInt();
		newJet.setSpeedMPH(speed);
		sc.nextLine();

		System.out.println("Please enter range:");
		int range = sc.nextInt();
		newJet.setrange(range);
		sc.nextLine();

		System.out.println("Please enter price:");
		long price = sc.nextLong();
		newJet.setPrice(price);
		sc.nextLine();

		addJetToFleet(newJet);
	}

	private void addJetToFleet(CargoPlane newJet) {
		fleet.add(newJet);
	}

	// User Story #10

	public void removeJet() {
		System.out.println("Which jet would you like to remove: ");
		System.out.println(listAllFleet());
		System.out.println();
		System.out.println("Starting with zero, enter coresponding number to jet 'model' name in list: ");
		int idx = Integer.parseInt(sc.next().toString());
		fleet.remove(idx);
		System.out.println("Remaining jets in fleet: ");
		listAllFleet();

	}

	// User Story #11
	public void quitProgram() {
		System.out.println("Thank you for visiting our fleet, goodbye! ");

		sc.close();
	}
}
