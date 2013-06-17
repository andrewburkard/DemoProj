package Group.DemoProj;

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
