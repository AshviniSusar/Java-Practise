import java.util.HashMap;

public class Hashmap {

	public static void main(String args[]) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("vishal", 10);
		map.put("rahul", 50);
		map.put("vaibhav", 80);

		System.out.println("the map size is:-  " + map.size());

		System.out.println(map.size());

		System.out.println(map);

		if (map.containsKey("vishal")) {

			// Mapping
			Integer b = map.get("vishal");

			// Printing value for the corresponding key
			System.out.println("value for key" + " \"vishal\" is:- " + b);
		}
	}

}
