import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest { // emplo
	OrganicCat testOrgCat;
	OrganicDog testOrgDog;
	RoboDog testRoboDog;
	RoboCat testRoboCat;
	VirtualPetShelter testShelter; // hosp
	

	@Before
	public void setUp() {
		
		testOrgCat = new OrganicCat("Bonnie", "");
		testShelter = new VirtualPetShelter();
		testOrgDog = new OrganicDog("Rover", "");
		testRoboDog = new RoboDog("juju", "");
		testRoboCat = new RoboCat("whiskers", "");
		
	}

	@Test
	public void shouldBeAbleToAddCatToPetShelter() {
		testShelter.addToPets(testOrgCat);
		Collection<VirtualPet> check = testShelter.getAllPets();
		// assert
		assertThat(check, contains(testOrgCat));
	}
	@Test
	public void shouldBeAbleToAddDiffKinds() {
		testShelter.addToPets(testOrgCat);
		testShelter.addToPets(testOrgDog);
		testShelter.addToPets(testRoboDog);
		testShelter.addToPets(testRoboCat);
		Collection<VirtualPet> check = testShelter.getAllPets();
		assertThat(check, containsInAnyOrder(testOrgCat,testOrgDog,testRoboDog, testRoboCat));
		
	}
	@Test
	public void thirstShoulChangeWithTick() {
		testShelter.addToPets(testOrgCat);
		testShelter.addToPets(testRoboDog);
		int thirstBefore = testOrgCat.getThirstLevel();
	testShelter.tick();
	int thirstAfter = testOrgCat.getThirstLevel();
	assertTrue(thirstBefore<thirstAfter);
	}
	@Test
	public void shouldBeAbleToRemovePetByName() {
		testShelter.addToPets(testOrgCat);
		testShelter.addToPets(testRoboDog);
		int sizeBefore = testShelter.getSize();
		testShelter.removePet("juju");
		int sizeAfter = testShelter.getSize();
		assertEquals(sizeBefore-1,sizeAfter);
		testShelter.removePet("Bonnie");
		assertEquals(testShelter.getSize(),0);
	}
}
