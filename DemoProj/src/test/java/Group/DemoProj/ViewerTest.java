package Group.DemoProj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

public class ViewerTest extends TestCase
{

	public void testViewer()
	{
		String a = "D4";
		String b = "C23";
		Viewer viewer = new Viewer(a, b);
		assertEquals(a, viewer.getFavorite());
		assertEquals(b, viewer.getThrowOut());
	}

	public void testGetandSetFavorite()
	{
		Viewer viewer = new Viewer();
		viewer.setFavorite("D3");
		assertEquals("D3", viewer.getFavorite());
	}

	public void testGetandSetThrowOut()
	{
		Viewer viewer = new Viewer();
		viewer.setThrowOut("C5");
		assertEquals("C5", viewer.getThrowOut());
	}

	/**
	 * Tests the case where the list of eliminated pets includes the favorite
	 * and throwOut.
	 */
	public void testIsSatisfiedByEliminatingBoth()
	{
		Viewer viewer = new Viewer("C1", "D2");
		Set<String> eliminatedPets = new HashSet<String>();

		eliminatedPets.add("C3");
		eliminatedPets.add("D2");
		eliminatedPets.add("C1");

		assertFalse(viewer.isSatisfiedByEliminating(eliminatedPets));
	}

	/**
	 * Tests the case where the list of eliminated pets includes the throwOut
	 * but not the favorite.
	 */
	public void testIsSatisfiedByEliminatingThrowOut()
	{
		Viewer viewer = new Viewer("C1", "D2");
		Set<String> eliminatedPets = new HashSet<String>();

		eliminatedPets.add("C3");
		eliminatedPets.add("D2");

		assertTrue(viewer.isSatisfiedByEliminating(eliminatedPets));
	}

	/**
	 * Tests the case where the list of eliminated pets includes the favorite
	 * but not the throwOut.
	 */
	public void testIsSatisfiedByEliminatingFavorite()
	{
		Viewer viewer = new Viewer("C1", "D2");
		Set<String> eliminatedPets = new HashSet<String>();

		eliminatedPets.add("C3");
		eliminatedPets.add("C1");

		assertFalse(viewer.isSatisfiedByEliminating(eliminatedPets));
	}

	/**
	 * Tests the case where the list of eliminated pets includes neither the
	 * favorite nor the throwOut.
	 */
	public void testIsSatisfiedByEliminatingNeither()
	{
		Viewer viewer = new Viewer("C1", "D2");
		Set<String> eliminatedPets = new HashSet<String>();

		eliminatedPets.add("C3");
		eliminatedPets.add("D1");

		assertFalse(viewer.isSatisfiedByEliminating(eliminatedPets));
	}

}
