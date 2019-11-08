package Collection;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testMap(new HashMap<Integer, String>());
		testMap(new TreeMap<Integer, String>());
	}

	protected static void testMap(Map<Integer, String> map) {
		// insert key-value pairs
		put(map, new Integer(2));
		put(map, new Integer(1));
		put(map, new Integer(1));
		put(map, new Integer(16));

		map.remove(2);
		map.put(3, "*");

		// display the map
		System.out.println(map.getClass().getSimpleName() + ": " + map);

		// display keys
		for (Integer i : map.keySet())
			System.out.print(i + " ");
		System.out.println("% keys");

		// display values
		for (String i : map.values())
			System.out.print(i + " ");
		System.out.println("% values");

		// display (key, value) pairs
		for (Entry<Integer, String> i : map.entrySet())
			System.out.print(i + " ");
		System.out.println("% key-value pairs");
		System.out.println();
	}

	static void put(Map<Integer, String> map, Integer i) {
		map.put(i, "[" + i + ", ...]");
	}

}
