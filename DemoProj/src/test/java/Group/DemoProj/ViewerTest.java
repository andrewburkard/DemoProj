package Group.DemoProj;

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

}
