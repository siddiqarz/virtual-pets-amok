
public class OrganicDog extends Dog implements OrganicPetActivities {
	private static final int DEFAULT_THIRST_LEVEL = 1;
	private static final int DEFAULT_HUNGER_LEVEL = 1;
	private static final int DEFAULT_WASTE_LEVEL = 4;
	protected int hungerLevel = DEFAULT_HUNGER_LEVEL;
	protected int thirstLevel = DEFAULT_THIRST_LEVEL;
	protected int wasteLevel = DEFAULT_WASTE_LEVEL;

	public OrganicDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getWasteLevel() {
		return wasteLevel;
	}

	@Override
	public int getHungerLevel() {

		return hungerLevel;
	}

	@Override
	public int getThirstLevel() {
		return 0;
	}

	public void walkDog() {
		super.walkDog();
		wasteLevel -= 5;
	}

	public void cleanCages() {

	}

	@Override
	public void feedPet() {
		hungerLevel = 0;
	}

}
