

public class VirtualPet {
	
	// Constants
	private static final int DEFAULT_HEALTH = 10;
	private static final int DEFAULT_HAPPINESS = 5;

	// Variables
	private String name;
	protected int health = DEFAULT_HEALTH;
	protected int happiness = DEFAULT_HAPPINESS;
	private String description;

	public VirtualPet(String name, String description) {
		this.name=name;
		this.description= description;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {

		return health;
	}
	
	public String getName() {
		return name;
	}


public String getDescription() {
	return description;
}

public void play() {
	happiness+=2;
	health++;
	
}


	

}
