import static org.hamcrest.CoreMatchers.is;
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
OrganicDog testOrganic1;
	
	@Before
	public void setUp() {
		cageTest = new Cage();
		testOrganic = new OrganicDog("Bill", "");
		testOrganic1 = new OrganicDog("Teng","");
		testRobo = new RoboDog("Mechy", "");
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
	public void shouldBeAbleToGetDogNameByCageNum() {
		cageTest.addToCage(1, testOrganic);
		cageTest.addToCage(2, testRobo);
		String name = cageTest.getCagesByNumber(2).getName();
		assertThat(name, is("Mechy"));
		//System.out.println((cageTest.getCagesByNumber(2)).getName());

	}
	@Test
	public void shouldBeAbleToCleanEachCage() {
		cageTest.addToCage(1, testOrganic);
		cageTest.addToCage(2, testRobo);
		cageTest.addToCage(3, testOrganic1);
		int cage1B4 = cageTest.getWasteLevel(testOrganic);
		System.out.println(cage1B4);
	cageTest.cleanCage(cageTest.getCagesByNumber(1));
	 int cage1After = cageTest.getWasteLevel(testOrganic);
	 System.out.println(cage1After);
	}
	
}
