import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OrganicCatTest {

		OrganicCat testOrgCat;
		OrganicDog testOrgDog;

		@Before
		public void setUp() {
			testOrgCat = new OrganicCat("Joe");
			testOrgDog = new OrganicDog("Moe");
		}
		@Test
		public void shouldBeAbleToReturnCatName() {
			testOrgCat.getName();
			assertEquals(testOrgCat.getName(),"Joe");
	}
		@Test
		public void shouldBeAbleToReturnWasteLevel() {
			int catWaste = testOrgCat.getWasteLevel();
			assertEquals(catWaste, 1);
			
		}
		@Test
		public void shouldBeAbleToReturnHappinessLevel() {
			int catJoy = testOrgCat.getHappiness();
			assertEquals(catJoy, 5);
			
		}
		@Test
		public void OrgDogShouldBeAbleToGetWasteLevel() {
			int dogWaste = testOrgDog.getWasteLevel();
			assertEquals(dogWaste, 5);
		}
}