package Group.DemoProj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Show
{
	private List<Viewer> viewers;
	private int nCats;
	private int nDogs;
	private int nViewers;

	public Show(int nCats, int nDogs, int nViewers)
	{
		this.nCats = nCats;
		this.nDogs = nDogs;
		this.nViewers = nViewers;

		viewers = new ArrayList<Viewer>(nViewers);
	}

	public Set<String> allPets()
	{
		Set<String> pets = new HashSet<String>();
		for (int i = 1; i <= nCats; i++)
			pets.add("C" + Integer.toString(i));
		for (int i = 1; i <= nDogs; i++)
			pets.add("D" + Integer.toString(i));
		
		return pets;

	}

	public List<Viewer> getViewers()
	{
		return viewers;
	}

	public void setViewers(List<Viewer> viewers)
	{
		this.viewers = viewers;
	}

	public int getnCats()
	{
		return nCats;
	}

	public void setnCats(int nCats)
	{
		this.nCats = nCats;
	}

	public int getnDogs()
	{
		return nDogs;
	}

	public void setnDogs(int nDogs)
	{
		this.nDogs = nDogs;
	}

	public int getnViewers()
	{
		return nViewers;
	}

	public void setnViewers(int nViewers)
	{
		this.nViewers = nViewers;
	}

}
