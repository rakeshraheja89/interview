package com.dataStructure.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NearestPair {

    public static void main(String[] args)
    {
        NearestPair np = new NearestPair();
        //int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int arr[] = { 15, 21, 4, 8 };
        var list = Arrays.asList(arr);
        List<Integer> xyz= List.of(1,2,3,4);
        var list1 = xyz.stream().sorted().collect(Collectors.toList());
        list.stream().sorted();
        int n = arr.length;
        int sum = 8;
        np.findNearestPair(arr, n, sum);
    }

    private void findNearestPair(int[] arr, int n, int sum) {

        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++) {
                if (minDiff > arr[j] - arr[i]) {
                    minDiff = arr[j] - arr[i];
                    System.out.println("minDiff is : "+minDiff);
                }
            }
        }
    }

}
