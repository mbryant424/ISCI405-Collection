package Collection;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListSetTest2 {

	static class C {
		Integer i;

		C(Integer i) {
			this.i = i;
		}

		public String toString() {
			return i.toString();
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
