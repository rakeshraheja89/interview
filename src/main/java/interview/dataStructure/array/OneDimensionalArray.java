package com.dataStructure.array;

import java.util.Arrays;

/*
Let size of array be n.
Accessing Time: O(1) [This is possible because elements
                      are stored at contiguous locations]
Search Time:   O(n) for Sequential Search:
               O(log n) for Binary Search [If Array is sorted]
Insertion Time: O(n) [The worst case occurs when insertion
                     happens at the Beginning of an array and
                     requires shifting all of the elements]
Deletion Time: O(n) [The worst case occurs when deletion
                     happens at the Beginning of an array and
                     requires shifting all of the elements]

 */
public class OneDimensionalArray {

    /**
     *
     */
    final static int[] arr1 = new int[5];
    static int[] arr2 ={1,2,3,4,5};

  //  Time Complexity= O(n);


    public static void main (String arr[])
    { 
        var value ="121";

        Arrays.stream(arr2).forEach(x->System.out.println(x));

    }
}
