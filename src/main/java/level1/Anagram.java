package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
		// List<List<String>> output = new ArrayList<List<String>>();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		if (strs.length == 0)
			// return new ArrayList();
			System.out.println("empty");
		List<List<String>> result  = groupAnagram(strs);
		List<List<String>> result1  = groupAnagramWithJava8(strs);
       //if output is 
	}
	// TODO Auto-generated method stub

	private static List<List<String>> groupAnagram(String[] strs) {
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key))
				ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		System.out.println(ans.values());
		return new ArrayList<>(ans.values());
	}

	private static List<List<String>>  groupAnagramWithJava8(String[] strs) {
		Map<String, ArrayList> ans = new HashMap<String, ArrayList>();
		// string - sort -- map me add
		List<String> sortedList = Arrays.stream(strs).map(str -> str.toCharArray()).map(chars -> {
			Arrays.sort(chars);
			return new String(chars);
		}).collect(Collectors.toList());
		/*
		 * sortedList.forEach(l->{ map.putIfAbsent(l, new ArrayList<>());
		 * map.get(l).add(l); });
		 */
		for (int i = 0; i < strs.length; i++) {
			String key = sortedList.get(i);
			if (!ans.containsKey(sortedList.get(i)))
				ans.put(key, new ArrayList());
			ans.get(key).add(strs[i]);
		}
		System.out.println(ans);
		/*
		 * for (String entry: ans.entrySet()) {
		 * System.out.println(entry.getValue().stream() .map(index -> words[index])
		 * .collect(Collectors.toList())); }
		 */

		return new ArrayList<>(ans.values());

		/*
		 * for (int i = 0; i < sortedList.size(); i++) {
		 * map.putIfAbsent(sortedList.get(i), new ArrayList<>());
		 * map.get(sortedList.get(i)).add(i); }
		 */
		// map.entrySet().forEach(System.out::println);
	}

}
