package step8.polymorphism.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteratortest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");

		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
		Integer key = it.next();
		String value = map.get(key);
		System.out.println(key + " - " + value);
		}



	}

}
