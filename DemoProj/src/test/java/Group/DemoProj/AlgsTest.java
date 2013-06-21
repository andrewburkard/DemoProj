package Group.DemoProj;

import java.util.HashSet;
import java.util.Set;


import junit.framework.TestCase;

public class AlgsTest extends TestCase
{

	public void setUp(){
		//emptyList = new java.util.ArrayList();
	}
	
	 public void tearDown(){
	//	emptyList = null;
	}

	public void testPowerSet()
	{
		Set<Integer> mySet = new HashSet<Integer>();
		 mySet.add(1);
		 mySet.add(2);
		 mySet.add(3);
		 Set<Set<Integer>> pSet = Algs.powerSet(mySet);
		 
		assertTrue(pSet.contains(mySet));
		assertTrue(pSet.size() == Math.pow(2, mySet.size()));
	}
	
	public void testMaxViewers()
	{
		Viewer viewer1 = new Viewer();
		Show show1 = new Show();
		show1.setnCats(2);
		show1.setnDogs(3);
		show1.setnViewers(10);
		Algs.maxViewers(show1);
		assertTrue(show1.getnViewers() == 10);
	}
	
	public void testGenerateAllPossibleEliminations()
	{
		Show show1 = new Show();
		show1.setnCats(1);
		show1.setnDogs(2);
		show1.setnViewers(3);
		Set<Set<String>> allPos = Algs.generateAllPossibleEliminations(show1);
		assertTrue(allPos.size() == Math.pow(2, show1.getnCats() + show1.getnDogs()));
	}
}
