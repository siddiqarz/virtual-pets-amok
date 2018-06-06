
public interface OrganicPetActivities {

	// Getters
	int getWasteLevel();

	int getHungerLevel();

	int getThirstLevel();

	void feedPet();
	void waterPet();

	void tickOrganics();
}