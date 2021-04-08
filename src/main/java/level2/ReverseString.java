package level2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = reverseWordsInString("tim is great");
		System.out.println(output);

	}

	// tim is great
	public static String reverseWordsInString(String string) {
		ArrayList<String> words = new ArrayList<String>();
		int startofword = 0;
		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			if (character == ' ') {
				words.add(string.substring(startofword, i));
				startofword = i;
			} else if (string.charAt(startofword) == ' ') {
				words.add(" ");
				startofword = i;
			}
		}
		// Write your code here.
		words.add(string.substring(startofword));
		Collections.reverse(words);
		//System.out.println(words);
		return String.join("", words);
	}
}
