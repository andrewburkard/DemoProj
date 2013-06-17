package Group.DemoProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 * 
 */
public class Driver
{
	public static void main(String[] args)
	{
	
		try
		{
			FileInputStream in = new FileInputStream(new File("input.txt"));
			List<Show> shows = InputParser.readInput(in);

			for (Show show : shows)
				System.out.println(Algs.maxViewers(show));
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
