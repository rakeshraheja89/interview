package level2;

class LongestPalindromSequence {
	
	public static void main (String arr[])
    {
		String str="";
		//n^3 (time) and O(n) space
		longestPalindromicSubstring(str);
    }
	public static String longestPalindromicSubstring(String str) {
		// Write your code here.
		String longest = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String subString = str.substring(i, j + 1);
				if (subString.length() > longest.length() && isPalindrome(subString)) {
					longest = subString;
				}
			}
		}
		return longest;
	}

	public static boolean isPalindrome(String str) {
		int leftidx = 0;
		int rightidx = str.length() - 1;
		while (leftidx < rightidx) {
			if (str.charAt(leftidx) != str.charAt(rightidx)) {
				return false;
			}
			leftidx++;
			rightidx--;
		}
		return true;
	}
}