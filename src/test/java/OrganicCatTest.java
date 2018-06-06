import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OrganicCatTest {

	OrganicCat testOrgCat;
	OrganicCat testOrgCat2;
	OrganicDog testOrgDog;
	VirtualPetShelter testPet;

	@Before
	public void setUp() {
		testOrgCat = new OrganicCat("Joe", "");
		testOrgDog = new OrganicDog("Moe", "");
		testOrgCat2 = new OrganicCat("Fluffy", "");
		testPet = new VirtualPetShelter();
	}

	@Test
	public void shouldBeAbleToReturnCatName() {
		testOrgCat.getName();
		assertEquals(testOrgCat.getName(), "Joe");
	}

	@Test
	public void shouldBeAbleToReturnWasteLevel() {
		int catWaste = testOrgCat.getWasteLevel();
		assertEquals(catWaste, 3);

	}

	@Test
	public void shouldBeAbleToReturnHappinessLevel() {
		int catJoy = testOrgCat.getHappiness();
		assertEquals(catJoy, 5);

	}

	@Test
	public void OrgDogShouldBeAbleToGetWasteLevel() {
		int dogWaste = testOrgDog.getWasteLevel();
		assertEquals(dogWaste, 4);
	}

	@Test
	public void shouldBeAbleToFeedEachCat() {
		testPet.addToPets(testOrgCat);
		testPet.addToPets(testOrgCat2);
		int hungerBefore = testOrgCat.getHungerLevel();
		testOrgCat.feedPet();
		int hungerAfter = testOrgCat.getHungerLevel();
		assertTrue(hungerBefore > hungerAfter);
		assertEquals(hungerAfter, 0);

	}

	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		testPet.addToPets(testOrgCat);
		testPet.addToPets(testOrgCat2);
		testPet.addToPets(testOrgDog);
		int hungerLevelDogBefore = testOrgDog.getHungerLevel();
		int hungerLevelCatBefore = testOrgCat.getHungerLevel();
		testPet.feedAllPets();
		int hungerLevelCatAfter = testOrgCat.getHungerLevel();
		int hungerLevelDogAfter = testOrgDog.getHungerLevel();
		assertEquals(hungerLevelDogBefore, 1);
		assertEquals(hungerLevelDogAfter,0);
		assertEquals(hungerLevelCatBefore-1, hungerLevelCatAfter);
	}

}