package level2;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 5, 7 };
		int n1 = arr1.length;

		int[] arr2 = { 1, 4, 6, 8 };
		int n2 = arr2.length;

		int[] arr3 = new int[n1 + n2];
		mergeArrays(arr1, arr2, n1, n2, arr3);
	}

	private static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		// List<int[]> arr1List=Arrays.asList(arr1);
		// TODO Auto-generated method stub

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
				// System.out.println(arr3[--k]);
			} else {
				arr3[k++] = arr2[j++];
				// System.out.println(arr3[--k]);
			}
		}

		System.out.println(i);
		// Store remaining elements of first array
		while (i < n1)
			arr3[k++] = arr1[i++];
		System.out.println(j);
		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];

		System.out.println("Array after merging");
		for (int x = 0; x < n1 + n2; x++)
			System.out.print(arr3[x] + " ");
	}
}
