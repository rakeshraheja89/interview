package level1;

//not done
//chaayos interview
public class FindWordCount {

	public static int printWord(String input) {
		int count = 0;
		String[] words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			boolean flag=true;
			for (int j = 0; j < str.length(); j++) {
				if(Character.isDigit(str.charAt(j)))
				{
					System.out.println(str.charAt(j));
					flag=false;
					break;
				}
			}
			if(flag)
			count++;
			// char[] characters = words[i].toCharArray();
			/*
			 * if(Character.isLetter(characters[i])) { continue; }
			 */

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is rakesh raheja?123";
		System.out.println(printWord(s));
	}

}
