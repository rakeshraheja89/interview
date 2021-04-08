package level2;

public class RobotCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String move = "UDDLLRUUUDUURUDDUULLDRRRR";
		finalPosition(move);
	}

	private static void finalPosition(String move) {
		// TODO Auto-generated method stub
		int left = 0, right = 0, up = 0, down = 0;
		for (int i = 0; i < move.length(); i++) {
			if (move.charAt(i) == 'U') {
				up++;
			} else if (move.charAt(i) == 'D') {
				down++;
			} else if (move.charAt(i) == 'L') {
				left++;
			} else if (move.charAt(i) == 'R') {
				right++;
			} else {

			}
			 // required final position of robot
	        System.out.println("current Position: ("
	                           + (right - left) + ", "
	                           + (up - down) + ")");
		}
		 // required final position of robot
        System.out.println("Final Position: ("
                           + (right - left) + ", "
                           + (up - down) + ")");

	}

}
