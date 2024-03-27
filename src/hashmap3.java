import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap3 {

	public static void main(String args[]) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("india", 120);
		map.put("china", 130);
		map.put("uk", 140);
		map.put("russia", 150);
		System.out.println(map);

		map.put("india", 190);
		System.out.println(map);

		if (map.containsKey("china")) {
			System.out.println("the key is present in map");
		} else {
			System.out.println("the key is not present in the map");
		}

		if (map.containsKey("indonesia")) {
			System.out.println("the key is present in map");
		} else {
			System.out.println("the key is not present in the map");
		}
		System.out.println(map.get("india"));
		System.out.println(map.get("korea"));

		int arr[] = { 10, 23, 12 };
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		Set<String>Keys=map.keySet();
		for(String key:Keys) {
			System.out.println(key+" "+ map.get(Keys));
		}
		map.remove("china");
		System.out.println(map);
	}
	
}
