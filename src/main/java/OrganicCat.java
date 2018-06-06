
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
		happiness +=2;
	}

	@Override
	public void feedPet() {
		hungerLevel = 0;
		happiness +=1;
		wasteLevel++;
	}

	@Override
	public void waterPet() {
thirstLevel = 0;		
	}

	@Override
	public void tickOrganics() {
		thirstLevel +=2;
		hungerLevel +=2;
		if (hungerLevel>6) {
			health-=3;
		}
		wasteLevel +=2;
		if(wasteLevel>7) {
			health --;
			happiness--;
		}
		happiness -=2;
		
	}
}
