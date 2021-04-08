package level1;

public class OccurencesOfaCharacterUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="geeksforgeeks";
		char ch='e';
		System.out.println("character occurence is :: "+str.chars().filter(c->c==ch).count());
	}

}
