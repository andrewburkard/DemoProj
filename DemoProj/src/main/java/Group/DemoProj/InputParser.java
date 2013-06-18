package Group.DemoProj;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputParser
{

	public static List<Show> readInput(InputStream inputStream)
			throws IOException
	{
		Scanner in = new Scanner(inputStream);

		int numShows = Integer.parseInt(in.nextLine());
		
		List<Show> shows = new ArrayList<Show>(numShows);

		for (int i = 0; i < numShows; i++)
			shows.add(readShow(in));

		return shows;
	}

	public static Show readShow(Scanner in) throws IOException
	{
		Show show = new Show();
		String str = in.nextLine();
		show = setAttributes(show, str);

		String s = "";
		for (int i = 0; i < show.getnViewers(); i++)
		{
			s = in.nextLine();
			Viewer viewer = new Viewer();
			viewer = setAttributes(viewer, s);

			show.addViewer(viewer);
		}

		return show;
	}

	public static Show setAttributes(Show show, String attributes)
	{
		StringTokenizer tokenizer = new StringTokenizer(attributes);
		show.setnCats(Integer.parseInt(tokenizer.nextToken()));
		show.setnDogs(Integer.parseInt(tokenizer.nextToken()));
		show.setnViewers(Integer.parseInt(tokenizer.nextToken()));

		return show;
	}

	public static Viewer setAttributes(Viewer viewer, String attributes)
	{
		StringTokenizer tokenizer = new StringTokenizer(attributes);
		viewer.setFavorite(tokenizer.nextToken());
		viewer.setThrowOut(tokenizer.nextToken());

		return viewer;
	}

}
