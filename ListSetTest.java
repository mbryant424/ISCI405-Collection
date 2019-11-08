 package Collection;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListSetTest {

	public static void main(String[] args) {
		test(new ArrayList<Integer>());
		test(new LinkedList<Integer>());
		test(new HashSet<Integer>());
		test(new TreeSet<Integer>());
	}

	static void test(Collection<Integer> c) {
		c.add(new Integer(2));
		c.add(new Integer(1));
		c.add(new Integer(1));
		c.add(new Integer(16));
		show(c);
	}

	/**
	 * Shows the content of the given {@code Collection}.
	 * 
	 * @param c
	 *            a {@code Collection}
	 */
	static <T> void show(Collection<T> c) {
		System.out.println(c.getClass().getSimpleName() + ": " + c);
		Iterator<T> i = c.iterator(); // use of Iterator<T>
		while (i.hasNext())
			System.out.print(i.next() + " ");
		System.out.println();
		for (T j : c) // use of Iterable<T>
			System.out.print(j + " ");
		System.out.println();
		System.out.println();
	}

}
