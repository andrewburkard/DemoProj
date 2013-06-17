package Group.DemoProj;

import java.util.Set;

import junit.framework.TestCase;

public class ShowTest extends TestCase
{

	public void testAllPets()
	{
		// Create a show with 5 cats, 4 dogs
		Show show = new Show(5, 4, 20);
		
		Set<String> pets = show.allPets();
		assertTrue(pets.contains("C1"));
		assertFalse(pets.contains("C0"));
		assertTrue(pets.contains("D4"));
		assertFalse(pets.contains("D5"));
	}

}
