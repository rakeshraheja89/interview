package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedSquaredArray {

	public static void main (String arr[])
	{
		int[] inputArray = {1,2,3,4,5,6,7,8,9};
		//using java8
		squared(inputArray);
		//using old school way
		inputArray=sortedSquaredArray(inputArray);
	}

	private static void squared(int[] inputArray) {
		// TODO Auto-generated method stub
		//Arrays.stream(inputArray).boxed().toArray( Integer[]::new );
		//to convert int to integer
		Integer[] object=IntStream.of(inputArray).boxed().toArray( Integer[]::new );
		Integer[] object1=Arrays.stream(inputArray).boxed().toArray(Integer[]::new);
		System.out.println("using java8");
		List<Integer> list  = Arrays.stream(inputArray).boxed().collect( Collectors.toList() );
		list.stream()
	       .distinct()
	       .forEach(n -> System.out.println((int)Math.pow(n, 2)));
	}
	
	  public static int[] sortedSquaredArray(int[] array) {
		  System.out.println("old way");
			//int[array.size] finalArray= new 
			for(int i=0;i<array.length;i++)
			{
				array[i]=array[i]*array[i];
				System.out.println(array[i]);
			}
			Arrays.sort(array);
	    // Write your code here.
	    return array;
	  }
}
