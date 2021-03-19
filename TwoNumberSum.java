package algoexpert.easy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoNumberSum {
    //why public --> can be access easily from anywhere
    //static - no need of object
    //void - no return
    //main  - after java 7 its look for main
    //string arr -- get input
    public static void main(String arr[]) {
        Scanner in = new Scanner(System.in);
        //system - class
        //out  -- object
        //println  -- method
        System.out.println("Enter number of inputs in array");
        int n = in.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println("Enter target value ");
        int targetsum = in.nextInt();
        int solution1[] = twoNumberSum(numbers, targetsum);

        int solution2[] = twoNumberSumWithOLogNComplexiy(numbers, targetsum);
        for (int x = 0; x < solution2.length; x++) {
            System.out.println(solution2[x]);
        }

        int solution3[] = twoNumberSumWithONComplexiy(numbers, targetsum);
        for (int x = 0; x < solution3.length; x++) {
            System.out.println(solution3[x]);
        }
    }

    //o(n2) - time complexity , o(1) space complexity
    private static int[] twoNumberSum(int[] numbers, int targetsum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetsum) {
                    System.out.println("i is---> " + numbers[i] + " j is ---> " + numbers[j]);
                    return new int[]{numbers[i], numbers[j]};
                }
            }
        }
        return new int[0];
    }

    //o(nlogn) - time complexity , o(1) space complexity
    private static int[] twoNumberSumWithOLogNComplexiy(int[] numbers, int targetsum) {
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == targetsum) {
                return new int[]{numbers[left] + numbers[right]};
            } else if (currentSum < targetsum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    //o(n) - time complexity , o(n) space complexity
    private static int[] twoNumberSumWithONComplexiy(int[] numbers, int targetsum) {
        Set<Integer> numberSet = new HashSet<Integer>();
        for (int num : numbers)
        {
            int potentialSum = targetsum - num;
            if(numberSet.contains(potentialSum))
            {
                return new int[]{num,potentialSum};
            }
            else
            {
                numberSet.add(num);
            }
        }
        return new int[0];
    }
}
