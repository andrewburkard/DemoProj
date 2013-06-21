package Group.DemoProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

public class ShowTest extends TestCase
{

    private Show show;
    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        show = new Show(5,4,20);
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        show = null;
    }

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

	public void testAddViewer()
	{
	    Viewer viewer = new Viewer();
	    show.addViewer(viewer);
	    assertTrue(show.getViewers().contains(viewer));
	}

	public void testGetAndSetViewers()
	{
	    List<Viewer> viewers = new ArrayList<Viewer>();
	    show.setViewers(viewers);
	    assertEquals(viewers, show.getViewers());
	}

	public void testGetAndSetnCats()
	{
	    show.setnCats(42);
        assertEquals(42, show.getnCats());
	}

	public void testGetAndSetnDogs()
    {
	    show.setnDogs(42);
        assertEquals(42, show.getnDogs());
    }

	public void testGetAndSetnViewers()
    {
	    show.setnViewers(42);
        assertEquals(42, show.getnViewers());
    }
}
