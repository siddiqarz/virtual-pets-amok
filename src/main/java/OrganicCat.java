
public class OrganicCat extends VirtualPet implements OrganicPetActivities {
	private static final int DEFAULT_THIRST_LEVEL = 1;
	private static final int DEFAULT_HUNGER_LEVEL = 1;
	private static final int DEFAULT_WASTE_LEVEL = 3;
	protected int wasteLevel = DEFAULT_WASTE_LEVEL;
	protected int hungerLevel = DEFAULT_HUNGER_LEVEL;
	protected int thirstLevel = DEFAULT_THIRST_LEVEL;

	public OrganicCat(String name, String description) {
		super(name, description);
	}

	// Getters
	/*
	 * (non-Javadoc)
	 * 
	 * @see OrganicPetActivities#getWasteLevel()
	 */
	@Override
	public int getWasteLevel() {
		return wasteLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see OrganicPetActivities#getHungerLevel()
	 */
	@Override
	public int getHungerLevel() {
		return hungerLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see OrganicPetActivities#getThirstLevel()
	 */
	@Override
	public int getThirstLevel() {
		return thirstLevel;
	}

	public void cleanLitterBox() {
		wasteLevel = 0;
		happiness += 4;
	}

	@Override
	public void feedPet() {
		hungerLevel = 0;
		happiness += 5;
		wasteLevel++;
	}

	@Override
	public void waterPet() {
		thirstLevel = 0;
	}

	@Override
	public void tickOrganics() {
		
		//changes over time/game loop
		thirstLevel += 2;
		wasteLevel += 2;
		happiness -= 1;
		hungerLevel += 2;


		if (thirstLevel > 10) {
			thirstLevel = 10;
		}
		if (thirstLevel < 0) {
			thirstLevel = 0;
		}

		if (hungerLevel > 6) {
			health -= 3;
		}
		if (hungerLevel > 10) {
			hungerLevel = 10;
		}
		if (hungerLevel < 0) {
			hungerLevel = 0;
		}

		if (wasteLevel > 7) {
			health--;
			happiness--;
		}
		if (health > 10) {
			health = 10;
		}
		if (happiness >10) {
			happiness = 10;
		}
		if(happiness <0) {
			happiness = 0;
		}

	}
}
