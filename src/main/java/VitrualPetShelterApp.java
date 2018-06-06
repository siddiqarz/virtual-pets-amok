import java.util.Scanner;

public class VitrualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myPet = new VirtualPetShelter();
		// Initializing types of pets
		RoboDog Bolts = new RoboDog("Bolts", "The Robo Dog");
		RoboCat Whiskey = new RoboCat("Whiskey", "A RoboCat, tail never stops spinning");
		OrganicDog Peago = new OrganicDog("Peago", "Organic Dog: lazy, scaredy cat and fat");
		OrganicCat Kiki = new OrganicCat("Kiki", "Organic kitty: mischievous, tiny and fiesty");
		OrganicCat Tom = new OrganicCat("Tom", "Always bored");

		// Adding Dogs to cages
		Cage cage = new Cage();
		int cageNum = 0;
		cage.addToCage(cageNum += 1, Bolts);
		cage.addToCage(cageNum += 1, Peago);

		// Adding Pets to shelter
		myPet.addToPets(Bolts);
		myPet.addToPets(Whiskey);
		myPet.addToPets(Peago);
		myPet.addToPets(Kiki);
		myPet.addToPets(Tom);

		System.out.println("Welcome to Crazy Animals Pet Shelter!");
		Boolean quit = false;

		while (quit == false) {
			System.out.println("The overall pet's stats are: ");
			System.out.println("Name\t|Happiness\t|Health\t");
			System.out.println("----------------------------");
			for (VirtualPet eachPet : myPet.getAllPets()) {
				System.out.println(
						eachPet.getName() + "\t|" + eachPet.getHappiness() + "       \t|" + eachPet.getHealth());
			}
			// Prints out stats of organic Pets
			System.out.println("Organic Pets Stats Are: ");
			System.out.println("Name\t| Hunger |Thirst");
			myPet.getOrganicStats();

			// Litterbox waste level
			System.out.println("The cats litterbox waste level is: ");
			System.out.println(myPet.getLitterBoxDirtLevel());
			if (myPet.getLitterBoxDirtLevel() > 5 && myPet.getLitterBoxDirtLevel() < 8) {
				System.out.println("The litterbox is getting stinky");
			} else if (myPet.getLitterBoxDirtLevel() >= 8) {
				System.out.println("Your cats are starting to look a little sick");
			}

			// User interaction begins
			System.out.println("What would you like to do next?");
			System.out.println(
					"1. Feed Pets\n2. Water Pets\n3. Walk the Dogs \n4. Oil the Robots \n5. Clean the litterbox \n6. Clean a cage \n7. Quit");
			int userChoice = input.nextInt();

			// Game loop begins
			while (userChoice < 1 || userChoice > 7) {
				System.out.println("Please choose from the following numbers: ");
				System.out.println(
						"1. Feed Pets\n2. Water Pets\n3. Walk the Dogs \n4. Oil the Robots t\n5. Clean the litterbox t\n6. Clean a cage\n7. Quit");
				userChoice = input.nextInt();
			}
			input.nextLine();
			// Feeding
			if (userChoice == 1) {
				System.out.println("Ok, let's feed all pets!");
				myPet.feedAllPets();
				System.out.println("Organic Pets Stats Are: ");
				System.out.println("Name\t| Hunger |Thirst");
				myPet.getOrganicStats();
			}
			// Watering
			else if (userChoice == 2) {
				System.out.println("Don't slosh all the water!");
				myPet.waterAllPets();
				System.out.println("Organic Pets Stats Are: ");
				System.out.println("Name\t| Hunger|Thirst");
				myPet.getOrganicStats();
			} 
			//Walking
			else if (userChoice == 3) {
				myPet.walkAllPets();
				System.out.println("All the dogs are excited and exhausted!");
			} 
			//Oiling
			else if (userChoice == 4) {
				myPet.oilAllPets();
				System.out.println("The Robo Rust Level is now: ");
				System.out.println(myPet.getRustLevel());
				System.out.println("Rust be gone!");
			} 
			
			else if (userChoice == 5) {
				myPet.cleanLitterBox();
				System.out.println("Mmmm, puuurr-fect!");
			} else if (userChoice == 6) {
				// Prints out initial level of dirt
				System.out.println("The cage dirt level is: ");
				myPet.getCageDirtLevel();

				// inquires whose cage user wants to clean. All roboDog cages do not require
				// cleaning.
				System.out.println("Do you want to: \n1. clean them all \n2. Clean by number");
				int cageChoice = input.nextInt();

				// Loops to make sure user inputs correct number
				while (cageChoice < 1 || cageChoice > 2) {
					System.out.println("Please choose between 1 and 2");
					System.out.println("Do you want to: \n1. clean them all \n2. Clean by number");
					cageChoice = input.nextInt();
				}
				// cleaning all cages
				if (cageChoice == 1) {
					myPet.cleanAllCages();
					System.out.println("All scrubbed!");
					System.out.println("The cage dirt level is: ");
					myPet.getCageDirtLevel();
				}

				// cleaning by cage choice
				else if (cageChoice == 2) {
					System.out.println("Whose cage do you want to clean?:");
					int i = 1;
					while (i <= cageNum) {
						System.out.println("cage " + i + " " + cage.getCagesByNumber(i).getName());
						i++;
					}

					int number = input.nextInt();
					cage.cleanCage(cage.getCagesByNumber(number));
					System.out.println("The cage dirt level is now: ");
					myPet.getCageDirtLevel();
				}
			} else if (userChoice == 7) {
				System.out.println("Thanks for hanging out and helping out!");
				quit = true;
			}
			myPet.tick();
		}
		input.close();
	}
}