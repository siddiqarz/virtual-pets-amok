import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class CageTest {
Cage cageTest;
OrganicDog testOrganic;
RoboDog testRobo;
	
	@Before
	public void setUp() {
		cageTest = new Cage();
		testOrganic = new OrganicDog("Bill");
		testRobo = new RoboDog("Mechy");
}
	@Test
	public void shouldBeAbleToAddDogsToCage() {

		cageTest.addToCage(1, testOrganic);
		cageTest.addToCage(2, testRobo);
		Collection <Dog> cages = cageTest.getAllCages();
	assertThat(cages, containsInAnyOrder(testRobo,testOrganic));
//	System.out.println(cageTest.getAllCages());		
	}
	
	@Test
	public void shouldBeAbleToGetCageNum() {
		cageTest.addToCage(1, testOrganic);
		cageTest.addToCage(2, testRobo);
		cageTest.getCagesByNumber(2);
		System.out.println((cageTest.getCagesByNumber(2)).getName());

	}
}
