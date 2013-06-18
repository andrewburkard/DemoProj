package Group.DemoProj;

import java.util.List;
import java.util.Set;

public class Viewer
{

	private String favorite;
	private String throwOut;

	public Viewer()
	{

	}

	public Viewer(String favorite, String throwOut)
	{
		this.favorite = favorite;
		this.throwOut = throwOut;

	}

	/**
	 * @param eliminatedPets
	 *            A list of pets to be eliminated
	 * @return true if the eliminated pets contains throwOut but does not
	 *         contain favorite.
	 */
	public boolean isSatisfiedByEliminating(Set<String> eliminatedPets)
	{
		return eliminatedPets.contains(throwOut)
				&& !eliminatedPets.contains(favorite);
	}

	public String getFavorite()
	{
		return favorite;
	}

	public void setFavorite(String favorite)
	{
		this.favorite = favorite;
	}

	public String getThrowOut()
	{
		return throwOut;
	}

	public void setThrowOut(String throwOut)
	{
		this.throwOut = throwOut;
	}

}
