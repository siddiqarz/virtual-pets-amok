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
}