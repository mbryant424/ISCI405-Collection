package Collection;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListSetTest3 {

	static class C implements Comparable<C> {
		Integer i;

		C(Integer i) {
			this.i = i;
		}

		public String toString() {
			return i.toString();
		}

		public int hashCode() { // for HashSet
			return i.hashCode();
		}

		public boolean equals(Object o) { // for HashSet
			if (o instanceof C)
				return i.equals(((C) o).i);
			else
				return false;
		}

		@Override
		public int compareTo(C o) { // for TreeSet
			return i.compareTo(o.i);
		}
	}

	public static void main(String[] args) {
		test(new ArrayList<C>());
		test(new LinkedList<C>());
		test(new HashSet<C>());
		test(new TreeSet<C>());
	}

	static void test(Collection<C> c) {
		c.add(new C(new Integer(2)));
		c.add(new C(new Integer(1)));
		c.add(new C(new Integer(1)));
		c.add(new C(new Integer(16)));
		ListSetTest.show(c);
	}

}
