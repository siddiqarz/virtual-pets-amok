

public class Dog extends VirtualPet {

	public Dog(String name, String description) {
		super(name, description);
	}


	public void walkDog() {
		happiness += 5;
	}

}
