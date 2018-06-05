
public class OrganicDog extends VirtualPet implements OrganicPetActivities {

	public OrganicDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getWasteLevel() {
		
		return 5;
	}

	@Override
	public int getHungerLevel() {
		
		return 0;
	}

	@Override
	public int getThirstLevel() {
		return 0;
	}

}
