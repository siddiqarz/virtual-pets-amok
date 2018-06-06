

public class Dog extends VirtualPet {

	 protected int wasteLevel;


	public Dog(String name, String description) {
		super(name, description);
	
	}


	public void walkDog() {
		happiness += 5;
		
	}


	public int getWasteLevel() {
	
		return wasteLevel;
	}

}
