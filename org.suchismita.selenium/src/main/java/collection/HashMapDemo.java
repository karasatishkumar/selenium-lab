package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "abc");
		hs.put(2, "suchi");
		hs.put(3, "smita");
		hs.put(5, "smita");
		hs.put(3, "hello"); // duplicate values won't print
		System.out.println(hs);

		/*
		 * Collection<String> list = hs.values(); // remove duplicate value
		 * for(Iterator<String> it = list.iterator();it.hasNext();) {
		 * if(Collections.frequency(list, it.next())>1) it.remove(); }
		 */
		/*
		 * hs.remove(1); System.out.println(hs);
		 */
		java.util.Set<Integer> str = hs.keySet();
		for (Integer str1 : str) {
			System.out.println(str1 + " " + hs.get(str1));
		}
		System.out.println(hs.get(2));
		System.out.println(hs.size());

	}

}
