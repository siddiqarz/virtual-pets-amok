import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoboPetTest {
	RoboCat testRoboCat;
	RoboDog testRoboDog;

	@Before
	public void setUp() {
		testRoboCat = new RoboCat("Joe");
		testRoboDog = new RoboDog("Moe");
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
		System.out.println(rustLevel);
		assertEquals(rustLevel, 2);
	}
	@Test
	public void shouldBeAbleToOilAllRoboPets() {
		testRoboCat.oilAllPets();
		testRoboDog.oilAllPets();
		int rustLevelDog = testRoboDog.getRustLevel();
		int rustLevel = testRoboCat.getRustLevel();
		assertEquals(rustLevelDog,3);
		assertEquals(rustLevel,0);
	}
}
