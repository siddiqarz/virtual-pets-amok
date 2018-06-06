import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoboPetTest {
	RoboCat testRoboCat;
	RoboDog testRoboDog;
	VirtualPetShelter virtualPet;
	OrganicDog testODog;
	VirtualPet underTest;

	@Before
	public void setUp() {
		testRoboCat = new RoboCat("Joe");
		testRoboDog = new RoboDog("Moe");
		virtualPet = new VirtualPetShelter();
		testODog = new OrganicDog("Sparky");
		underTest = new VirtualPet("j");
	}

	@Test
	public void shouldBeAbleToReturnRoboCatName() {
		String catName = testRoboCat.getName();
		assertEquals(catName, "Joe");
	}

	@Test
	public void shouldBeAbleToReturnRustLevel() {
		int rustLevel = testRoboDog.getRustLevel();
		assertEquals(rustLevel, 4);
	}

	@Test
	public void shouldBeAbleToReturnCatRustLevel() {
		int rustLevel = testRoboCat.getRustLevel();
		assertEquals(rustLevel, 2);
	}

	@Test
	public void shouldBeAbleToOilEachRoboPets() {
		testRoboCat.oilPet();
		testRoboDog.oilPet();
		int rustLevelDog = testRoboDog.getRustLevel();
		int rustLevel = testRoboCat.getRustLevel();
		assertEquals(rustLevelDog, 3);
		assertEquals(rustLevel, 0);
	}

	@Test
	public void shouldBeAbleToOilAllRoboPets() {
		virtualPet.addToPets(testRoboCat);
		virtualPet.addToPets(testRoboDog);
		virtualPet.oilAllPets();
		int rustLevelAfter = testRoboDog.getRustLevel();
		int catRustAfter = testRoboCat.getRustLevel();
		assertEquals(rustLevelAfter, 3);
		assertEquals(catRustAfter, 0);

	}

	@Test
	public void shouldBeAbleToWalkRoboDog() {
		virtualPet.addToPets(testRoboDog);
		int HappinessBefore = testRoboDog.getHappiness();
		testRoboDog.walkDog();
		assertEquals(testRoboDog.getHappiness(), HappinessBefore + 5);
	}

	@Test
	public void shouldBeAbleToWalkOrganicDog() {
		virtualPet.addToPets(testODog);
		virtualPet.addToPets(testRoboDog);
		virtualPet.addToPets(testRoboCat);
		int catBefore = testRoboCat.getHappiness();
		int roboBefore = testRoboDog.getHappiness();
		int oDogBefore = testODog.getHappiness();
		virtualPet.walkAllPets();
		int catAfter = testRoboCat.getHappiness();
		int roboAfter = testRoboDog.getHappiness();
		int oDogAfter = testODog.getHappiness();

		assertEquals(catBefore, catAfter);
		assertEquals(oDogBefore + 5, oDogAfter);
		assertEquals(roboBefore + 5, roboAfter);

	}
}
