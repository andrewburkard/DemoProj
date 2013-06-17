package Group.DemoProj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algs
{

	public static int maxViewers(Show show)
	{
		int maxViewers = 0;

		Set<Set<String>> allPossibleEliminations = generateAllPossibleEliminations(show);
		for (Set<String> eliminated : allPossibleEliminations)
		{
			int viewersPleased = numViewersPleased(eliminated, show);
			if (viewersPleased > maxViewers)
				maxViewers = viewersPleased;
		}

		return maxViewers;
	}

	/**
	 * @param show
	 *            A show that determines what the posisble eliminations are. The
	 *            total number will be 2^(#C + #D)
	 * @return A list containing each posisble elimination, each of which is a
	 *         set.
	 */
	private static Set<Set<String>> generateAllPossibleEliminations(Show show)
	{
		Set<String> allPets = show.allPets();

		return powerSet(allPets);
	}

	private static <T> Set<Set<T>> powerSet(Set<T> originalSet)
	{
		Set<Set<T>> sets = new HashSet<Set<T>>();
		if (originalSet.isEmpty())
		{
			sets.add(new HashSet<T>());
			return sets;
		}

		List<T> list = new ArrayList<T>(originalSet);
		T head = list.get(0);
		Set<T> rest = new HashSet<T>(list.subList(1, list.size()));

		for (Set<T> set : powerSet(rest))
		{
			Set<T> newSet = new HashSet<T>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

	private static int numViewersPleased(Set<String> eliminated, Show show)
	{
		int viewersPleased = 0;

		for (Viewer viewer : show.getViewers())
		{
			if (viewer.isSatisfiedByEliminating(eliminated))
				viewersPleased++;
		}
		return viewersPleased;
	}
}
