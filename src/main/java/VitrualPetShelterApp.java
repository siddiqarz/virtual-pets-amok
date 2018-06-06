import java.util.Scanner;

public class VitrualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myPet = new VirtualPetShelter();

		VirtualPet Bolts = new VirtualPet("Bolts", " A RoboDog");
		VirtualPet Whiskey = new VirtualPet("Whiskey", "A RoboCat, tail never stops spinning");
		VirtualPet Peago = new VirtualPet("Peago", "Organic Dog: lazy, scaredy cat and fat");
		VirtualPet Kiki = new VirtualPet("Kiki", "Organic kitty: mischievous, tiny and fiesty");
		myPet.addToPets(Bolts);
		myPet.addToPets(Whiskey);
		myPet.addToPets(Peago);
		myPet.addToPets(Kiki);
		System.out.println("Welcome to Crazy Animals Pet Shelter!");
		Boolean quit = false;
		while (quit == false) {
			System.out.println("The overall pet's stats are: ");
			System.out.println("Name\t|Happiness\t|Health\t");
			System.out.println("----------------------------");
			for (VirtualPet eachPet : myPet.getAllPets()) {
				System.out.println(eachPet.getName() + "\t|" + eachPet.getHappiness() + "       \t|" + eachPet.getHealth());
			}
			quit = true;
		}
		input.close();
	}
}