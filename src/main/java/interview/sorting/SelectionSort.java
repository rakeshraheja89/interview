package sorting;

import java.util.List;

/*
arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64

 */
public class SelectionSort {
    public static void main(String arr[]) {
        SelectionSort ob= new SelectionSort();
        int input[] = {64, 25, 12, 22, 11};
        ob.sort(input);
        ob.printArray(input);
    }

    void sort(int input[]) {
        int size = input.length;
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j < size; j++) {
                if (input[min_idx] > input[j]) {
                    min_idx = j;
                }
            }

                int temp = input[min_idx];
                input[min_idx] = input[i];
                input[i] = temp;
            }
        }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
