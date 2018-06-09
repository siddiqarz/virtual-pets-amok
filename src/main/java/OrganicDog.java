
public class OrganicDog extends Dog implements OrganicPetActivities {
	private static final int DEFAULT_THIRST_LEVEL = 1;
	private static final int DEFAULT_HUNGER_LEVEL = 1;
	private static final int DEFAULT_WASTE_LEVEL = 4;
	protected int hungerLevel = DEFAULT_HUNGER_LEVEL;
	protected int thirstLevel = DEFAULT_THIRST_LEVEL;
	protected int wasteLevel = DEFAULT_WASTE_LEVEL;

	public OrganicDog(String name, String description) {
		super(name, description);
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
		return thirstLevel;
	}

	public void walkDog() {
		super.walkDog();
		wasteLevel -= 5;
		hungerLevel += 3;
	}

	public void cleanCages() {

		wasteLevel = 0;
		happiness+=5;
	}

	@Override
	public void feedPet() {
		hungerLevel = 0;
		wasteLevel += 3;

	}

	@Override
	public void waterPet() {
		thirstLevel = 0;
	}

	@Override
	public void tickOrganics() {
		//changes over time/gameloop
		thirstLevel += 2;
		wasteLevel += 2;
		happiness -= 2;

		if (thirstLevel > 10) {
			thirstLevel = 10;
		}
		if (thirstLevel < 0) {
			thirstLevel = 0;
		}
		hungerLevel += 2;
		if (hungerLevel > 10) {
			health -= 2;
			hungerLevel = 10;
		}

		if (happiness < 0) {
			happiness = 0;
		}
		if (happiness > 10) {
			health += 1;
			happiness = 10;
		}
	}
}
