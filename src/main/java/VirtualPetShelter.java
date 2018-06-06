import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addToPets(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	// Getters
	public void getOrganicStats() {
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicPetActivities) {
				System.out.println(eachPet.getName() + " \t|" + ((OrganicPetActivities) eachPet).getHungerLevel()
						+ "    \t|" + ((OrganicPetActivities) eachPet).getThirstLevel());
			}

		}
	}

	public int getLitterBoxDirtLevel() {
		int waste = 0;
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicCat) {
				waste = waste + ((OrganicCat) eachPet).getWasteLevel();
			}
		}
		return waste;
	}

	public void getCageDirtLevel() {
		int waste = 0;
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof Dog) {
				System.out.println(eachPet.getName() + " " + ((Dog) eachPet).getWasteLevel());
			}
		}

	}

	public int getRustLevel() {
		int rust = 0;
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof RoboticInterface) {
				rust = ((RoboticInterface) eachPet).getRustLevel();
			}
		}
		return rust;
	}

	// Accessors
	public void oilAllPets() {
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof RoboticInterface) {
				((RoboticInterface) eachPet).oilPet();
			}
		}

	}

	public void waterAllPets() {

		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicPetActivities) {
				((OrganicPetActivities) eachPet).waterPet();
			}
		}

	}

	public void feedAllPets() {
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicPetActivities) {
				((OrganicPetActivities) eachPet).feedPet();
			}
		}
	}

	public void walkAllPets() {
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof Dog) {
				((Dog) eachPet).walkDog();
			}
		}
	}

	public void cleanLitterBox() {

		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicCat) {
				((OrganicCat) eachPet).cleanLitterBox();
			}
		}
	}

	public void cleanAllCages() {

		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicDog) {
				((OrganicDog) eachPet).cleanCages();
			}
		}
	}

	public void tick() {
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof OrganicPetActivities) {
				((OrganicPetActivities) eachPet).tickOrganics();
			} else if (eachPet instanceof RoboticInterface) {
				((RoboticInterface) eachPet).tickRobotics();
			}
		}

	}
}