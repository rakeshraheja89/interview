package level1;

import java.util.*;
import java.util.stream.Collectors;

//input two arrays
//check second one is sub sequence of first or not
//condition : should be in same sequence
//eg : 4,5,6,3,8,9,0,-7
//5,3,9,-7
//output = true
public class ValidateSequence {

    public static void main (String arr[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of inputs in array");
        int n = in.nextInt();
        int array[] = new int[n];
        List arrayList1=new ArrayList<Integer>();
        List sequence1=new ArrayList<Integer>();
        System.out.println("Enter elements in array");
        //List<Integer> arrayList=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            arrayList1.add(array[i]);
        }
        System.out.println("Enter number of inputs in array");
        int n2 = in.nextInt();
        int seq[] = new int[n2];
        System.out.println("Enter elements in array");
        for (int i = 0; i < n2; i++) {
            seq[i] = in.nextInt();
            sequence1.add(seq[i]);
        }
        //from java 8
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> sequence=Arrays.stream(seq).boxed().collect(Collectors.toList());
        boolean output = isValidSequence(arrayList,sequence);
        System.out.println(output);
    }

    private static boolean isValidSequence(List<Integer> array1, List<Integer> seq) {
        int count=seq.size();
        int counter = 0;
        for(int num : seq)
        {
            if(array1.contains(num))
            {
                counter++;
            }
        }
        if(count==counter) {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
