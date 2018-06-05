import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addToPets(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);
	}

public Collection<VirtualPet> getAllPets(){
	return pets.values();
}
}