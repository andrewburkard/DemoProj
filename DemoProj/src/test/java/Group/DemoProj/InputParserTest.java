package Group.DemoProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import junit.framework.TestCase;

public class InputParserTest
    extends TestCase
{
    public void testReadInput()
    {
        // TODO
        FileInputStream in;
        try
        {
            in = new FileInputStream(new File("input.txt"));
            List<Show> shows = InputParser.readInput(in);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void testReadShow()
    {
        Scanner in = new Scanner("1 1 2\nC1 D1\nD1 C1");

        try
        {
            Show show = InputParser.readShow(in);
            assertEquals(show.getnCats(), 1);
            assertEquals(show.getViewers().get(0).getFavorite(), "C1");
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void testSetShowAttributes()
    {
        Show show = new Show();
        show = InputParser.setShowAttributes(show, "4 7 12");

        assertEquals(4, show.getnCats());
        assertEquals(7, show.getnDogs());
        assertEquals(12, show.getnViewers());
    }


    public void testSetViewerAttributes()
    {
        Viewer viewer = new Viewer();
        viewer = InputParser.setViewerAttributes(viewer, "D4 C2");

        assertEquals("D4", viewer.getFavorite());
        assertEquals("C2", viewer.getThrowOut());
    }

}
