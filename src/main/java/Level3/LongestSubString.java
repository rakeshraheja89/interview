package Level3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GEEKSFORGEEKS";
		System.out.println(findLongestSubString(str));
		String str1 = "clemanticsacap";
		System.out.println(findLongestSubString(str1));
		String str2 = "clementisacap";
		System.out.println(findLongestSubString(str2));
	}

	public static String findLongestSubString(String str) {
		Map<Character, Integer> lastSeen = new HashMap<Character, Integer>();
		int[] longest = { 0, 1 };
		int startIdx = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (lastSeen.containsKey(c)) {
				startIdx = Math.max(startIdx, lastSeen.get(c) + 1);
				System.out.println("startIdx:: " + startIdx);
			}
			System.out.println("if cond::" + (longest[1] - longest[0] < i + 1 - startIdx));
			if (longest[1] - longest[0] < i + 1 - startIdx) {
				longest = new int[] { startIdx, i + 1 };
				System.out.println("longest:: " + longest[0]);
				System.out.println("startIdx inside:: " + startIdx);
				System.out.println("i inside:: " + i);
			}
			lastSeen.put(c, i);
		}
		String result = str.substring(longest[0], longest[1]);
		// Write your code here
		return result;
	}
}
