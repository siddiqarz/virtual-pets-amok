import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cage {
	Map<Integer, Dog> cages = new HashMap<Integer, Dog>();

	public void addToCage(int cageNum, Dog dog) {
		cages.put(cageNum, dog);
	}

	public Collection<Dog> getAllCages() {
		return cages.values();
	}

	public int getSize() {
		return cages.size();
	}
	
public Dog getCagesByNumber(int cageNum) {
	return cages.get(cageNum);
}

public void cleanCage(Dog cagesByNumber) {
	for (Dog eachDog : getAllCages()) {
		if(eachDog instanceof OrganicDog) {
			((OrganicDog) eachDog).cleanCages();
		}
	}
	
}
public int getWasteLevel(Dog cagesByNumber) {
	int waste =0;
	for (Dog eachDog : getAllCages()) {
		if(eachDog instanceof OrganicDog) {
		waste =	((OrganicDog) eachDog).getWasteLevel();
		}
	}
	return waste;
}

}