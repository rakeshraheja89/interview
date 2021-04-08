package level1;

import java.util.stream.IntStream;

public class PrintEvenNumberByJava8 {
	
	public static void main (String arr[])
	{
		IntStream.range(1, 100).filter(n->n%2==0).forEach(System.out::println);
		
		
	}

}
