package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Panagram {

	public static void main(String arr[]) {
		String str = "welcome to geeksforgeeks";
		// Output : abdhijnpquvxyz
		ArrayList<Character> missing = findPanagram(str);
		if (missing.size() >= 1) {
			for (Character character : missing) {
				System.out.print(character);
			}
		}

		// 2nd way using hashset
		//findPanagramUsingHashSet(str);
	}

	private static void findPanagramUsingHashSet(String str) {
		// TODO Auto-generated method stub
		String[] input = str.replaceAll(" ", "").split("");
		String[] alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		HashSet<String> alphabetSet = new HashSet<String>(Arrays.asList(alphabets));
		HashSet<String> inputSet = new HashSet<String>(Arrays.asList(input));
		alphabetSet.removeAll(inputSet);
		System.out.println(alphabetSet.toString());
		
	}

	private static ArrayList<Character> findPanagram(String str) {
		// TODO Auto-generated method stub
		final int MAX_CHARS = 26;
		boolean[] present = new boolean[MAX_CHARS];
		ArrayList<Character> charsList = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('A' <= c && c <= 'Z')
				present[c - 'A'] = true;
			else if ('a' <= c && c <= 'z')
				present[c - 'a'] = true;
		}
		for (int i = 0; i < MAX_CHARS; i++) {
			if (present[i] == false) {
				charsList.add((char) (i + 'a'));
			}
		}
		return charsList;
	}

}
