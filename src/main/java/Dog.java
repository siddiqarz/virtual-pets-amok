import java.util.HashMap;
import java.util.Map;

public class Dog extends VirtualPet {

	public Dog(String name) {
		super(name);
	}


	public void walkAllDogs() {
		happiness += 5;
	}

}
