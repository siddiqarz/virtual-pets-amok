
public class OrganicCat extends VirtualPet implements OrganicPetActivities {
	private static final int DEFAULT_THIRST_LEVEL = 1;
	private static final int DEFAULT_HUNGER_LEVEL = 1;
	private static final int DEFAULT_WASTE_LEVEL = 3;
	protected int wasteLevel = DEFAULT_WASTE_LEVEL;
	protected int hungerLevel = DEFAULT_HUNGER_LEVEL;
	protected int thirstLevel = DEFAULT_THIRST_LEVEL;
	
	public OrganicCat(String name) {
		super(name);
	}

	// Getters
	/* (non-Javadoc)
	 * @see OrganicPetActivities#getWasteLevel()
	 */
	@Override
	public int getWasteLevel() {
		return wasteLevel ;
	}

	/* (non-Javadoc)
	 * @see OrganicPetActivities#getHungerLevel()
	 */
	@Override
	public int getHungerLevel() {
		return hungerLevel ;
	}

	/* (non-Javadoc)
	 * @see OrganicPetActivities#getThirstLevel()
	 */
	@Override
	public int getThirstLevel() {
		return thirstLevel ;
	}
	
	public void cleanLitterBox() {
		wasteLevel-=3;
	}
}

