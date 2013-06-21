package Group.DemoProj;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

public class AlgsTest extends TestCase
{
	@Before
	public void setUp(){
		emptyList = new java.util.ArrayList();
	}
	
	@After public void tearDown(){
		emptyList = null;
	}

	public void testPowerSet()
	{
		Set<Integer> mySet = new HashSet<Integer>();
		 mySet.add(1);
		 mySet.add(2);
		 mySet.add(3);
		 for (Set<Integer> s : Algs.powerSet(mySet)) {
		     System.out.println(s);
		 }
		
		assertTrue(mySet.contains(1));
		assertTrue(mySet.contains(2));
		assertTrue(mySet.contains(3));
		assertFalse(mySet.contains(0));
	}
	
	public void testMaxViewers()
	{
		Show show1 = new Show();
		show1.setnCats(2);
		show1.setnDogs(3);
		show1.setnViewers(10);
		Algs.maxViewers(show1);
		assertTrue(show1.getViewers().contains(10));
	}
	
	public void testGenerateAllPossibleEliminations()
	{
		Show show1 = new Show();
		show1.setnCats(5);
		show1.setnDogs(13);
		show1.setnViewers(20);
		Algs.generateAllPossibleEliminations(show1);
	}
}
