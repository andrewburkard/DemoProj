package Group.DemoProj;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

public class AlgsTest extends TestCase
{

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
		
	}
	
	public void testGenerateAllPossibleEliminations()
	{
		
	}
}
