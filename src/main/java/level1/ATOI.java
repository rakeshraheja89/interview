package level1;

public class ATOI {

	public static void main(String arr[]) {
		String input = "1235";
		String input1 = "-1235";
		String input2 = "    123";
		String input3 = "10.9";
		String input4 = "11111111111111111111";
		//System.out.println(atoi(input));
		//System.out.println(atoi(input1));
		//System.out.println(atoi(input2));
		System.out.println(atoi(input3));
		System.out.println(atoi(input4));
	}

	private static int atoi(String input) {
		// String to integer
		int output = 0;
		if (input == null && input.length() < 1) {
			return output;
		}
		input=input.trim();
		char flag = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '-') {
				flag = '-';
			} else if (input.charAt(i) == '+') {
				flag = '+';
			} else {
				//remember this
				output = output * 10 + input.charAt(i) - '0';
			}
			//System.out.println(output);
		}
		if (flag == '-')
			output = -output;
		// handle max and min
		if (output > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (output < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		// Integer.parseInt(str)
		return output;
	}
}
