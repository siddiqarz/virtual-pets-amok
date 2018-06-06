import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {
	VirtualPet testVirtualPet;
	OrganicPetActivities testOrgCat;

	@Before
	public void setUp() {
		testVirtualPet = new VirtualPet("", "");
		testOrgCat = new OrganicCat("Joe", "");
	}

	@Test
	public void shouldBeAbleToReturnOverAllHappiness() {
		testVirtualPet.getHappiness();
		assertEquals(testVirtualPet.getHappiness(), 1);
	}

	@Test
	public void shouldBeAbleToGetHealth() {
		assertEquals(testVirtualPet.getHealth(), 2);
	}
	
	
}
