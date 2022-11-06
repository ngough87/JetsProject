package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;

//User Story #1

public class JetsApplication  {
	
	Scanner sc = new Scanner(System.in);
		

	public Airfield af;

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
		
		
	}


	public void launch() {
		af = new Airfield();
		showMenu();
		af.createFleet();
		
	
	}
			
		public void showMenu(){
			System.out.println("\n ######  Fleet Options ########");
			System.out.println("1. List Fleet"             );
			System.out.println("2. Fly all jets"           );
			System.out.println("3. View fastest jet"       );
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets"    );
			System.out.println("6. Dogfight!"              );
			System.out.println("7. Add a jet to fleet"     );
			System.out.println("8. Remove jet from flee"   );
			System.out.println("9. Quit"                 	  );
			System.out.println(" ###############################");
			int choice = sc.nextInt();
			
			switch (choice) {
			default: 
				System.out.println("That is not an option. Try again. ");
				showMenu();
				break;
			case 1: 
				af.listAllFleet();
				System.out.println(af.listAllFleet());
			
				showMenu();
				break;
			case 2:
				af.fly();
				showMenu();
				break;
			
			case 3: 
				af.showFastestJet();
				showMenu();
				break;
			case 4:
				af.longestRange();
				showMenu();
				break;
			case 5:
				af.loadCargo();
				showMenu();
				break;
			case 6:
				af.fight();
				showMenu();
				break;
			case 7:
				af.addJet();
				showMenu();
				break;
			case 8:
				af.removeJet();
				showMenu();
				break;
			case 9:
				af.quitProgram();
				break;
				
			
			}
		
		}
		}



	
		

	

	

		
	
	
		

	


		
			
	
			




		


