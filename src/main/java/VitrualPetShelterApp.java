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

		// Game Loop Begins
		while (quit == false) {
			System.out.println("The overall pet's stats are: ");
			System.out.println("Name\t|Happiness\t|Health\t");
			System.out.println("----------------------------");
			for (VirtualPet eachPet : myPet.getAllPets()) {
				System.out.println(
						eachPet.getName() + "\t|" + eachPet.getHappiness() + "       \t|" + eachPet.getHealth());
			}
			// Prints out stats of organic Pets
			System.out.println("Organic Pets Stats ");
			System.out.println("Name\t| Hunger |Thirst");
			myPet.getOrganicStats();

			// Litterbox waste level

			System.out.println("The dog's cage dirt level : ");
			myPet.getCageDirtLevel();

			if (myPet.getLitterBoxDirtLevel() > 10 && myPet.getLitterBoxDirtLevel() < 15) {
				System.out.println("The litterbox is getting stinky");
				System.out.println("The cats litterbox waste level is: " + myPet.getLitterBoxDirtLevel());
			} else if (myPet.getLitterBoxDirtLevel() >= 20) {
				System.out.println("Your cats are starting to look a little sick");
				System.out.println("The cats litterbox waste level is: " + myPet.getLitterBoxDirtLevel());
			}

			if (myPet.getRustLevel() > 5) {
				System.out.println("Your pets might need some oiling");
				System.out.println("The overall rust level is: " + myPet.getRustLevel());
			}

			// User interaction begins
			System.out.println("What would you like to do next?");
			System.out.println(
					"1. Feed Pets\n2. Water Pets\n3. Walk the Dogs \n4. Oil the Robots \n5. Clean the litterbox \n6. Clean a cage"
							+ " \n7. Adopt a Pet \n8. Take in a pet \n9. Play with a pet \n10. Quit");
			int userChoice = input.nextInt();

			// Makes sure user inputs only available choice
			while (userChoice < 1 || userChoice > 10) {
				System.out.println("Please choose from the following numbers: ");
				System.out.println(
						"1. Feed Pets\n2. Water Pets\n3. Walk the Dogs \n4. Oil the Robots \n5. Clean the litterbox \n6. Clean a cage"
								+ "\n7. Adopt a Pet \n8. Take in a pet\n9. Play with a pet \n10. Quit");
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
			// Walking
			else if (userChoice == 3) {
				myPet.walkAllPets();
				System.out.println("All the dogs are excited and exhausted!");
			}
			// Oiling
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
				System.out.println("Do you want to: \n1. Clean them all \n2. Clean by number");
				int cageChoice = input.nextInt();

				// Loops to make sure user inputs correct number
				while (cageChoice < 1 || cageChoice > 2) {
					System.out.println("Please choose between 1 and 2");
					System.out.println("Do you want to: \n1. Clean them all \n2. Clean by number");
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
					System.out.println("Choose by number whose cage you want to clean?:");
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
			}
			// Adopting a pet
			else if (userChoice == 7) {
				System.out.println("Who would you like to adopt?");

				for (VirtualPet eachPet : myPet.getAllPets()) {
					System.out.println(eachPet.getName());
				}

				String petChoice = input.nextLine();
				petChoice = petChoice.substring(0, 1).toUpperCase() + petChoice.substring(1).toLowerCase();
				myPet.removePet(petChoice);
			}

			else if (userChoice == 8) {
				System.out.println("Sure, we'll take a new pet!");
				{

					System.out.println(
							"What kind of pet is it: \n1. Organic Cat \n2. Robotic Cat \n3. Organic Dog \n4. Robotic Dog");
					int petType = input.nextInt();
					input.nextLine();
					switch (petType) {
					case 1:
						System.out.println("Let's choose a name: ");
						String orgCat = input.nextLine();
						orgCat = orgCat.substring(0, 1).toUpperCase() + orgCat.substring(1).toLowerCase();
						System.out.println("Describe " + orgCat + "'s character");
						String description = input.nextLine();
						OrganicCat newCat = new OrganicCat(orgCat, description);
						myPet.addToPets(newCat);
						break;
					case 2:
						System.out.println("Let's choose a name: ");
						String roboCat = input.nextLine();
						roboCat = roboCat.substring(0, 1).toUpperCase() + roboCat.substring(1).toLowerCase();
						System.out.println("Describe " + roboCat + "'s character");
						String roboDescription = input.nextLine();
						RoboCat newRoboCat = new RoboCat(roboCat, roboDescription);
						myPet.addToPets(newRoboCat);
						break;
					case 3:
						System.out.println("Let's choose a name: ");
						String orgDog = input.nextLine();
						orgDog = orgDog.substring(0, 1).toUpperCase() + orgDog.substring(1).toLowerCase();
						System.out.println("Describe " + orgDog + "'s character");
						String dogDescription = input.nextLine();
						OrganicDog newDog = new OrganicDog(orgDog, dogDescription);
						myPet.addToPets(newDog);
						cage.addToCage((cageNum = cageNum + 1), newDog);
						break;
					case 4:
						System.out.println("Let's choose a name: ");
						String robDog = input.nextLine();
						robDog = robDog.substring(0, 1).toUpperCase() + robDog.substring(1).toLowerCase();
						System.out.println("Describe " + robDog + "'s character");
						String roboDogDescription = input.nextLine();
						RoboDog newRDog = new RoboDog(robDog, roboDogDescription);
						myPet.addToPets(newRDog);
						cage.addToCage((cageNum = cageNum + 1), newRDog);
						break;
					default:
						System.out.println("We don't have that option available. Please try another time.");
					}
				}
			} else if (userChoice == 9) {
				System.out.println("Who would you like to play with?");

				for (VirtualPet eachPet : myPet.getAllPets()) {
					System.out.println(eachPet.getName());
				}

				String petChoice = input.nextLine();
				petChoice = petChoice.substring(0, 1).toUpperCase() + petChoice.substring(1).toLowerCase();
				myPet.playWithPet(petChoice);
			}
			// Quit program
			else if (userChoice == 10) {
				System.out.println("Thanks for hanging out and helping out!");
				quit = true;
			}
			// implements changes each loop
			myPet.tick();
		}

	}
}
