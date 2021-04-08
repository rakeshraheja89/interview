package level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintEvenNumberWithLembda {

	public static void main(String arr[]) {
		String number = "1234567890";
		IntStream.range(0, number.length()).filter(n -> n % 2 == 0).forEach(System.out::println);
		//not working
		number.chars().boxed().filter(n -> n % 2 == 0).forEach(System.out::println);
		flatmap();
		onemoreflatmap();
	}
	
	//sum program
	
	public static void sum()
    {
        List<Integer> numbers
            = Arrays.asList(11, 22, 33, 44,
                            55, 66, 77, 88,
                            99, 100);
        int factor = 2;
        System.out.println(
            numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(e -> e * factor)
                .sum());
    }
	
	public static void flatmap()
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                                          "1", "2.3");
  
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(num->Stream.of(num)).forEach(System.out::println);
       // list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);
        list.stream().forEach(System.out::println);
    }
	
	public static void onemoreflatmap()
    {   
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
          
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
  
        System.out.println("The Structure before flattening is : " +
                                                  listOfListofInts);
          
        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                                    .flatMap(list -> list.stream())
                                    .collect(Collectors.toList());
  
        System.out.println("The Structure after flattening is : " +
                                                         listofInts);
    }
}