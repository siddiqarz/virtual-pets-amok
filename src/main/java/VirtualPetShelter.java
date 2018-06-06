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

	public void oilAllPets() {
		for (VirtualPet eachPet : getAllPets()) {
			if (eachPet instanceof RoboticInterface) {
				((RoboticInterface) eachPet).oilPet();
			}
		}

	}
public void feedAllPets() {
	for(VirtualPet eachPet: getAllPets()) {
		if(eachPet instanceof OrganicPetActivities) {
			((OrganicPetActivities) eachPet).feedPet();
		}
	}
}
public void walkAllPets() {
	for(VirtualPet eachPet : getAllPets()) {
		if(eachPet instanceof Dog) {
			((Dog) eachPet).walkDog();
		}
	}
}
}